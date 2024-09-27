import com.*;

public class App {
    public static void main(String[] args) throws Exception {
        // Pengujian Lingkaran
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(5.0, "blue");

        System.out.println("Circle 1:");
        System.out.println("Radius: " + circle1.getRadius());
        System.out.println("Area: " + circle1.getArea());
        System.out.println("Perimeter: " + circle1.getPerimeter());
        System.out.println(circle1.toString());
        System.out.println();

        System.out.println("Circle 2:");
        System.out.println("Radius: " + circle2.getRadius());
        System.out.println("Area: " + circle2.getArea());
        System.out.println("Perimeter: " + circle2.getPerimeter());
        System.out.println(circle2.toString());
        System.out.println();
        
        // Pengujian Persegi Panjang
        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle(4.0, 6.0, "red");

        System.out.println("Rectangle 1:");
        System.out.println("Width: " + rectangle1.getWidth());
        System.out.println("Length: " + rectangle1.getLength());
        System.out.println("Area: " + rectangle1.getArea());
        System.out.println("Perimeter: " + rectangle1.getPerimeter());
        System.out.println(rectangle1.toString());
        System.out.println();

        System.out.println("Rectangle 2:");
        System.out.println("Width: " + rectangle2.getWidth());
        System.out.println("Length: " + rectangle2.getLength());
        System.out.println("Area: " + rectangle2.getArea());
        System.out.println("Perimeter: " + rectangle2.getPerimeter());
        System.out.println(rectangle2.toString());
        System.out.println();

        // Pengujian Persegi
        Square square1 = new Square(3.0, "purple");

        System.out.println("Square 1:");
        System.out.println("Side: " + square1.getWidth());
        System.out.println("Area: " + square1.getArea());
        System.out.println("Perimeter: " + square1.getPerimeter());
        System.out.println(square1.toString());
    }
}
