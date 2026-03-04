public class EcuacionLineal {

    private double a, b, c, d, e, f;

    public EcuacionLineal(double a, double b, double c,
                          double d, double e, double f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    public double determinante() {
        return a * d - b * c;
    }

    public double getX() {
        return (e * d - b * f) / determinante();
    }

    public double getY() {
        return (a * f - e * c) / determinante();
    }
}