public class CelluleDeGrille {
    private Jeton jetonCourant; // Référence au jeton actuellement dans la cellule.
    private boolean avoirTrouNoir; // Indique la présence d'un trou noir.
    private boolean avoirDesintegrateur; // Indique la présence d'un désintégrateur.

    // Constructeur par défaut qui initialise les attributs.
    public CelluleDeGrille() {
        jetonCourant = null;
        avoirTrouNoir = false;
        avoirDesintegrateur = false;
    }

    // Méthode pour vérifier la présence d'un jeton dans la cellule.
    public boolean presenceJeton() {
        return jetonCourant != null;
    }

    // Méthode pour affecter un jeton à la cellule.
    public void affecterJeton(Jeton jeton) {
        jetonCourant = jeton;
    }

    // Méthode pour lire la couleur du jeton.
    public String lireCouleurDuJeton() {
        if (jetonCourant != null) {
            return jetonCourant.lireCouleur();
        } else {
            return "vide";
        }
    }

    // Méthode pour placer un trou noir sur la cellule.
    public void placerTrouNoir() {
        avoirTrouNoir = true;
    }

    // Méthode pour supprimer le trou noir de la cellule.
    public void supprimerTrouNoir() {
        avoirTrouNoir = false;
    }

    // Méthode pour vérifier la présence d'un trou noir dans la cellule.
    public boolean presenceTrouNoir() {
        return avoirTrouNoir;
    }

    // Méthode pour récupérer un jeton de la cellule et le supprimer.
    public Jeton recupererJeton() {
        Jeton temp = jetonCourant;
        jetonCourant = null;
        return temp;
    }

    // Méthode pour supprimer le jeton de la cellule.
    public void supprimerJeton() {
        jetonCourant = null;
    }

    // Méthode pour placer un désintégrateur sur la cellule.
    public void placerDesintegrateur() {
        avoirDesintegrateur = true;
    }
    
    //Méthode pour vérifier la présence d'un désintégrateur sur la cellule
    public Boolean presenceDesintegrateur(){
        if(avoirDesintegrateur)
            return true;
        else 
            return false;
    }

    // Méthode pour supprimer le désintégrateur de la cellule.
    public void supprimerDesintegrateur() {
        avoirDesintegrateur = false;
    }

    // Méthode pour activer le trou noir.
    public void activerTrouNoir() {
        // supprimerJeton();
        supprimerTrouNoir();
    }

    // Méthode toString pour l'affichage.
    @Override
    public String toString() {
        if (jetonCourant != null) {
            return jetonCourant.toString();
        } else if (avoirTrouNoir) {
            if (avoirDesintegrateur) {
                return "@";
            } else {
                return "@";
            }
        } else if (avoirDesintegrateur) {
            return "D";
        } else {
            return ".";
        }
    }
}
