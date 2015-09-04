/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spoj;

import java.util.Scanner;



/**
 *
 * @author Berenice
 */
public class CREDECRE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        scan.useDelimiter("\n");
        int n =1;
        while(n!=0){
            //System.out.print("Ingrese el n:");
            n = scan.nextInt();
             if(n>=9 && n<=24){
                double dem = 1;
                //Calcula (n-9)!
                for (int j=2;j<n-8;j++){
                    dem*=j;
                }
                double i = dem;
                dem=dem*362880;//9!--> Esto es (n-9)!9!
                //Acá termina de calcular el numerador, n!
                for(int j=n-8;j<n+1;j++){
                    i*=j;
                }
                double res = i / dem;
                System.out.println((int)res);
            }
             else{
                 if(n>24){
                     System.out.println("");
                 }
                 else System.out.println(0);
             }
                 
        }
        //System.out.println("End.");
    }
    
}