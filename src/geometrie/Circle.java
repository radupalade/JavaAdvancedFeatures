package geometrie;

public class Circle implements Shape {

    private double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double area() {
        return r * r * Math.PI;
    }


}
