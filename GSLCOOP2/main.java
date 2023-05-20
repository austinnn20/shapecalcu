package GSLCOOP2;

// Abstract class representing a Shape
abstract class Shape {
    public abstract void display();

    public abstract double calculateArea();

    public abstract double calculatePerimeter();
}

// Interface representing Calculable behavior
interface Calculable {
    double calculateArea();

    double calculatePerimeter();
}

public class main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 6);
        Triangle triangle = new Triangle(5, 3, 4, 5, 6);

        circle.display();
        System.out.println("Area: " + circle.calculateArea());
        System.out.println("Perimeter: " + circle.calculatePerimeter());

        rectangle.display();
        System.out.println("Area: " + rectangle.calculateArea());
        System.out.println("Perimeter: " + rectangle.calculatePerimeter());

        triangle.display();
        System.out.println("Area: " + triangle.calculateArea());
        System.out.println("Perimeter: " + triangle.calculatePerimeter());
    }
}