import java.util.Scanner;
class Esfera implements Figura {
    private double radio;

    public Esfera(double radio) {
        this.radio = radio;
    }


    @Override
    public double calcularPerimetro() {
        return 0;
    }

    @Override
    public double calcularArea() {
        return 4 * Math.PI * Math.pow(radio, 2);
    }

    @Override
    public double calcularAreaSuperficial() {
        return calcularArea();
    }

    @Override
    public double calcularVolumen() {
        return (4 / 3.0) * Math.PI * Math.pow(radio, 3);
    }

    @Override
    public void mostrarDatos() {

    }
}