package geometrie;

public class Rectangle implements Shape {
    private double l;
    private double L;

    public Rectangle(double l, double L) {
        this.l = l;
        this.L = L;
    }

    @Override
    public double area() {
        return l * L;
    }
}
