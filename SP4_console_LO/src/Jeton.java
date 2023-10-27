public class Jeton {
    // Attribut privé pour stocker la couleur du jeton (rouge ou jaune).
    private String couleur;

    // Constructeur pour initialiser la couleur du jeton.
    public Jeton(String couleur) {
        this.couleur = couleur;
    }

    
    // Accesseur en lecture pour obtenir la couleur du jeton.
    public String lireCouleur() {
        return couleur;
    }

    // Méthode toString pour l'affichage.
    @Override
    public String toString() {
        // Retourne 'R' pour rouge et 'J' pour jaune.
        if (couleur.equals("rouge")) {
            return "R";
        } else if (couleur.equals("jaune")) {
            return "J";
        } else {
            //Ni rouge ni jaune
            return "X";
        }
    }
}
