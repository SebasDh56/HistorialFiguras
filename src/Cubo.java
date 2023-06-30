import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Cubo implements Figura {
    private List<Punto> listaPuntos = new ArrayList<>();

    @Override
    public double calcularPerimetro() {
        double lado = calcularDistancia(0, 1);
        return 12 * lado;
    }

    @Override
    public double calcularArea() {
        return 0;
    }

    public double calcularAreaSuperficial() {
        double lado = calcularDistancia(0, 1);
        return 6 * lado * lado;
    }

    public double calcularVolumen() {
        double lado = calcularDistancia(0, 1);
        return Math.pow(lado, 3);
    }

    @Override
    public void ingresarPuntos() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa la componente x:");
        double x = sc.nextDouble();
        System.out.println("Ingresa la componente y:");
        double y = sc.nextDouble();
        System.out.println("Ingresa la componente z:");
        double z = sc.nextDouble();

        Punto punto = new Punto(x, y, z);
        listaPuntos.add(punto);
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