public class Cronometro {

    private long inicio;
    private long fin;

    public Cronometro() {
        inicio = System.currentTimeMillis();
    }

    public void iniciar() {
        inicio = System.currentTimeMillis();
    }

    public void detener() {
        fin = System.currentTimeMillis();
    }

    public long lapsoDeTiempo() {
        return fin - inicio;
    }
}