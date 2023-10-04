/*
 * TP1 Exercice 4
 * LO Mouhamadou
 * Octobre 2023
 * Groupe A
 */
package tp1_stats_lo;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Ce PC
 */
public class TP1_stats_LO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random generateurAleat = new Random();

        int [] tab = new int[6];
        Scanner sc ;
        sc = new Scanner(System.in);
        System.out.println("Entrez la valeur de m : ");
        int m=sc.nextInt();
        
        for(int i=0;i<m;i++) {
            int n = generateurAleat.nextInt(5);
            tab[n]++;
        }
        
        for(int i=0;i<6;i++) {
            double p=tab[i]*100.0/m;
            System.out.println("tab["+i+"] = "+tab[i]);
            System.out.println("% de tab["+i+"] = "+p+"\n");
        }
    }
}
