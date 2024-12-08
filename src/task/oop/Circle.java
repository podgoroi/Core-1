package task.oop;

public class Circle extends Figure{

  private double radius;

  public Circle(String name, double radius) {
    super(name);
    this.radius = radius;
  }

  public double calculateArea() {
    double area = Math.PI * Math.pow(radius, 2);
    return area;
  }
}