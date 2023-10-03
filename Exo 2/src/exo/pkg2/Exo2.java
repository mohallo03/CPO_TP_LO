/*
 * TP0 Exercice 2
 * LO Mouhamadou
 * Septembre 2023
 * Groupe A
 */
package exo.pkg2;

import java.util.Scanner;

/**
 *
 * @author Ce PC
 */
public class Exo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaration des variables
        int nb; // nombre dentiers a additionner
        Scanner sc ;
        sc = new Scanner(System.in);
        System.out.println("\n Entrer le nombre :");
        nb=sc.nextInt(); // On demande a sc de donner le prochain entier
        int result; // resultat
        int ind; //indice
        result=0;
        // Addition des nb premiers entiers
        ind=1;
        while (result <= nb) {
        result=result+ind;
        }
        // Affichage du resultat
        System.out.println();
        System.out.println("La somme des "+ nb + " entiers est: "+result);
    }
    
}
