public class TestCronometro {

    public static void main(String[] args) {

        Cronometro crono = new Cronometro();

        crono.iniciar();

      
        int[] numeros = new int[100000];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int)(Math.random() * 100000);
        }

        for (int i = 0; i < numeros.length - 1; i++) {
            int min = i;

            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[j] < numeros[min]) {
                    min = j;
                }
            }

            int temp = numeros[i];
            numeros[i] = numeros[min];
            numeros[min] = temp;
        }

        crono.detener();

        System.out.println("Tiempo: " + crono.lapsoDeTiempo() + " ms");
    }
}