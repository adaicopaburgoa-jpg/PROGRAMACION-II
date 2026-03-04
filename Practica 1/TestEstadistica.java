import java.util.Scanner;
import java.util.Locale;

public class TestEstadistica {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Permite usar punto como decimal
        sc.useLocale(Locale.US);

        double[] numeros = new double[10];

        System.out.println("Ingrese 10 numeros separados por espacio:");

        for (int i = 0; i < 10; i++) {
            numeros[i] = sc.nextDouble();
        }

        Estadistica est = new Estadistica(numeros);

        System.out.printf("El promedio es %.2f\n", est.promedio());
        System.out.printf("La desviacion estandar es %.5f\n", est.desviacion());

        sc.close();
    }
}