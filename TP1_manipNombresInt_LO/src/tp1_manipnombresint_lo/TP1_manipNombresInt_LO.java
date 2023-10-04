/*
 * TP1 Exercice 1
 * LO Mouhamadou
 * Septembre 2023
 * Groupe A
 */
package tp1_manipnombresint_lo;

import java.util.Scanner;

/**
 *
 * @author Ce PC
 */
public class TP1_manipNombresInt_LO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nb1, nb2;
        Scanner sc ;
        sc = new Scanner(System.in);
        System.out.println("\n Entrer le premier nombre :");
        nb1=sc.nextInt();
        
        sc = new Scanner(System.in);
        System.out.println("\n Entrer le deuxieme nombre :");
        nb2=sc.nextInt();
        
        System.out.println("\n nb1 = "+nb1+" et nb2 = "+nb2) ;
        System.out.println("\n nb1 + nb2 = "+(nb1+nb2)) ;
        System.out.println("\n nb1 - nb2 = "+(nb1+nb2)) ;
        System.out.println("\n nb1 x nb2 = "+(nb1*nb2)) ;
        System.out.println("\n Le quotient entier de nb1/nb2 est : "+(nb1/nb2)+" et le reste de la division est : "+(nb1%nb2)) ;
        
    }
    
}
