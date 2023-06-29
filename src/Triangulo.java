import java.util.Scanner;
class Triangulo implements Figura {
    private double[][] puntos = new double[3][3];


    public  void ingresarPuntos() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese las coordenadas x e y del punto:");
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        Punto punto = new Punto(x, y);
        puntos.add(punto);
    }




    @Override
    public double calcularPerimetro() {
        double lado1 = calcularDistancia(0, 1);
        double lado2 = calcularDistancia(1, 2);
        double lado3 = calcularDistancia(2, 0);
        return lado1 + lado2 + lado3;
    }

    @Override
    public double calcularArea() {
        double lado1 = calcularDistancia(0, 1);
        double lado2 = calcularDistancia(1, 2);
        double lado3 = calcularDistancia(2, 0);
        double semiperimetro = calcularPerimetro() / 2;
        return Math.sqrt(semiperimetro * (semiperimetro - lado1) * (semiperimetro - lado2) * (semiperimetro - lado3));
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