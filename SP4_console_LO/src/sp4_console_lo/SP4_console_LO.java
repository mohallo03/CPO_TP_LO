/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sp4_console_lo;

/**
 *
 * @author Ce PC
 */
public class SP4_console_LO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Création de deux joueurs
        Joueur joueur1 = new Joueur("Joueur 1");
        Joueur joueur2 = new Joueur("Joueur 2");

        // Création d'une partie avec les deux joueurs
        Partie partie = new Partie(joueur1, joueur2);

        // Initialisation de la partie
        partie.initialiserPartie();

        // Lancement de la partie
        partie.lancerPartie();
    }
    
}
