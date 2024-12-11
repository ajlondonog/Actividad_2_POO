/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio7;
import java.util.Scanner;
public class Ejercicio7 {

    
    public static void main(String[] args) {
       double a;
       double b;
       
       Scanner entrada = new Scanner(System.in);
       
       System.out.println("ingrese el valor de a");
       a = entrada.nextDouble();
    
       System.out.println("ingrese el valor de b");
       b = entrada.nextDouble();
       
       
       if (a>b){
           System.out.println(a + " es mayor que " + b);
       }
      else if (a==b){
           System.out.println(a + " es igual que " + b);
       }
      else {
          System.out.println(a + " es menor que " + b);  
       
       
       }
    
    }
    
}
