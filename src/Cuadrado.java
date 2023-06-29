import java.util.Scanner;

public class Cuadrado implements Figura {
    private Punto punto1;
    private Punto punto2;

    public Cuadrado() {
        super();
        setNombre("Cuadrado");
    }

    private void setNombre(String cuadrado) {
    }


    public void ingresarPuntos() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese las coordenadas del primer punto (x, y, z):");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double z1 = scanner.nextDouble();
        punto1 = new Punto(x1, y1, z1);

        System.out.println("Ingrese las coordenadas del segundo punto (x, y, z):");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        double z2 = scanner.nextDouble();
        punto2 = new Punto(x2, y2, z2);
    }



    @Override
    public double calcularPerimetro() {
        double lado1 = Math.abs(punto2.getX() - punto1.getX());
        double lado2 = Math.abs(punto2.getY() - punto1.getY());
        double lado3 = Math.abs(punto2.getZ() - punto1.getZ());
        return 4 * (lado1 + lado2 + lado3);
    }

    @Override
    public double calcularArea() {
        double lado1 = Math.abs(punto2.getX() - punto1.getX());
        double lado2 = Math.abs(punto2.getY() - punto1.getY());
        double lado3 = Math.abs(punto2.getZ() - punto1.getZ());
        return lado1 * lado2 * lado3;
    }

    @Override
    public double calcularAreaSuperficial() {
        return 0;
    }

    @Override
    public double calcularVolumen() {
        return 0;
    }

    @Override
    public void mostrarDatos() {

    }
}
