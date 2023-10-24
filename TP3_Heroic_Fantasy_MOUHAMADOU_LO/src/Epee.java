public class Epee extends Arme {
    int indice;

    public Epee(String nnom, int nniv, int ind) {
        super(nnom, nniv);
        if(ind>=100) ind=100;
        indice=ind;
    }
}
