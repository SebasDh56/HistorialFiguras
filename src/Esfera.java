class Esfera implements Figura {
    private double radio;

    public Esfera(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return 4 * Math.PI * radio * radio;
    }

    @Override
    public double calcularVolumen() {
        return (4 / 3) * Math.PI * Math.pow(radio, 3);
    }

    @Override
    public String toString() {
        return "Esfera - Radio: " + radio + " - Área: " + calcularArea() + " - Volumen: " + calcularVolumen();
    }
}