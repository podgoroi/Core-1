package task.oop;

public class Rectangle extends Figure{

  private double width;
  private double height;

  public Rectangle(String name, double width, double height) {
    super(name);
    this.width = width;
    this.height = height;
  }

  public double calculateArea() {
    double area = width * height;
    return area;
  }
}