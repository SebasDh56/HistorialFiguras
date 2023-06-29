import paquete.Triangulo;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Timelab espera = new Timelab();
        int opcion;

        do {
            System.out.println("Elige una opción:");
            System.out.println("1. Figuras en 2D");
            System.out.println("2. Figuras en 3D");
            System.out.println("0. Salir");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    // Figuras en 2D
                    int opcion2D;
                    do {
                        System.out.println("Elige una opción:");
                        System.out.println("1. Cuadrado");
                        System.out.println("2. Triángulo");
                        System.out.println("3. Círculo");
                        System.out.println("0. Volver");
                        opcion2D = scanner.nextInt();

                        switch (opcion2D) {
                            case 1:
                                // Caso del cuadrado
                                Cuadrado cuadrado = new Cuadrado();
                                System.out.println("Ingrese los puntos del cuadrado:");
                                for (int i = 0; i < 2; i++) {
                                    cuadrado.ingresarPuntos();
                                }
                                System.out.println("1. Calcular perímetro");
                                System.out.println("2. Calcular área");
                                int poa = scanner.nextInt();
                                switch (poa) {
                                    case 1:
                                        System.out.println("El perímetro del cuadrado es: " + cuadrado.calcularPerimetro());
                                        espera.Espera();
                                        break;
                                    case 2:
                                        System.out.println("El área del cuadrado es: " + cuadrado.calcularArea());
                                        espera.Espera();
                                        break;
                                    default:
                                        System.out.println("Opción inválida.");
                                        break;
                                }
                                break;

                            case 2:
                                // Caso del triángulo
                                Triangulo triangulo = new Triangulo();
                                System.out.println("Ingrese los puntos del triángulo:");
                                for (int i = 0; i < 3; i++) {
                                    triangulo.ingresarPuntos();
                                }
                                System.out.println("1. Calcular perímetro");
                                System.out.println("2. Calcular área");
                                poa = scanner.nextInt();
                                switch (poa) {
                                    case 1:
                                        System.out.println("El perímetro del triángulo es: " + triangulo.calcularPerimetro());
                                        espera.Espera();
                                        break;
                                    case 2:
                                        System.out.println("El área del triángulo es: " + triangulo.calcularArea());
                                        espera.Espera();
                                        break;
                                    default:
                                        System.out.println("Opción inválida.");
                                        break;
                                }
                                break;

                            case 3:
                                // Caso del círculo
                                System.out.println("Ingrese el radio del círculo:");
                                double radioCirculo = scanner.nextDouble();
                                Figura circulo = new Circulo(radioCirculo);

                                System.out.println("1. Calcular perímetro");
                                System.out.println("2. Calcular Area");

                                poa = scanner.nextInt();
                                switch (poa) {
                                    case 1:
                                        System.out.println("El perímetro del círculo es: " + circulo.calcularPerimetro());
                                        espera.Espera();
                                        break;
                                    case 2:
                                        System.out.println("El Area del círculo es: " + circulo.calcularArea());
                                        espera.Espera();
                                        break;
                                    default:
                                        System.out.println("Opción inválida.");
                                        espera.Espera();
                                        break;
                                }
                                break;

                            case 0:
                                System.out.println("Volviendo al menú principal...");
                                espera.Espera();
                                break;

                            default:
                                System.out.println("Opción inválida.");
                                break;
                        }
                    } while (opcion2D != 0);
                    break;

                case 2:
                    // Figuras en 3D
                    int opcion3D;
                    do {
                        System.out.println("Elige una opción:");
                        System.out.println("1. Esfera");
                        System.out.println("2. Cubo");
                        System.out.println("3. Pirámide");
                        System.out.println("0. Volver");
                        opcion3D = scanner.nextInt();

                        switch (opcion3D) {
                            case 1:
                                // Caso de la esfera

                                System.out.println("Ingrese el radio de la esfera:");
                                double radioEsfera = scanner.nextDouble();
                                Figura esfera = new Esfera(radioEsfera);
                                System.out.println("1. Calcular área");
                                System.out.println("2. Calcular volumen");
                                int poa = scanner.nextInt();
                                switch (poa) {
                                    case 1:
                                        System.out.println("El área de la esfera es: " + esfera.calcularArea());
                                        espera.Espera();
                                        break;
                                    case 2:
                                        System.out.println("El volumen de la esfera es: " + esfera.calcularVolumen());
                                        espera.Espera();
                                        break;
                                    default:
                                        System.out.println("Opción inválida.");
                                        break;
                                }
                                break;

                            case 2:
                                // Caso del cubo
                                Figura cubo = new Cubo();
                                System.out.println("Ingrese los puntos del cubo:");
                                for (int i = 0; i < 2; i++) {
                                    ((Cubo) cubo).ingresarPuntos();
                                }
                                System.out.println("1. Calcular perímetro");
                                System.out.println("2. Calcular área superficial");
                                System.out.println("3. Calcular volumen");
                                poa = scanner.nextInt();
                                switch (poa) {
                                    case 1:
                                        System.out.println("El perímetro del cubo es: " + cubo.calcularPerimetro());
                                        espera.Espera();
                                        break;
                                    case 2:
                                        System.out.println("El área superficial del cubo es: " + cubo.calcularAreaSuperficial());
                                        espera.Espera();
                                        break;
                                    case 3:
                                        System.out.println("El volumen del cubo es: " + cubo.calcularVolumen());
                                        espera.Espera();
                                        break;
                                    default:
                                        System.out.println("Opción inválida.");
                                        break;
                                }
                                break;

                            case 3:
                                // Caso de la pirámide
                                Figura piramide = new Piramide();
                                System.out.println("Ingrese los puntos de la base de la pirámide:");
                                for (int i = 0; i < 3; i++) {
                                    ((Piramide) piramide).ingresarPuntos();
                                }
                                System.out.println("Ingrese la altura de la pirámide:");
                                ((Piramide) piramide).altura = scanner.nextDouble();
                                System.out.println("1. Calcular perímetro");
                                System.out.println("2. Calcular área de la base del triangulo");
                                System.out.println("3. Calcular área superficial de la piramide ");
                                System.out.println("4. Calcular volumen");
                                poa = scanner.nextInt();
                                switch (poa) {
                                    case 1:
                                        System.out.println("El perímetro de la pirámide es: " + piramide.calcularPerimetro());
                                        espera.Espera();
                                        break;
                                    case 2:
                                        System.out.println("El área de la base de la pirámide es: " + ((Piramide) piramide).calcularArea());
                                        espera.Espera();
                                        break;
                                    case 3:
                                        System.out.println("El area superficual  de la pirámide es: " + piramide.calcularAreaSuperficial());
                                        espera.Espera();
                                        break;
                                    case 4:
                                        System.out.println("El volumen de la pirámide es: " + piramide.calcularVolumen());
                                        espera.Espera();
                                        break;
                                    default:
                                        System.out.println("Opción inválida.");
                                        espera.Espera();
                                        break;
                                }
                                break;

                            case 0:
                                System.out.println("Volviendo al menú principal...");
                                espera.Espera();
                                break;

                            default:
                                System.out.println("Opción inválida.");
                                break;
                        }
                    } while (opcion3D != 0);
                    break;

                case 0:
                    System.out.println("Saliendo del programa...");
                    espera.Espera();
                    break;

                default:
                    System.out.println("Opción inválida.");
                    break;
            }
        } while (opcion != 0);
    }
}