package task.oop;

public class Child2 extends task.oop.Parent{

  public int sumOfTwoNumbers(int a, int b, int c) {
    int sum = super.sumOfTwoNumbers(a , b);
    return sum + c;
  }

  public int sumOfStringAndNumber(String str1, String str2, String str3) {
    int a = Integer.parseInt(str1);
    int b = Integer.parseInt(str2);
    int c = Integer.parseInt(str3);
    return a + b + c;
  }

  public String returnString(String str1, String str2) {
    return str1 + str2;
  }

  public void printParent(String str) {
    System.out.println("I am Child2 " + str);
  }

  public String concatenateStrings(String str1, String str2, String str3) {
    String result = str1 + str2 + str3;
    return result;
  }
}