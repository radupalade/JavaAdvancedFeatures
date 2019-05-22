package geometrie;

public class Main {
    public static void main(String[] args) {


        Shape circle = new Circle(2);
        Shape square = new Square(4);
        Shape rectangle = new Rectangle(2, 3);

        displayArea(rectangle);
        displayArea(circle);
        displayArea(square);
    }

    public static void displayArea(Shape s) {
        System.out.println("Method was called with: " + s.getClass());
        System.out.println(s.area());
        if (s instanceof Square) {
            Square sq = (Square) s;
            sq.drawSquare();
        }


    }

      /*  Square square2 = new Square(5);

        square.compareTo(square2);
      */


}
