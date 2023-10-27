import java.util.ArrayList;
import java.util.Scanner;

public class Joueur {
    private String nom;
    private String couleur;
    private ArrayList<Jeton> reserveJetons;
    private int nombreDesintegrateurs;

    // Constructeur
    public Joueur(String nom) {
        this.nom = nom;
        this.nombreDesintegrateurs = 0;
        this.reserveJetons = new ArrayList<>();
    }

    // Méthode pour affecter la couleur au joueur
    public void affecterCouleur(String couleur) {
        this.couleur = couleur;
    }

    // Méthode pour lire la couleur du joueur
    public String lireCouleur() {
        return couleur;
    }

    // Méthode pour obtenir le nombre de jetons dans la réserve
    public int nombreDeJetons() {
        return reserveJetons.size();
    }

    // Méthode pour ajouter un jeton à la réserve
    public void ajouterJeton(Jeton jeton) {
        reserveJetons.add(jeton);
    }

    // Méthode pour jouer un jeton et le retirer de la réserve
    public Jeton jouerJeton() {
        if (nombreDeJetons() > 0) {
            return reserveJetons.remove(0);
        }
        return null; // La réserve est vide
    }

    // Méthode pour obtenir un désintégrateur
    public void obtenirDesintegrateur() {
        nombreDesintegrateurs++;
    }

    // Méthode pour utiliser un désintégrateur
    public void utiliserDesintegrateur() {
        if (nombreDesintegrateurs > 0) {
            nombreDesintegrateurs--;
        }
    }
    //Méthode pour obtenir le nom du joueur
    public String getNom()
    {
        return nom;
    }

    // Méthode pour obtenir la liste des jetons dans la réserve
public ArrayList<Jeton> getJetons() {
    return reserveJetons;
}

    
}
