class Cubo implements Figura {
    private double arista;

    public Cubo(double x1, double y1, double z1, double x2, double y2, double z2) {
        double distancia = calcularDistancia(x1, y1, z1, x2, y2, z2);
        this.arista = distancia;
    }

    private double calcularDistancia(double x1, double y1, double z1, double x2, double y2, double z2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2) + Math.pow(z2 - z1, 2));
    }

    @Override
    public double calcularArea() {
        return 6 * arista * arista;
    }

    @Override
    public double calcularVolumen() {
        return arista * arista * arista;
    }

    @Override
    public double calcularPerimetro() {
        return 0;
    }

    @Override
    public String toString() {
        return "Cubo - Arista: " + arista + " - Área: " + calcularArea() + " - Volumen: " + calcularVolumen();
    }
}