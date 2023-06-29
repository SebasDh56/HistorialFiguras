class Piramide implements Figura {
    private Punto punto1;
    private Punto punto2;
    private Punto punto3;
    private Punto puntoVertice;

    public Piramide(Punto punto1, Punto punto2, Punto punto3, Punto puntoVertice) {
        this.punto1 = punto1;
        this.punto2 = punto2;
        this.punto3 = punto3;
        this.puntoVertice = puntoVertice;
    }

    @Override
    public double calcularPerimetro() {
        double lado1 = calcularDistancia(punto1, punto2);
        double lado2 = calcularDistancia(punto2, punto3);
        double lado3 = calcularDistancia(punto3, punto1);
        return lado1 + lado2 + lado3;
    }

    @Override
    public double calcularArea() {
        return calcularAreaBase();
    }

    @Override
    public double calcularAreaSuperficial() {
        double areaBase = calcularAreaBase();
        double areaTriangulo1 = calcularAreaTriangulo(punto1, punto2, puntoVertice);
        double areaTriangulo2 = calcularAreaTriangulo(punto2, punto3, puntoVertice);
        double areaTriangulo3 = calcularAreaTriangulo(punto3, punto1, puntoVertice);
        return areaBase + areaTriangulo1 + areaTriangulo2 + areaTriangulo3;
    }

    @Override
    public double calcularVolumen() {
        double areaBase = calcularAreaBase();
        double altura = calcularAltura();
        return (areaBase * altura) / 3;
    }

    private double calcularDistancia(Punto punto1, Punto punto2) {
        double dx = punto2.getX() - punto1.getX();
        double dy = punto2.getY() - punto1.getY();
        double dz = punto2.getZ() - punto1.getZ();
        return Math.sqrt(dx * dx + dy * dy + dz * dz);
    }

    private double calcularAreaBase() {
        double lado1 = calcularDistancia(punto1, punto2);
        double lado2 = calcularDistancia(punto2, punto3);
        double lado3 = calcularDistancia(punto3, punto1);
        double semiperimetro = calcularPerimetro() / 2;
        double areaBase = Math.sqrt(semiperimetro * (semiperimetro - lado1) * (semiperimetro - lado2) * (semiperimetro - lado3));
        return areaBase;
    }

    private double calcularAreaTriangulo(Punto punto1, Punto punto2, Punto punto3) {
        double lado1 = calcularDistancia(punto1, punto2);
        double lado2 = calcularDistancia(punto2, punto3);
        double lado3 = calcularDistancia(punto3, punto1);
        double semiperimetro = (lado1 + lado2 + lado3) / 2;
        double area = Math.sqrt(semiperimetro * (semiperimetro - lado1) * (semiperimetro - lado2) * (semiperimetro - lado3));
        return area;
    }

    private double calcularAltura() {
        double areaBase = calcularAreaBase();
        double lado1 = calcularDistancia(punto1, punto2);
        return (2 * areaBase) / lado1;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Pirámide");
        System.out.println("Punto 1: (" + punto1.getX() + ", " + punto1.getY() + ", " + punto1.getZ() + ")");
        System.out.println("Punto 2: (" + punto2.getX() + ", " + punto2.getY() + ", " + punto2.getZ() + ")");
        System.out.println("Punto 3: (" + punto3.getX() + ", " + punto3.getY() + ", " + punto3.getZ() + ")");
        System.out.println("Punto Vertice: (" + puntoVertice.getX() + ", " + puntoVertice.getY() + ", " + puntoVertice.getZ() + ")");
        System.out.println("Perímetro: " + calcularPerimetro());
        System.out.println("Área: " + calcularArea());
        System.out.println("Área Superficial: " + calcularAreaSuperficial());
        System.out.println("Volumen: " + calcularVolumen());
        System.out.println();
    }
}
