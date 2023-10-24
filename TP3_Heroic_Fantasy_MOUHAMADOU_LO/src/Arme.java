public abstract class Arme {
    String nom;
    private int niv;
    
    public Arme(String nnom, int nniv) {
        if (nniv > 100) nniv=100;
        nom=nnom;
        niv=nniv;
    }
    
     public int nivAttaque() {
         return niv;
     }
     
    @Override
    public String toString(){
        return "Nom : "+nom+", Niveau d'Attaque : "+niv;
    }
}
