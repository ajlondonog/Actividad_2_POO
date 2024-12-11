/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio13;

import java.util.Scanner;
public class Ejercicio13 {

    
public static void main(String[] args) {
       double Valpag,valcomp;
       String color;
        
       Scanner entrada = new Scanner(System.in);
       
       System.out.println("ingrese el valor de la compra");
       valcomp = entrada.nextDouble(); 
    
       System.out.println("ingrese el color de la bolita");
       color = entrada.next();
       
       
       Valpag = valpag.valor_a_pagar(valcomp, color);
       
       System.out.println("El cliente debe pagar "+Valpag);
  }
   
}
