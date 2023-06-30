import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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

            int opcion = sc.nextInt();

            if (opcion == 8) {
                System.out.println("¡Hasta luego!");
                break;
            }

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el radio del círculo:");
                    double radioCirculo = sc.nextDouble();
                    Figura circulo = new Circulo(radioCirculo);

                    figuras.add(circulo);
                    break;
                case 2:
                    System.out.println("Ingrese las coordenadas del primer punto (x y z):");
                    double x1 = sc.nextDouble();
                    double y1 = sc.nextDouble();
                    double z1 = sc.nextDouble();
                    System.out.println("Ingrese las coordenadas del segundo punto (x y z):");
                    double x2 = sc.nextDouble();
                    double y2 = sc.nextDouble();
                    double z2 = sc.nextDouble();
                    Figura cuadrado = new Cuadrado(x1, y1, z1, x2, y2, z2);
                    figuras.add(cuadrado);
                    break;
                case 3:
                    System.out.println("Ingrese las coordenadas del primer punto (x y z):");
                    double x3 = sc.nextDouble();
                    double y3 = sc.nextDouble();
                    double z3 = sc.nextDouble();
                    System.out.println("Ingrese las coordenadas del segundo punto (x y z):");
                    double x4 = sc.nextDouble();
                    double y4 = sc.nextDouble();
                    double z4 = sc.nextDouble();
                    System.out.println("Ingrese las coordenadas del tercer punto (x y z):");
                    double x5 = sc.nextDouble();
                    double y5 = sc.nextDouble();
                    double z5 = sc.nextDouble();
                    Figura triangulo = new Triangulo(x3, y3, z3, x4, y4, z4, x5, y5, z5);
                    figuras.add(triangulo);
                    break;
                case 4:
                    System.out.println("Ingrese las coordenadas del primer punto (x y z):");
                    double x6 = sc.nextDouble();
                    double y6 = sc.nextDouble();
                    double z6 = sc.nextDouble();
                    System.out.println("Ingrese las coordenadas del segundo punto (x y z):");
                    double x7 = sc.nextDouble();
                    double y7 = sc.nextDouble();
                    double z7 = sc.nextDouble();
                    Figura cubo = new Cubo(x6, y6, z6, x7, y7, z7);
                    figuras.add(cubo);
                    break;
                case 5:
                    System.out.println("Ingrese las coordenadas del primer punto (x y z):");
                    double x8 = sc.nextDouble();
                    double y8 = sc.nextDouble();
                    double z8 = sc.nextDouble();
                    System.out.println("Ingrese las coordenadas del segundo punto (x y z):");
                    double x9 = sc.nextDouble();
                    double y9 = sc.nextDouble();
                    double z9 = sc.nextDouble();
                    System.out.println("Ingrese las coordenadas del tercer punto (x y z):");
                    double x10 = sc.nextDouble();
                    double y10 = sc.nextDouble();
                    double z10 = sc.nextDouble();
                    System.out.println("Ingrese las coordenadas del vértice (x y z):");
                    double x11 = sc.nextDouble();
                    double y11 = sc.nextDouble();
                    double z11 = sc.nextDouble();
                    Figura piramide = new Piramide(x8, y8, z8, x9, y9, z9, x10, y10, z10, x11, y11, z11);
                    figuras.add(piramide);
                    break;
                case 6:
                    System.out.println("Ingrese el radio de la esfera:");
                    double radioEsfera = sc.nextDouble();
                    Figura esfera = new Esfera(radioEsfera);
                    figuras.add(esfera);
                    break;
                case 7:
                    System.out.println("Historial de figuras:");
                    for (Figura figura : figuras) {
                        System.out.println(figura);
                    }
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                    break;
            }
        }
    }
}