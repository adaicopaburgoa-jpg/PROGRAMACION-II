import java.util.Scanner;

public class TestEcuacionCuadratica {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese a, b, c: ");

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        EcuacionCuadratica eq =
                new EcuacionCuadratica(a,b,c);

        if (eq.getDiscriminante() > 0) {
            System.out.println("Dos raices: "
                    + eq.getRaiz1() + " y "
                    + eq.getRaiz2());
        } else if (eq.getDiscriminante() == 0) {
            System.out.println("Una raiz: "
                    + eq.getRaiz1());
        } else {
            System.out.println("No tiene raices reales");
        }

        sc.close();
    }
}