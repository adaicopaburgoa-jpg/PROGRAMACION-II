import java.util.Scanner;
import java.util.Locale;

public class EstadisticaModular {

    public static double promedio(double[] numeros) {
        double suma = 0;

        for (int i = 0; i < numeros.length; i++) {
            suma = suma + numeros[i];
        }

        return suma / numeros.length;
    }

    public static double desviacion(double[] numeros) {
        double prom = promedio(numeros);
        double suma = 0;

        for (int i = 0; i < numeros.length; i++) {
            double resta = numeros[i] - prom;
            suma = suma + resta * resta;
        }

        return Math.sqrt(suma / (numeros.length - 1));
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Esto permite usar punto como decimal
        sc.useLocale(Locale.US);

        double[] numeros = new double[10];

        System.out.println("Ingrese 10 numeros separados por espacio:");

        for (int i = 0; i < 10; i++) {
            numeros[i] = sc.nextDouble();
        }

        double prom = promedio(numeros);
        double des = desviacion(numeros);

        System.out.printf("El promedio es %.2f\n", prom);
        System.out.printf("La desviacion estandar es %.5f\n", des);

        sc.close();
    }
}