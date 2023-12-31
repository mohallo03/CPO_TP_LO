/*
 * TP1 Exercice 2
 * LO Mouhamadou
 * Octobre 2023
 * Groupe A
 */
package tp1_convertisseur_lo;

import java.util.Scanner;

/**
 *
 * @author Ce PC
 */
public class TP1_convertisseur_LO {

    /**
     * @param args the command line arguments
     */
    
    public static double CelciusVersKelvin (double tCelcius) {
        return tCelcius + 273.15 ;
    }
    public static double KelvinVersCelcius (double tKelvin) {
        return tKelvin - 273.15 ;
    }
    public static double FarenheitVersCelcius (double tFarenheit) {
        return tFarenheit - 17.77 ;
    }
    public static double CelciusVersFarenheit (double tCelcius) {
        return tCelcius + 32 ;
    }
    public static double KelvinVersFarenheit (double tKelvin) {
        return tKelvin - 469.67 ;
    }
    public static double FarenheitVersKelvin (double tFarenheit) {
        return tFarenheit + 255.37 ;
    }
    
    
    public static void main(String[] args) {
        double t;
        Scanner sc ;
        sc = new Scanner(System.in);
        System.out.println("\n Bonjour, saisissez une valeur :");
        t=sc.nextDouble();
        
        System.out.println(" Saisissez la conversion que vous souhaiter effectuer :");
        System.out.println(" 1) De Celcius vers Kelvin");
        System.out.println(" 2) De Kelvin vers Celcius");
        System.out.println(" 3) De Farenheit vers Celcius");
        System.out.println(" 4) De Celcius vers Farenheit");
        System.out.println(" 5) De Kelvin vers Farenheit");
        System.out.println(" 6) De Farenheit vers Kelvin");
      
        int n=sc.nextInt();
        if(1>n || n>6){
            System.out.println("Valeur incorrecte");
            System.exit(0);
        }
        double result ;
        if(n==1) {
            result = CelciusVersKelvin(t) ;
            System.out.println(t+" degre Celcius est égal a "+result+" degres Kelvin");
        }
        else if(n==2) {
            result = KelvinVersCelcius(t) ;
            System.out.println(t+" degre Kelvin est egal a "+result+" degres Celcius");
        }
        else if(n==3) {
            result = FarenheitVersCelcius(t) ;
            System.out.println(t+" degre Farenheit est egal a "+result+" degres Celcius");
        }
        else if(n==4) {
            result = CelciusVersFarenheit(t) ;
            System.out.println(t+" degre Celcius est egal a "+result+" degres Farenheit");
        }
        else if(n==5) {
            result = KelvinVersFarenheit(t) ;
            System.out.println(t+" degre Kelvin est egal a "+result+" degres Farenheit");
        }
        else if(n==6) {
            result = FarenheitVersKelvin(t) ;
            System.out.println(t+" degre Farenheit est egal a "+result+" degres Kelvin");
        }
        
    }
      
}
