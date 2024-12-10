import java.util.Scanner;

public class Ejercicio_Resuelto_12 {
    public static void main(String[] args) {
        /*
         * NOM: Nombre del trabajador.
         * NHT: Número de horas trabajadas.
         * VHN: Valor hora normal trabajada.
         * HET: Horas extras trabajadas.
         * HEE8: Horas extras que exceden de 8.
         * SALARIO: Pago total que recibe el trabajador.
         */

        int NHT, HET, HEE8;
        String NOM;
        double VHN, SALARIO;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese nombre del trabajador");
        NOM = teclado.nextLine();
        System.out.println("Ingrese número de horas trabajadas");
        NHT = teclado.nextInt();
        System.out.println("Ingrese valor hora normal");
        VHN = teclado.nextDouble();

        teclado.close();

        if (NHT > 40){
            HET = NHT - 40;
            if (HET > 8){
                HEE8 = HET - 8;
                SALARIO = 40*VHN + 2*8*VHN + 3*HEE8*VHN;
            }
            else{
                SALARIO = 40*VHN + 2*HET*VHN;
            }
        }
        else{
            SALARIO = NHT*VHN;
        }

        System.out.println("El trabajador "+NOM+" devengó "+SALARIO);
    }
    
}
