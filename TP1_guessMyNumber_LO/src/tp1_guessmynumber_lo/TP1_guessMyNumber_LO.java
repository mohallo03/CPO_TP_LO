/*
 * TP1 Exercice 3
 * LO Mouhamadou
 * Octobre 2023
 * Groupe A
 */
package tp1_guessmynumber_lo;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Ce PC
 */
public class TP1_guessMyNumber_LO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc ;
        sc = new Scanner(System.in);
        int max=0;
        System.out.println("Choisissez un niveau de difficulte :");
        System.out.println("1) Facile");
        System.out.println("2) Normal");
        System.out.println("3) Difficile");
        System.out.println("4) Cauchemar");
        int dif=sc.nextInt();
        switch (dif) {
            case 1:
                System.out.println("Difficulte : Facile\n");
                max = 50;
                break;
            case 2:
                System.out.println("Difficulte : Normal\n");
                max = 100;
                break;
            case 3:
                System.out.println("Difficulte : Difficile\n");
                max = 150;
                break;
            case 4:
                System.out.println("Difficulte : Cauchemar\n");
                max = 150;
                break;
            default:
                break;
        }
        if(1>dif || dif>4){
            System.out.println("Valeur incorrecte");
            System.exit(0);
        }
        
        Random generateurAleat = new Random();
        int nbre = generateurAleat.nextInt(max);
        System.out.println("\n Entrez une valeur entre 0 et "+max+" : ");
        int n=sc.nextInt();
        int cpt = 0;
        while(n!=nbre){
            if(n<nbre){
                if(dif==4){
                    int chance = generateurAleat.nextInt(100) ;
                    if(chance<30){
                        System.out.println("Trop grand !");
                    }
                    else{
                        System.out.println("Trop petit !");
                    }
                }
                else{
                    if(((nbre-n)>=20)&&(dif==1)){
                    System.out.println("Vraiment trop petit !");
                    }
                    else {
                        System.out.println("Trop petit !");
                    }
                    cpt++;
                }
            }
            else if(n>nbre){
                if(dif==4){
                    int chance = generateurAleat.nextInt(100) ;
                    if(chance<30){
                        System.out.println("Trop petit !");
                    }
                    else{
                        System.out.println("Trop grand !");
                    }
                }
                else{
                    if(((n-nbre)>=20)&&(dif==1)){
                    System.out.println("Vraiment trop grand !");
                    }
                    else {
                        System.out.println("Trop grand !");
                    }
                    cpt++;
                    }
            }
            n=sc.nextInt();
            if(cpt==10 && dif>=3){
                System.out.println("Vous avez atteint 10 essaies.");
            System.exit(0);
            }
        }
        System.out.println("\n GAGNE !");
        System.out.println("Nombre de tentatives : "+cpt);
    }
    
}