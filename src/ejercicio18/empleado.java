/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio18;


public class empleado {
 String codigo_empleado;
 String nombre_empleado;
 double salario_bruto;
 double salario_neto;  
 double numero_horas_mes;
 double valor_hora;
 double retencion_fuente;
 double porecentaje_retencion;
 
  public static double calcular_salario_bruto(double numero_horas_mes, double valor_hora){
    return numero_horas_mes*valor_hora;
  }
  public static double calcular_porecentaje_retencion(double retencion){
    return retencion/100;
  }
  
 public static double calcular_salario_neto(double salario_bruto ,double porcentaje_retencion){
    return salario_bruto - (salario_bruto*porcentaje_retencion) ;
  }
  
}
 
