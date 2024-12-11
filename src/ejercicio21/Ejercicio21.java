/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio21;

import java.util.Scanner;
public class Ejercicio21 {

    
    public static void main(String[] args) {
      double la,lb,lc; 
      double p,s;
      double a;
      
      Scanner entrada = new Scanner(System.in);
      
      System.out.println("ingrese el valor del lado a");
      la = entrada.nextDouble();
      
      System.out.println("ingrese el valor del lado b");
      lb = entrada.nextDouble();
      
      System.out.println("ingrese el valor del lado c");
      lc = entrada.nextDouble();
    
       p = triangulo.obtener_perimetro(la, lb, lc);
       s = triangulo.obtener_semiperimetro(p);
       a = triangulo.obtener_area(s, la, lb, lc);
    
     System.out.println("Perimetro: "+ p);
     System.out.println("Semiperimetro: "+ s);
     System.out.println("Area: "+ a);
    }
    
}
