import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Figura> figuras = new ArrayList<>();

        while (true) {
            System.out.println("\nSeleccione una figura:");
            System.out.println("1. Circulo");
            System.out.println("2. Cuadrado");
            System.out.println("3. Triangulo");
            System.out.println("4. Cubo");
            System.out.println("5. Piramide");
            System.out.println("6. Esfera");
            System.out.println("7. Ver historial");
            System.out.println("8. Salir");

            int opcion = scanner.nextInt();

            if (opcion == 8) {
                System.out.println("¡Hasta luego!");
                break;
            }

            Figura figura = null;

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el radio del círculo:");
                    double radioCirculo = scanner.nextDouble();
                    figura = new Circulo(radioCirculo);
                    break;
                case 2:
                    System.out.println("Ingrese las coordenadas del primer punto (x y z):");
                    double x1 = scanner.nextDouble();
                    double y1 = scanner.nextDouble();
                    double z1 = scanner.nextDouble();
                    System.out.println("Ingrese las coordenadas del segundo punto (x y z):");
                    double x2 = scanner.nextDouble();
                    double y2 = scanner.nextDouble();
                    double z2 = scanner.nextDouble();
                    figura = new Cuadrado(x1, y1, z1, x2, y2, z2);
                    break;
                case 3:
                    System.out.println("Ingrese las coordenadas del primer punto (x y z):");
                    double x3 = scanner.nextDouble();
                    double y3 = scanner.nextDouble();
                    double z3 = scanner.nextDouble();
                    System.out.println("Ingrese las coordenadas del segundo punto (x y z):");
                    double x4 = scanner.nextDouble();
                    double y4 = scanner.nextDouble();
                    double z4 = scanner.nextDouble();
                    System.out.println("Ingrese las coordenadas del tercer punto (x y z):");
                    double x5 = scanner.nextDouble();
                    double y5 = scanner.nextDouble();
                    double z5 = scanner.nextDouble();
                    figura = new Triangulo(x3, y3, z3, x4, y4, z4, x5, y5, z5);
                    break;
                case 4:
                    System.out.println("Ingrese las coordenadas del primer punto (x y z):");
                    double x6 = scanner.nextDouble();
                    double y6 = scanner.nextDouble();
                    double z6 = scanner.nextDouble();
                    System.out.println("Ingrese las coordenadas del segundo punto (x y z):");
                    double x7 = scanner.nextDouble();
                    double y7 = scanner.nextDouble();
                    double z7 = scanner.nextDouble();
                    figura = new Cubo(x6, y6, z6, x7, y7, z7);
                    break;
                case 5:
                    System.out.println("Ingrese las coordenadas del primer punto (x y z):");
                    double x8 = scanner.nextDouble();
                    double y8 = scanner.nextDouble();
                    double z8 = scanner.nextDouble();
                    System.out.println("Ingrese las coordenadas del segundo punto (x y z):");
                    double x9 = scanner.nextDouble();
                    double y9 = scanner.nextDouble();
                    double z9 = scanner.nextDouble();
                    System.out.println("Ingrese las coordenadas del tercer punto (x y z):");
                    double x10 = scanner.nextDouble();
                    double y10 = scanner.nextDouble();
                    double z10 = scanner.nextDouble();
                    System.out.println("Ingrese las coordenadas del vértice (x y z):");
                    double x11 = scanner.nextDouble();
                    double y11 = scanner.nextDouble();
                    double z11 = scanner.nextDouble();
                    figura = new Piramide(x8, y8, z8, x9, y9, z9, x10, y10, z10, x11, y11, z11);
                    break;
                case 6:
                    System.out.println("Ingrese el radio de la esfera:");
                    double radioEsfera = scanner.nextDouble();
                    figura = new Esfera(radioEsfera);
                    break;
                case 7:
                    System.out.println("Historial de figuras:");
                    for (Figura f : figuras) {
                        System.out.println(f);
                    }
                    continue;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                    continue;
            }

            System.out.println("1. Calcular perímetro");
            System.out.println("2. Calcular área");
            int opcionCalculo = scanner.nextInt();

            if (opcionCalculo == 1) {
                double perimetro = figura.calcularPerimetro();
                System.out.println("El perímetro es: " + perimetro);
            } else if (opcionCalculo == 2) {
                double area = figura.calcularArea();
                System.out.println("El área es: " + area);
            } else {
                System.out.println("Opción inválida.");
            }

            figuras.add(figura);
        }
    }
}
