/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package seriefibonacci;
import java.util.Scanner;
/**
 *
 * @author curso
 */
public class SerieFibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        int cero=0, uno=1, suma;
        System.out.println("Serie Fibonacci");
        
         Scanner Serie = new Scanner(System.in);
         System.out.println("Ingrese los numeros que quiere ver");
         int numero = Serie.nextInt();
         Serie.close();
         
         System.out.println("La serie Fibonacci de: " + numero);    
     for (int i= 1; i<numero ; i++){
        System.out.println(".-"+cero);
        
        suma= cero+uno;
        cero=uno;
        uno=suma;
         }      
                                  
    }
}