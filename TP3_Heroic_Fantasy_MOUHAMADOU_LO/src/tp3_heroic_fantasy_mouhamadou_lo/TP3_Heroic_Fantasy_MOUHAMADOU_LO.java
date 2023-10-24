/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_heroic_fantasy_mouhamadou_lo;

/**
 *
 * @author Ce PC
 */
public class TP3_Heroic_Fantasy_MOUHAMADOU_LO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    public abstract class Arme {
    private String nom;
    private int niveauAttaque;

    public Arme(String nom, int niveauAttaque) {
        this.nom = nom;
        this.niveauAttaque = niveauAttaque;
    }

    public int getNiveauAttaque() {
        return niveauAttaque;
    }

    public String getNom() {
        return nom;
    }

   
    public String toString() {
        return "Arme{" +
                "nom='" + nom + '\'' +
                ", niveauAttaque=" + niveauAttaque +
                '}';
    }

    class Epee extends Arme {
        private int finesse; // <100

        public Epee(String nom, int niveauAttaque, int finesse) {
            super(nom, niveauAttaque);
            if(finesse < 100) {
                this.finesse = finesse;
            } else {
                throw new IllegalArgumentException("Indice de finesse doit être < 100");
            }
        }


        public String toString() {
            return super.toString() + ", Finesse: " + finesse;
        }
    }

    class Baton extends Arme {
        private int age; // <100

        public Baton(String nom, int niveauAttaque, int age) {
            super(nom, niveauAttaque);
            if(age < 100) {
                this.age = age;
            } else {
                throw new IllegalArgumentException("Âge doit être < 100");
            }
        }


