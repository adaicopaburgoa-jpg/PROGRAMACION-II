public class Estadistica {

    private double[] numeros;

    public Estadistica(double[] numeros) {
        this.numeros = numeros;
    }

    public double promedio() {
        double suma = 0;

        for (int i = 0; i < numeros.length; i++) {
            suma = suma + numeros[i];
        }

        return suma / numeros.length;
    }

    public double desviacion() {
        double prom = promedio();
        double suma = 0;

        for (int i = 0; i < numeros.length; i++) {
            double resta = numeros[i] - prom;
            suma = suma + resta * resta;
        }

        return Math.sqrt(suma / (numeros.length - 1));
    }
}