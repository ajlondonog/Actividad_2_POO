/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio11;

import java.util.Scanner;


public class Ejercicio11 {

  
    public static void main(String[] args) {
       double n1,n2,n3,mayor;
        
        
       Scanner entrada = new Scanner(System.in);
       
       System.out.println("ingrese el valor de 1");
       n1 = entrada.nextDouble();
    
       System.out.println("ingrese el valor de N2 ");
       n2 = entrada.nextDouble();
    
       System.out.println("ingrese el valor de N3 ");
       n3 = entrada.nextDouble();
    
       if ((n1>n2) && (n1>n3)){
          mayor = n1;
       }
       else if (n2>n3){
          mayor = n2; 
       }
       
      else{
          mayor = n3;
       }
 
     System.out.println("El mayor entre: "+" "+ n1 + ", " + n2 + " y "+ n3 + " es "+mayor );
    
    }
    
    
}
