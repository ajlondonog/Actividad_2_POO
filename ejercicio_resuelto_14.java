import java.util.Scanner;

public class ejercicio_resuelto_14 {
    public static void main(String[] args) {
        /*
         * VD1: Ventas del departamento 1
         * VD2: Ventas del departamento 2
         * VD3: Ventas del departamento 3
         * SALAR: Salario que reciben vendedores en cada departamento.
         * TOTVEN: Total ventas en la empresa.
         * PORVEN: Porcentaje equivalente al 33% de ventas totales.
         * SALAR1: Salario de los vendedores en el depto. 1
         * SALAR2: Salario de los vendedores en el depto. 2
         * SALAR3: Salario de los vendedores en el depto. 3
         */

        double VD1, VD2, VD3, SALAR, TOTVEN, PORVEN, SALAR1, SALAR2, SALAR3;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese ventas del departamento 1");
        VD1 = teclado.nextDouble();
        System.out.println("Ingrese ventas del departamento 2");
        VD2 = teclado.nextDouble();
        System.out.println("Ingrese ventas del departamento 3");
        VD3 = teclado.nextDouble();
        System.out.println("Ingrese salario");
        SALAR = teclado.nextDouble();

        teclado.close();

        TOTVEN = VD1 + VD2 + VD3;
        PORVEN = 0.33*TOTVEN;

        if (VD1 > PORVEN){
            SALAR1 = SALAR + 0.2*SALAR;
        }
        else{
            SALAR1 = SALAR;
        }

        if (VD2 > PORVEN){
            SALAR2 = SALAR + 0.2*SALAR;
        }
        else{
            SALAR2 = SALAR;
        }

        if (VD3 > PORVEN){
            SALAR3 = SALAR + 0.2*SALAR;
        }
        else{
            SALAR3 = SALAR;
        }

        System.out.println("Salario vendedor departamento 1: "+SALAR1);
        System.out.println("Salario vendedor departamento 2: "+SALAR2);
        System.out.println("Salario vendedor departamento 3: "+SALAR3);
    }
}