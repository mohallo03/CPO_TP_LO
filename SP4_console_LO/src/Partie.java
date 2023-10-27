import java.util.Scanner;

public class Partie {
    private Joueur[] listeJoueurs;
    private Joueur joueurCourant;
    private PlateauDeJeu plateau;

    // Constructeur
    public Partie(Joueur joueur1, Joueur joueur2) {
        listeJoueurs = new Joueur[2];
        listeJoueurs[0] = joueur1;
        listeJoueurs[1] = joueur2;
        plateau = new PlateauDeJeu();
    }

    // Méthode pour attribuer une couleur aléatoire aux joueurs
    public void attribuerCouleurAuxJoueurs() {
        int random = (int) (Math.random() * 2);
        listeJoueurs[0].affecterCouleur(random == 0 ? "rouge" : "jaune");
        listeJoueurs[1].affecterCouleur(random == 0 ? "jaune" : "rouge");
    }

    // Méthode pour créer et affecter 30 jetons au joueur
    public void creerEtAffecterJeton(Joueur joueur) {
        for (int i = 0; i < 30; i++) {
            Jeton jeton = new Jeton(joueur.lireCouleur());
            joueur.ajouterJeton(jeton);
        }
    }

    // Méthode pour placer des trous noirs et des désintégrateurs sur le plateau
    public void placerTrousNoirsEtDesintegrateurs() {
        int countTrousNoirs = 0;
        int countDesintegrateurs = 0;
        
        while (countTrousNoirs < 5) {
            int x = (int) (Math.random() * 6);
            int y = (int) (Math.random() * 7);
            
            if (!plateau.presenceTrouNoir(x, y) && !plateau.presenceDesintegrateur(x, y)) {
                plateau.placerTrouNoir(x, y);
                plateau.placerDesintegrateur(x, y);
                countTrousNoirs++;
                countDesintegrateurs++;
            }
        }
        
        while (countDesintegrateurs < 5) {
            int x = (int) (Math.random() * 6);
            int y = (int) (Math.random() * 7);
            
            if (!plateau.presenceDesintegrateur(x, y)) {
                plateau.placerDesintegrateur(x, y);
                countDesintegrateurs++;
            }
        }
    }

    // Méthode pour initialiser la partie
    public void initialiserPartie() {
        attribuerCouleurAuxJoueurs();
        creerEtAffecterJeton(listeJoueurs[0]);
        creerEtAffecterJeton(listeJoueurs[1]);
        placerTrousNoirsEtDesintegrateurs();
    }

    // Méthode pour lancer la partie
    public void lancerPartie() {
        initialiserPartie();

        joueurCourant = listeJoueurs[0]; // Initialisation du joueur courant
        
        while (!plateau.grilleRemplie() && !plateau.etreGagnantePourCouleur(joueurCourant.lireCouleur())) {
            System.out.println("Tour de " + joueurCourant.getNom() + " (" + joueurCourant.lireCouleur() + ")");
            afficherGrille(); // Affiche l'état actuel de la grille
            
            // Saisie de l'action par le joueur courant
            int colonne = saisirColonne(); // Méthode pour demander au joueur de choisir une colonne
            int ligne = ajouterJetonDansColonne(joueurCourant, colonne);
            
            // Vérification des règles
            if (ligne >= 0) {
                if (plateau.etreGagnantePourCouleur(joueurCourant.lireCouleur())) {
                    System.out.println(joueurCourant.getNom() + " a gagné !");
                    afficherGrille();
                    break;
                }
                
                if (plateau.grilleRemplie()) {
                    System.out.println("La grille est pleine, c'est un match nul !");
                    afficherGrille();
                    break;
                }
                
                joueurCourant = (joueurCourant == listeJoueurs[0]) ? listeJoueurs[1] : listeJoueurs[0];
            } else {
                System.out.println("Colonne pleine. Réessayez.");
            }
        }
    }
    
    private int ajouterJetonDansColonne(Joueur joueur, int colonne) {
        return plateau.ajouterJetonDansColonne(joueur.getJetons().remove(0), colonne);
    }
    
    private void afficherGrille() {
        plateau.afficherGrilleSurConsole();
    }
    
    //%éthode pour le joueur choisisse une colonne
    public int saisirColonne()
    {
        Scanner scanner = new Scanner(System.in);
        int colonne;
        do {
            System.out.println("Choisissez une colonne (0-6) : ");
            colonne = scanner.nextInt();
        } while (colonne < 0 || colonne > 6);
        return colonne; 
    }
    
}
