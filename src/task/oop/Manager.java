package task.oop;

public class Manager extends Employee{

  private String department;

  public Manager(String name, int age, String department) {
    super(name, age);
    this.department = department;
  }

  public void work() {
    System.out.println("Имя сотрудника " + name + ". Его возраст " + age + ". Он работает на дожности " + department);
  }
}