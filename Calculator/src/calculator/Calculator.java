/*
 * TP0 Calculator
 * LO Mouhamadou
 * Septembre 2023
 * Groupe A
 */
package calculator;

import java.util.Scanner;

/**
 *
 * @author Ce PC
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Please enter the operator:");
        System.out.println("1) add");
        System.out.println("2) substract");
        System.out.println("3) multiply");
        System.out.println("4) divide");
        System.out.println("5) modulo");
        
        int operateur ;
        Scanner sc ;
        sc = new Scanner(System.in);
        operateur = sc.nextInt() ;
        if(1<operateur || operateur>5){
            System.out.println("Valeur incorrecte");
            System.exit(0);
        }
        
        System.out.println("Entrez une premiere valeur : ");
        int operande1 ;
        sc = new Scanner(System.in);
        operande1 = sc.nextInt() ;
        
        System.out.println("Entrez une deuxieme valeur : ");
        int operande2 ;
        sc = new Scanner(System.in);
        operande2 = sc.nextInt() ;
        
        float result=0 ;
        
        if(operateur==1) {
            result = operande1 + operande2 ;
        }
        else if(operateur==2) {
            result = operande1 - operande2 ;
        }
        else if(operateur==3) {
            result = operande1 * operande2 ;
        }
        else if(operateur==4) {
            result = operande1 / operande2 ;
        }
        else if(operateur==5) {
            result = operande1 % operande2 ;
        }
        
        System.out.println("Le resultat est : "+(float)result);
    }
    
}