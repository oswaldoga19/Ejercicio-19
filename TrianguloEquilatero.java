public class TrianguloEquilatero {
    private double lado;

    public TrianguloEquilatero(double lado) {
        this.lado = lado;
    }

    public double calcularPerimetro() {
        return 3 * lado;
    }

    public double calcularAltura() {
        return Math.round((Math.sqrt(3) / 2) * lado);
    }

    public double calcularArea() {
        return Math.round( (Math.sqrt(3) / 4) * lado * lado);
    }
}
