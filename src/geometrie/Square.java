package geometrie;

public class Square implements Shape, Comparable<Square> {

    private int l;

    public Square(int l) {
        this.l = l;
    }

    @Override
    public double area() {
        return l + l;
    }

    @Override
    public int compareTo(Square o) {
        return 0;
    }

    public void drawSquare(){

    }
}
