/*
 * TP1 Exercice 2
 * LO Mouhamadou
 * Septembre 2023
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
        
        System.out.println("\n Saisissez la conversion que vous souhaiter effectuer :");
        System.out.println("\n 1) De Celcius vers Kelvin");
        System.out.println("\n 2) De Kelvin vers Celcius");
        System.out.println("\n 3) De Farenheit vers Celcius");
        System.out.println("\n 4) De Celcius vers Farenheit");
        System.out.println("\n 5) De Kelvin vers Farenheit");
        System.out.println("\n 6) De Farenheit vers Kelvin");
        
        Scanner sc1 ;
        sc1 = new Scanner(System.in) ;
        var n=sc1.nextInt();
        System.out.println("\n"+n);
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
