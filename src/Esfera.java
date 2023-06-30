public class Esfera implements Figura {
    private double radio;

    public Esfera(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularPerimetro() {
        return 0;
    }

    public double calcularArea() {
        return 4 * Math.PI * radio * radio;
    }

    @Override
    public void ingresarPuntos() {

    }

    @Override
    public void mostrarHistorial() {

    }

    public double calcularVolumen() {
        return (4 / 3.0) * Math.PI * radio * radio * radio;
    }
}
