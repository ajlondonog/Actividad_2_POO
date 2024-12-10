import java.util.Scanner;

public class EjercicioPropuesto_22 {
    
    public static void main(String[] args) {
        /*
         * NOM: Nombre del trabajador
         * SBH: Salario basico por hora
         * NHT: Número de horas trabajadas mes
         */
        String NOM;
        double SBH, NHT, Salario;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese Nombre del trabajador");
        NOM = teclado.nextLine();
        System.out.println("Ingrese Salario basico por hora");
        SBH = teclado.nextDouble();
        System.out.println("Ingrese Número de horas trabajadas en el mes");
        NHT = teclado.nextDouble();

        teclado.close();

        Salario = SBH*NHT;

        if (Salario > 450000){
            System.out.println("El trabajador " + NOM + " devengó " + Salario);
        }
        else{
            System.out.println("El nombre del trabajador es " + NOM);
            
        }

    }
}
