import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Seleccione una figura:");
        System.out.println("1. Circulo");
        System.out.println("2. Cuadrado");
        System.out.println("3. Cubo");
        System.out.println("4. Triangulo");
        System.out.println("5. Piramide");

        int opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Ingrese el radio del círculo:");
                double radio = sc.nextDouble();
                Figura circulo = new Circulo(radio);
                circulo.mostrarHistorial();
                System.out.println("Perímetro del círculo: " + circulo.calcularPerimetro());
                System.out.println("Área del círculo: " + circulo.calcularArea());
                break;
            case 2:
                Figura cuadrado = new Cuadrado();
                cuadrado.ingresarPuntos();
                cuadrado.mostrarHistorial();
                System.out.println("Perímetro del cuadrado: " + cuadrado.calcularPerimetro());
                System.out.println("Área del cuadrado: " + cuadrado.calcularArea());
                break;
            case 3:
                Figura cubo = new Cubo();
                cubo.ingresarPuntos();
                cubo.mostrarHistorial();
                System.out.println("Perímetro del cubo: " + cubo.calcularPerimetro());
                System.out.println("Área superficial del cubo: " + ((Cubo) cubo).calcularAreaSuperficial());
                System.out.println("Volumen del cubo: " + ((Cubo) cubo).calcularVolumen());
                break;
            case 4:
                Figura triangulo = new Triangulo();
                triangulo.ingresarPuntos();
                triangulo.mostrarHistorial();
                System.out.println("Perímetro del triángulo: " + triangulo.calcularPerimetro());
                System.out.println("Área del triángulo: " + triangulo.calcularArea());
                break;
            case 5:
                Figura piramide = new Piramide();
                piramide.ingresarPuntos();
                piramide.mostrarHistorial();
                System.out.println("Perímetro de la base de la pirámide: " + piramide.calcularPerimetro());
                System.out.println("Área de la pirámide: " + piramide.calcularArea());
                break;
            default:
                System.out.println("Opción inválida.");
                break;
        }
    }
}