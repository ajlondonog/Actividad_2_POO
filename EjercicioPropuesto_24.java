import java.util.Scanner;

public class EjercicioPropuesto_24 {

    public static void main(String[] args) {
        double EA,EB,EC;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese peso de la esfera A");
        EA = teclado.nextDouble();
        System.out.println("Ingrese peso de la esfera B");
        EB = teclado.nextDouble();
        System.out.println("Ingrese peso de la esfera C");
        EC = teclado.nextDouble();

        if ((EA > EB) && (EA > EC)){
            System.out.println("La esfera de mayor peso es A con un peso de: " + EA);
        }
        else if ((EB > EC) && (EB > EA) ){
            System.out.println("La esfera de mayor peso es B con un peso de: " + EB);
        }
        else{
            System.out.println("La esfera de mayor peso es C con un peso de: " + EC);
        }
    }
    
}