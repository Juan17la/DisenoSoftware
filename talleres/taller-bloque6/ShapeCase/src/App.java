public class App {
    public static void main(String[] args) throws Exception {
        Shape shape = new Shape("blue", true);

        Circle circle = new Circle(5.0, "green", true);
        System.out.println(circle);

        Rectangle rectangle = new Rectangle(4.0, 6.0, "yellow", false);
        System.out.println(rectangle);

        Square square = new Square(3.0, "red", true);
        System.out.println(square);
    }
}