        public String toString() {
            return super.toString() + ", Âge: " + age;
        }
    }}
    public class TestArmes {
        public static void main(String[] args) {
            Epee excalibur = new Epee("Excalibur", 7, 5);
            Epee durandal = new Epee("Durandal", 4, 7);

            Baton chene = new Baton("Chêne", 4, 5);
            Baton charme = new Baton("Charme", 5, 6);

            System.out.println(excalibur);
            System.out.println(durandal);
            System.out.println(chene);
            System.out.println(charme);
        }
    }
    import java.util.Vector;

    public class TestArmes {
        public static void main(String[] args) {
            Epee excalibur = new Epee("Excalibur", 7, 5);
            Epee durandal = new Epee("Durandal", 4, 7);

            Baton chene = new Baton("Chêne", 4, 5);
            Baton charme = new Baton("Charme", 5, 6);

            // Création du tableau dynamique
            Vector<Arme> armes = new Vector<Arme>();

            // Ajout des épées et bâtons dans le tableau dynamique
            armes.add(excalibur);
            armes.add(durandal);
            armes.add(chene);
            armes.add(charme);

            // Affichage des caractéristiques des armes
            for(int i = 0; i < armes.size(); i++) {
                System.out.println(armes.elementAt(i));
            }
        }
    }

    abstract class Personnage {
        private String nom;
        private int niveauVie;


        public Personnage(String nom, int niveauVie) {
            this.nom = nom;
            this.niveauVie = niveauVie;
        }

        // niveau de vie
        public int getNiveauVie() {
            return niveauVie;
        }

        //nom
        public String getNom() {
            return nom;
        }


        public String toString() {
            return "Nom: " + nom + ", Niveau de vie: " + niveauVie;
        }
    }

    class Guerrier extends Personnage {
        private boolean aCheval;


        public Guerrier(String nom, int niveauVie, boolean aCheval) {
            super(nom, niveauVie);
            this.aCheval = aCheval;
        }

        /
        public void setACheval(boolean aCheval) {
            this.aCheval = aCheval;
        }


        public String toString() {
            return super.toString() + ", À cheval: " + aCheval;
        }
    }

    class Magicien extends Personnage {
        private boolean estConfirme;


        public Magicien(String nom, int niveauVie, boolean estConfirme) {
            super(nom, niveauVie);
            this.estConfirme = estConfirme;
        }


        public void setEstConfirme(boolean estConfirme) {
            this.estConfirme = estConfirme;
        }


        public String toString() {
            return super.toString() + ", Confirmé: " + estConfirme;
        }
    }

    import java.util.Vector;

    public class TestPersonnages {
        public static void main(String[] args) {
            // 26. Création des magiciens
            Magicien gandalf = new Magicien("Gandalf", 65, true);  // confirmé
            Magicien garcimore = new Magicien("Garcimore", 44, false); // novice

            // 27. Création des guerriers
            Guerrier conan = new Guerrier("Conan", 78, false); // à pied
            Guerrier lannister = new Guerrier("Lannister", 45, true); // à cheval

            // 28. Création du tableau dynamique
            Vector<Personnage> personnages = new Vector<Personnage>();
            personnages.add(gandalf);
            personnages.add(garcimore);
            personnages.add(conan);
            personnages.add(lannister);

            // Affichage des caractéristiques des personnages
            for (Personnage personnage : personnages) {
                System.out.println(personnage);
            }
        }
    }

    import java.util.Vector;

    abstract class Personnage {
        private String nom;
        private int niveauVie;
        private Vector<Arme> armes = new Vector<Arme>();
        private Arme armeEnMain = null;

        // ... (Constructeur et autres méthodes précédentes)

        public void ajouterArme(Arme arme) {
            if (armes.size() < 5) {
                armes.add(arme);
            } else {
                System.out.println("Inventaire plein! Vous ne pouvez pas ajouter plus d'armes.");
            }
        }

        public Arme getArmeEnMain() {
            return armeEnMain;
        }

        public void equiperArme(String nomArme) {
            for (Arme arme : armes) {
                if (arme.getNom().equals(nomArme)) {
                    armeEnMain = arme;
                    System.out.println(nom + " est maintenant équipé de " + nomArme);
                    return;
                }
            }
            System.out.println(nomArme + " n'est pas dans l'inventaire de " + nom);
        }

        @Override
        public String toString() {
            if (armeEnMain != null) {
                return super.toString() + ", Arme en main: " + armeEnMain.toString();
            }
            return super.toString();
        }

        public abstract int armesDePredilection();
    }

    public class TestPersonnagesEtArmes {
        public static void main(String[] args) {
            // 38. Créer un guerrier, un magicien, 3 bâtons et 3 épées.
            Guerrier guerrier = new Guerrier("Arthur", 100, false);
            Magicien magicien = new Magicien("Merlin", 80, true);

            Baton baton1 = new Baton("Bâton de la terre", 30, 5);
            Baton baton2 = new Baton("Bâton du vent", 25, 8);
            Baton baton3 = new Baton("Bâton de feu", 35, 3);

            Epee epee1 = new Epee("Excalibur", 50, 15);
            Epee epee2 = new Epee("Lame de l'ombre", 45, 20);
            Epee epee3 = new Epee("Épée du soleil", 55, 10);

            // 39. Ajouter les 1 bâton et 2 épées au stock d’armes du guerrier et faites lui choisir la première épée.
            guerrier.ajouterArme(baton1);
            guerrier.ajouterArme(epee1);
            guerrier.ajouterArme(epee2);
            guerrier.equiperArme("Excalibur");

            // 40. Ajouter au stock d'armes du magicien 2 bâtons et une épée.
            magicien.ajouterArme(baton2);
            magicien.ajouterArme(baton3);
            magicien.ajouterArme(epee3);

            // 41. Afficher le nombre d'armes préférées du magicien.
            System.out.println(magicien.getNom() + " possède " + magicien.armesDePredilection() + " bâtons.");

            // 42. Afficher toutes les caractéristiques des personnages.
            System.out.println(guerrier);
            System.out.println(magicien);
        }
    }

    abstract class Personnage {
        private String nom;
        private int niveauVie;
        private Vector<Arme> armes = new Vector<Arme>();
        private Arme armeEnMain = null;

        // Attribut statique pour le nombre total de personnages
        protected static int nombrePersonnages = 0;

        // Constructeur
        public Personnage(String nom, int niveauVie) {
            this.nom = nom;
            this.niveauVie = niveauVie;

            // Incrémentation du compteur à chaque création d'un personnage
            nombrePersonnages++;
        }

        // ... (rest of the class, getters, setters, methods ...)
    }

    class Guerrier extends Personnage {
        private boolean aCheval;

        // Attribut statique pour le nombre de guerriers
        protected static int nombreGuerriers = 0;

        // Constructeur
        public Guerrier(String nom, int niveauVie, boolean aCheval) {
            super(nom, niveauVie);
            this.aCheval = aCheval;

            // Incrémentation du compteur à chaque création d'un guerrier
            nombreGuerriers++;
        }

        // ... (rest of the class, getters, setters, methods ...)
    }

    class Magicien extends Personnage {
        private boolean estConfirme;

        // Attribut statique pour le nombre de magiciens
        protected static int nombreMagiciens = 0;

        // Constructeur
        public Magicien(String nom, int niveauVie, boolean estConfirme) {
            super(nom, niveauVie);
            this.estConfirme = estConfirme;

            // Incrémentation du compteur à chaque création d'un magicien
            nombreMagiciens++;
        }

        // ... (rest of the class, getters, setters, methods ...)
    }

    abstract class Personnage {
        // ... autres attributs et méthodes ...

        // Destructeur
        protected void finalize() throws Throwable {
            nombrePersonnages--;
            super.finalize();
        }
    }

    class Guerrier extends Personnage {
        // ... autres attributs et méthodes ...

        // Destructeur
        protected void finalize() throws Throwable {
            nombreGuerriers--;
            super.finalize(); // Appel du finalize de la classe mère
        }
    }

    class Magicien extends Personnage {
        // ... autres attributs et méthodes ...

        // Destructeur
        protected void finalize() throws Throwable {
            nombreMagiciens--;
            super.finalize(); // Appel du finalize de la classe mère
        }
    }

    }
}
