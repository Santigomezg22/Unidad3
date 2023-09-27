
package practica01u3;
import java.util.Scanner;

public class Practica01U3 {

    
    public static void main(String[] args)
    {
        Scanner numeros= new Scanner (System.in);
        int num;
        System.out.println("Ingrese el  numero");
        num=numeros .nextInt();
        if (num%2 ==0)
        {
            System.out.println("El numero ingresado es par");
        }else{ 
           System.out.println("El numero ingresado es impar");     
                
        }
      numeros.close();
    }
    
}
