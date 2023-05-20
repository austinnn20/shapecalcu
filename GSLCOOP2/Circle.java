package GSLCOOP2;

//Circle class extending Shape and implementing Calculable
class Circle extends Shape implements Calculable {
 private double radius;

 public Circle(double radius) {
     this.radius = radius;
 }

 @Override
 public void display() {
     System.out.println("Circle");
 }

 @Override
 public double calculateArea() {
     return Math.PI * radius * radius;
 }

 @Override
 public double calculatePerimeter() {
     return 2 * Math.PI * radius;
 }
}