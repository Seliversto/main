package homework4;

public class Rush {
    public  static  void  main(String[] args ) {

        Shape circle = new Circle(9.56);
        Shape triangle = new Triangle(21.23, 33.75);
        Shape rectangle = new Rectangle(4.74, 65.5);

        printShapes(circle, triangle, rectangle);

    }

    public static void printShapes(Shape... shapes) {
        for (Shape shape : shapes) {
            System.out.println("Площадь фигуры " + shape.square());
        }
    }
}
