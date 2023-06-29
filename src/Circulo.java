import java.util.Scanner;

class Circulo implements Figura {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }



    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    @Override
    public double calcularAreaSuperficial() {
        return calcularArea();
    }

    @Override
    public double calcularVolumen() {
        return 0;
    }

    @Override
    public void mostrarDatos() {

    }
}
