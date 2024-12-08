package task.oop;

public class WarehouseWorker extends Employee{
  private String shift;

  public WarehouseWorker(String name, int age, String shift) {
    super(name, age);
    this.shift = shift;
  }

  public void work() {
    System.out.println("Имя сотрудника " + name + ". Его возраст " + age + " года. Работает на дожности" + shift);
  }
}