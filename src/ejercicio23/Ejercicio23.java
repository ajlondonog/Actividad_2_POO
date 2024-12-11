/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio23;

import java.util.Scanner; 
public class Ejercicio23 {

    
    public static void main(String[] args) {
        double a;
                
        double b;
        double c;
   
        Scanner entrada = new Scanner(System.in);

       
        System.out.print("Ingrese el valor de a: ");
         a = entrada.nextDouble();
        System.out.print("Ingrese el valor de b: ");
         b = entrada.nextDouble();
        System.out.print("Ingrese el valor de c: ");
         c = entrada.nextDouble();

       
            double discriminante = Math.pow(b, 2) - 4 * a * c;

            
            if (discriminante > 0) {
                double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
                double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
                System.out.println("La ecuacion tiene dos soluciones reales:");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            } else if (discriminante == 0) {
                double x = -b / (2 * a);
                System.out.println("La ecuacion tiene una solucion real unica:");
                System.out.println("x = " + x);
            } else {
                System.out.println("La ecuacion no tiene soluciones reales.");
            }
        }

        
    }

    
   

