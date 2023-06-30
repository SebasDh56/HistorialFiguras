class Circulo implements Figura {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    @Override
    public void ingresarPuntos() {
        // No se necesita implementar en esta clase
    }

    @Override
    public void mostrarHistorial() {
        // No se necesita implementar en esta clase
    }
}