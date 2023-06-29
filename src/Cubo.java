import java.util.Scanner;

class Cubo implements Figura {
    private double[][] puntos = new double[8][3];



    @Override
    public double calcularPerimetro() {
        double lado = calcularDistancia(0, 1);
        return 12 * lado;
    }

    @Override
    public double calcularArea() {
        double lado = calcularDistancia(0, 1);
        return 6 * Math.pow(lado, 2);
    }

    @Override
    public double calcularAreaSuperficial() {
        return calcularArea();
    }

    @Override
    public double calcularVolumen() {
        double lado = calcularDistancia(0, 1);
        return Math.pow(lado, 3);
    }

    @Override
    public void mostrarDatos() {

    }

    private double calcularDistancia(int indice1, int indice2) {
        double x1 = puntos[indice1][0];
        double y1 = puntos[indice1][1];
        double z1 = puntos[indice1][2];
        double x2 = puntos[indice2][0];
        double y2 = puntos[indice2][1];
        double z2 = puntos[indice2][2];
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2) + Math.pow(z2 - z1, 2));
    }
}