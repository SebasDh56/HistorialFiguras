class Piramide implements Figura {
    private double lado1;
    private double lado2;
    private double lado3;
    private double altura;

    public Piramide(double x1, double y1, double z1, double x2, double y2, double z2,
                    double x3, double y3, double z3, double x4, double y4, double z4) {
        double distancia1 = calcularDistancia(x1, y1, z1, x2, y2, z2);
        double distancia2 = calcularDistancia(x2, y2, z2, x3, y3, z3);
        double distancia3 = calcularDistancia(x3, y3, z3, x1, y1, z1);
        this.lado1 = distancia1;
        this.lado2 = distancia2;
        this.lado3 = distancia3;
        this.altura = calcularDistancia(x4, y4, z4, calcularBaricentroX(x1, x2, x3), calcularBaricentroY(y1, y2, y3),
                calcularBaricentroZ(z1, z2, z3));
    }

    private double calcularDistancia(double x1, double y1, double z1, double x2, double y2, double z2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2) + Math.pow(z2 - z1, 2));
    }

    private double calcularBaricentroX(double x1, double x2, double x3) {
        return (x1 + x2 + x3) / 3;
    }

    private double calcularBaricentroY(double y1, double y2, double y3) {
        return (y1 + y2 + y3) / 3;
    }

    private double calcularBaricentroZ(double z1, double z2, double z3) {
        return (z1 + z2 + z3) / 3;
    }

    @Override
    public double calcularArea() {
        double areaBase = calcularAreaTriangulo(lado1, lado2, lado3);
        double areaLateral = calcularAreaTriangulo(lado1, altura) +
                calcularAreaTriangulo(lado2, altura) +
                calcularAreaTriangulo(lado3, altura);
        return areaBase + areaLateral;
    }

    private double calcularAreaTriangulo(double lado1, double lado2, double lado3) {
        double s = (lado1 + lado2 + lado3) / 2;
        return Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
    }

    private double calcularAreaTriangulo(double base, double altura) {
        return (base * altura) / 2;
    }

    @Override
    public double calcularVolumen() {
        double areaBase = calcularAreaTriangulo(lado1, lado2, lado3);
        return (areaBase * altura) / 3;
    }

    @Override
    public double calcularPerimetro() {
        return 0;
    }

    @Override
    public String toString() {
        return "Pirámide - Lado 1: " + lado1 + " - Lado 2: " + lado2 + " - Lado 3: " + lado3
                + " - Altura: " + altura + " - Área: " + calcularArea() + " - Volumen: " + calcularVolumen();
    }
}
