public abstract class FiguraGeometrica {
    protected String color;

    public FiguraGeometrica(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    // Método abstracto: obliga a las subclases a darle una implementación
    public abstract double calcularArea();
}