package GSLCOOP2;

//Rectangle class extending Shape and implementing Calculable
class Rectangle extends Shape implements Calcu {
 private double length;
 private double width;

 public Rectangle(double length, double width) {
     this.length = length;
     this.width = width;
 }

 @Override
 public void display() {
     System.out.println("Rectangle");
 }

 @Override
 public double calculateArea() {
     return length * width;
 }

 @Override
 public double calculatePerimeter() {
     return 2 * (length + width);
 }
}
