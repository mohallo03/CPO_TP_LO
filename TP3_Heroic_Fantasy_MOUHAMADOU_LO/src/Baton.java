public class Baton extends Arme {
    int age;

    public Baton(String nnom, int nniv, int Age) {
        super(nnom, nniv);
        if(Age>=100) Age=100;
        age=Age;
    }
}
