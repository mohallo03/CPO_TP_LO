public class PlateauDeJeu {
    private CelluleDeGrille[][] grille; // Tableau de 6 par 7 objets de type CelluleDeGrille.

    // Constructeur pour initialiser la grille.
    public PlateauDeJeu() {
        grille = new CelluleDeGrille[6][7]; // Création du tableau de cellules.
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                grille[i][j] = new CelluleDeGrille(); // Initialisation de chaque cellule.
            }
        }
    }

    // Méthode pour ajouter un jeton dans une colonne.
    public int ajouterJetonDansColonne(Jeton jeton, int colonne) {
        int ligne = 5; // Commencer à la ligne la plus basse.
        while (ligne >= 0) {
            if (!grille[ligne][colonne].presenceJeton()) {
                if (grille[ligne][colonne].presenceTrouNoir()) {
                    grille[ligne][colonne].activerTrouNoir(); // Supprime le jeton lorsqu'il est placé sur un trou noir.
                }
                else{
                    grille[ligne][colonne].affecterJeton(jeton);
                }
                return ligne; // Renvoie l'indice de la ligne où le jeton a été ajouté.
            }
            ligne--;
        }
        return -1; // Renvoie -1 si la colonne est pleine.
    }
    

    // Méthode pour vérifier si la grille est pleine.
    public boolean grilleRemplie() {
        for (int i = 0; i < 7; i++) {
            if (!colonneRemplie(i)) {
                return false;
            }
        }
        return true;
    }

    // Méthode pour vider la grille et redonner les jetons aux joueurs.
    public void viderGrille(Joueur joueur1, Joueur joueur2) {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                if (grille[i][j].presenceJeton()) {
                    Jeton jeton = grille[i][j].recupererJeton();
                    if (jeton.lireCouleur().equals(joueur1.lireCouleur())) {
                        joueur1.ajouterJeton(jeton);
                    } else if (jeton.lireCouleur().equals(joueur2.lireCouleur())) {
                        joueur2.ajouterJeton(jeton);
                    }
                }
                grille[i][j].supprimerTrouNoir();
                grille[i][j].supprimerDesintegrateur();
            }
        }
    }

    // Méthode pour afficher la grille sur la console.
    public void afficherGrilleSurConsole() {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(grille[i][j].toString() + " ");
            }
            System.out.println();
        }
    }

    // Méthode pour vérifier la présence d'un jeton dans une cellule.
    public boolean presenceJeton(int x, int y) {
        return grille[x][y].presenceJeton();
    }

    // Méthode pour lire la couleur du jeton dans une cellule.
    public String lireCouleurDuJeton(int x, int y) {
        return grille[x][y].lireCouleurDuJeton();
    }

    // Méthode pour vérifier si la grille est gagnante pour une couleur.
    public boolean etreGagnantePourCouleur(String couleur) {
        return ligneGagnantePourCouleur(couleur) || colonneGagnantePourCouleur(couleur)
                || diagonaleMontanteGagnantePourCouleur(couleur) || diagonaleDescendanteGagnantePourCouleur(couleur);
    }

    // Méthode pour vérifier si une colonne est pleine.
    public boolean colonneRemplie(int colonne) {
        return grille[0][colonne].presenceJeton();
    }

    // Méthode pour vérifier la présence d'un trou noir dans une cellule.
    public boolean presenceTrouNoir(int x, int y) {
        return grille[x][y].presenceTrouNoir();
    }

    // Méthode pour placer un trou noir dans une cellule.
    public void placerTrouNoir(int x, int y) {
        grille[x][y].placerTrouNoir();
    }

    // Méthode pour supprimer un trou noir d'une cellule.
    public void supprimerTrouNoir(int x, int y) {
        grille[x][y].supprimerTrouNoir();
    }

    // Méthode pour placer un désintégrateur dans une cellule.
    public void placerDesintegrateur(int x, int y) {
        grille[x][y].placerDesintegrateur();
    }

    // Méthode pour supprimer un désintégrateur d'une cellule.
    public void supprimerDesintegrateur(int x, int y) {
        grille[x][y].supprimerDesintegrateur();
    }


    // Méthode pour vérifier la présence d'un désintégrateur dans une cellule.
    public boolean presenceDesintegrateur(int x, int y) {
        return grille[x][y].presenceDesintegrateur();
    }

    // Méthode pour supprimer un jeton d'une cellule.
    public void supprimerJeton(int x, int y) {
        grille[x][y].supprimerJeton();
    }

    // Méthode pour récupérer un jeton d'une cellule.
    public Jeton recupererJeton(int x, int y) {
        return grille[x][y].recupererJeton();
    }

    // Méthode pour vérifier si une ligne est gagnante pour une couleur.
    private boolean ligneGagnantePourCouleur(String couleur) {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 4; j++) {
                if (presenceJeton(i, j)
                        && lireCouleurDuJeton(i, j).equals(couleur)
                        && lireCouleurDuJeton(i, j + 1).equals(couleur)
                        && lireCouleurDuJeton(i, j + 2).equals(couleur)
                        && lireCouleurDuJeton(i, j + 3).equals(couleur)) {
                    return true;
                }
            }
        }
        return false;
    }

    // Méthode pour vérifier si une colonne est gagnante pour une couleur.
    private boolean colonneGagnantePourCouleur(String couleur) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 7; j++) {
                if (presenceJeton(i, j)
                        && lireCouleurDuJeton(i, j).equals(couleur)
                        && lireCouleurDuJeton(i + 1, j).equals(couleur)
                        && lireCouleurDuJeton(i + 2, j).equals(couleur)
                        && lireCouleurDuJeton(i + 3, j).equals(couleur)) {
                    return true;
                }
            }
        }
        return false;
    }

    // Méthode pour vérifier si une diagonale montante est gagnante pour une couleur.
    private boolean diagonaleMontanteGagnantePourCouleur(String couleur) {
        for (int i = 3; i < 6; i++) {
            for (int j = 0; j < 4; j++) {
                if (presenceJeton(i, j)
                        && lireCouleurDuJeton(i, j).equals(couleur)
                        && lireCouleurDuJeton(i - 1, j + 1).equals(couleur)
                        && lireCouleurDuJeton(i - 2, j + 2).equals(couleur)
                        && lireCouleurDuJeton(i - 3, j + 3).equals(couleur)) {
                    return true;
                }
            }
        }
        return false;
    }

    // Méthode pour vérifier si une diagonale descendante est gagnante pour une couleur.
    private boolean diagonaleDescendanteGagnantePourCouleur(String couleur) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                if (presenceJeton(i, j)
                        && lireCouleurDuJeton(i, j).equals(couleur)
                        && lireCouleurDuJeton(i + 1, j + 1).equals(couleur)
                        && lireCouleurDuJeton(i + 2, j + 2).equals(couleur)
                        && lireCouleurDuJeton(i + 3, j + 3).equals(couleur)) {
                    return true;
                }
            }
        }
        return false;
    }
}
