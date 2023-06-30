import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Triangulo implements Figura {
    private List<Punto> listaPuntos = new ArrayList<>();

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
        double semiperimetro = (lado1 + lado2 + lado3) / 2;
        return Math.sqrt(semiperimetro * (semiperimetro - lado1) * (semiperimetro - lado2) * (semiperimetro - lado3));
    }

    @Override
    public void ingresarPuntos() {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("Ingresa la componente x del punto " + (i + 1) + ":");
            double x = sc.nextDouble();
            System.out.println("Ingresa la componente y del punto " + (i + 1) + ":");
            double y = sc.nextDouble();
            System.out.println("Ingresa la componente z del punto " + (i + 1) + ":");
            double z = sc.nextDouble();

            Punto punto = new Punto(x, y, z);
            listaPuntos.add(punto);
        }
    }

    @Override
    public void mostrarHistorial() {
        for (int i = 0; i < listaPuntos.size(); i++) {
            System.out.println("Punto " + (i + 1) + ": " + listaPuntos.get(i));
        }
    }

    private double calcularDistancia(int i, int j) {
        Punto punto1 = listaPuntos.get(i);
        Punto punto2 = listaPuntos.get(j);
        double distancia = Math.sqrt(Math.pow(punto1.getX() - punto2.getX(), 2) +
                Math.pow(punto1.getY() - punto2.getY(), 2) +
                Math.pow(punto1.getZ() - punto2.getZ(), 2));
        return distancia;
    }
}