class Triangulo implements Figura {
    private double lado1;
    private double lado2;
    private double lado3;

    public Triangulo(double x1, double y1, double z1, double x2, double y2, double z2,
                     double x3, double y3, double z3) {
        double distancia1 = calcularDistancia(x1, y1, z1, x2, y2, z2);
        double distancia2 = calcularDistancia(x2, y2, z2, x3, y3, z3);
        double distancia3 = calcularDistancia(x3, y3, z3, x1, y1, z1);
        this.lado1 = distancia1;
        this.lado2 = distancia2;
        this.lado3 = distancia3;
    }

    private double calcularDistancia(double x1, double y1, double z1, double x2, double y2, double z2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2) + Math.pow(z2 - z1, 2));
    }

    @Override
    public double calcularArea() {
        double s = (lado1 + lado2 + lado3) / 2;
        return Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
    }

    @Override
    public double calcularVolumen() {
        return 0;
    }

    @Override
    public double calcularPerimetro() {
        return 0;
    }

    @Override
    public String toString() {
        return "Triángulo - Lado 1: " + lado1 + " - Lado 2: " + lado2 + " - Lado 3: " + lado3
                + " - Área: " + calcularArea();
    }
}