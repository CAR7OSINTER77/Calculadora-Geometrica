public class FiguraGeometrica {

    private double radio;
    private double largo;
    private double ancho;

    public FiguraGeometrica(double radio) {
        this.radio = radio;
    }

    public FiguraGeometrica(double largo, double ancho) {
        this.largo = largo;
        this.ancho = ancho;
    }

    public double calcularAreaCirculo() {
        return Math.PI * radio * radio;
    }

    public double calcularAreaRectangulo() {
        return largo * ancho;
    }

    public static void main(String[] args) {
        FiguraGeometrica circulo = new FiguraGeometrica(5.0);
        double areaCirculo = circulo.calcularAreaCirculo();

        FiguraGeometrica rectangulo = new FiguraGeometrica(4.0, 6.0);
        double areaRectangulo = rectangulo.calcularAreaRectangulo();

        System.out.println("Área del círculo: " + areaCirculo);
        System.out.println("Área del rectángulo: " + areaRectangulo);
    }
}
