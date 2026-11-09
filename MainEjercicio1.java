public class MainEjercicio1 {
    public static void main(String[] args) {
        // La siguiente línea provocaría un error de compilación:
        // FiguraGeometrica figura = new FiguraGeometrica("Rojo"); 
        // Error: FiguraGeometrica is abstract; cannot be instantiated

        Circulo circulo = new Circulo("Rojo", 5.0);
        Rectangulo rectangulo = new Rectangulo("Azul", 4.0, 6.0);

        System.out.println("Área del Círculo (" + circulo.getColor() + "): " + String.format("%.2f", circulo.calcularArea()));
        System.out.println("Área del Rectángulo (" + rectangulo.getColor() + "): " + rectangulo.calcularArea());
    }
}