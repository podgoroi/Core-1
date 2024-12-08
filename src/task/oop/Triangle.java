package task.oop;

public class Triangle extends Figure {
  private double base;
  private double height;

  public Triangle(String name, double base, double height) {
    super(name);
    this.base = base;
    this.height = height;
  }

  public double calculateArea() {
    double area = 0.5 * base * height;
    return area;
  }
}