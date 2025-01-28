public class CalculadoraGeometrica {

    private static Object args;

    public static double calcularAreaCirculo (double radio) {
        return Math.PI * radio * radio;
    }

    public static double calcularAreaRectangulo (double largo, double ancho) {
        return largo * ancho;
    }

    public static void main(String[] args) {
        double areaCirculo = calcularAreaCirculo(5.0);
        double areaRectangulo = calcularAreaRectangulo(4.0, 6.0);

        System.out.println("Area del circulo: " + areaCirculo);
        System.out.println("Area del rectangulo: " + areaRectangulo);
    }
}
