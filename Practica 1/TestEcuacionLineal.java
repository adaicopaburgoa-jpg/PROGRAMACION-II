import java.util.Scanner;

public class TestEcuacionLineal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese a, b, c, d, e, f: ");

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double d = sc.nextDouble();
        double e = sc.nextDouble();
        double f = sc.nextDouble();

        EcuacionLineal sis = new EcuacionLineal(a,b,c,d,e,f);

        if (sis.determinante() != 0) {
            System.out.println("x = " + sis.getX() +
                               ", y = " + sis.getY());
        } else {
            System.out.println("La ecuacion no tiene solucion");
        }

        sc.close();
    }
}