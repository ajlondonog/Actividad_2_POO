import java.util.Scanner;

public class Ejercicio_Propuesto_19 {
    public static void main(String[] args) {

        double lado, perimetro, altura, area;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese lado del triángulo");
        lado = teclado.nextDouble();

        perimetro = 3*lado;
        altura = lado*Math.sqrt(3)/2;
        area = Math.pow(lado,2)*Math.sqrt(3)/4;
        System.out.println("Propiedades del triángulo equilatero");
        System.out.println("Perimetro: "+perimetro);
        System.out.println("Altura: "+altura);
        System.out.println("Área: "+area);
}
    
}