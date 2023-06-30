class Cuadrado implements Figura {
    private double lado;

    public Cuadrado(double x1, double y1, double z1, double x2, double y2, double z2) {
        double distancia = calcularDistancia(x1, y1, z1, x2, y2, z2);
        this.lado = distancia;
    }

    private double calcularDistancia(double x1, double y1, double z1, double x2, double y2, double z2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2) + Math.pow(z2 - z1, 2));
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }

    @Override
    public double calcularVolumen() {
        return 0;
    }

    @Override
    public String toString() {
        return "Cuadrado - Lado: " + lado + " - Área: " + calcularArea();
    }
}
