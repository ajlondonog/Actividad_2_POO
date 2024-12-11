/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio15;

import java.util.Scanner;


public class Ejercicio15 {

    
    public static void main(String[] args) {
     double pesoa, pesob, pesoc, pesod;
     
      Scanner entrada = new Scanner(System.in);
       
      System.out.println("ingrese el peso de la esfera a");
      pesoa = entrada.nextDouble();
     
      System.out.println("ingrese el peso de la esfera b");
      pesob = entrada.nextDouble();
     
      System.out.println("ingrese el peso de la esfera c");
      pesoc = entrada.nextDouble();
     
      System.out.println("ingrese el peso de la esfera d");
      pesod = entrada.nextDouble();
     
      if((pesoa==pesob)&&(pesoa==pesoc)){
           System.out.println("La esfera d es la diferente"); 
          if (pesod>pesoa){
           System.out.println("Y es de mayor peso");   
           }
           else{
           System.out.println("Y es de menor peso");
           }
      }
      
      else if((pesoa==pesob)&&(pesoa==pesod)){
           System.out.println("La esfera c es la diferente"); 
          if (pesoc>pesoa){
           System.out.println("Y es de mayor peso");   
           }
           else{
           System.out.println("Y es de menor peso");
           }
      }

      else if((pesoa==pesoc)&&(pesoa==pesod)){
           System.out.println("La esfera b es la diferente"); 
          if (pesob>pesod){
           System.out.println("Y es de mayor peso");   
           }
           else{
           System.out.println("Y es de menor peso");
           }
      }

      
      else{
           System.out.println("La esfera a es la diferente");
         if(pesoa>pesob){
            System.out.println("Y es de mayor peso"); 
         }
         else{
           System.out.println("Y es de menor peso");  
         }
      }
      
      

    }
    
    
}
