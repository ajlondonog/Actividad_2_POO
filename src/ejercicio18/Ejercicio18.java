/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio18;
import java.util.Scanner;
public class Ejercicio18 {

   
    public static void main(String[] args) {
     double salario_bruto;
     double salario_neto;
     double  porecentaje_retencion;
     String codigo_empleado;
     String nombre,apellido,nombre_empleado;
     
     Scanner entrada = new Scanner(System.in);
     
     System.out.println("Ingrese el codigo del empleado");
     codigo_empleado = entrada.next();
     System.out.println("Ingrese el nombre del empleado");
     nombre = entrada.next();
     System.out.println("Ingrese el apellido del empleado");
     apellido = entrada.next();
     nombre_empleado = nombre+ " " +apellido;
     System.out.println("Ingrese el porcentaje de retencion");
     double retencion = entrada.nextDouble();
     
    porecentaje_retencion = empleado.calcular_porecentaje_retencion(retencion);
    salario_bruto = empleado.calcular_salario_bruto(40,90000 );
    salario_neto = empleado.calcular_salario_neto(salario_bruto, porecentaje_retencion);
    
    System.out.println("codigo empleado: " + codigo_empleado );
    System.out.println("nombre empleado: " + nombre_empleado );
    System.out.println("salario bruto: " + salario_bruto );
    System.out.println("salario neto: " + salario_neto );
    
      
    }
   
    
}
