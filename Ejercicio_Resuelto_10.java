import java.util.Scanner;

public class Ejercicio_Resuelto_10 {
    public static void main(String[] args) {
        /*
         * NI: Número de inscripción
         * NOM: Nombres
         * PAT: Patrimonio
         * EST: Estrato social
         * PAGMAT: Pago por matrícula
         */
        
        int Est;
        String Ni, Nom;
        double Pat, PagMat;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese número de inscripción del estudiante");
        Ni = teclado.nextLine();
        System.out.println("Ingrese nombre del estudiante");
        Nom = teclado.nextLine();
        System.out.println("Ingrese patrimonio del estudiante");
        Pat = teclado.nextDouble();
        System.out.println("Ingrese estrato del estudiante");
        Est = teclado.nextInt();

        teclado.close();

        PagMat = 50000;
        if ((Pat > 2000000) && (Est > 3)){
            PagMat = PagMat + 0.03*Pat;
        }

        System.out.println("El estudiante con número de inscripción "+Ni+" y nombre "+Nom+" Debe pagar "+PagMat);
    }
    
}