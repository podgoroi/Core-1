package task.oop;

public class Parent {

  public int sumOfTwoNumbers(int a, int b) {
    int sumNumbers = a + b;
    return sumNumbers;
  }

  public int sumOfStringAndNumber(String str, int num) {
    int str1 = Integer.parseInt(str);
    str1 = str1 + num;
    return str1;
  }

  public String returnString(String str) {
    return str;
  }

  public void printParent() {
    System.out.println("I am Parent");
  }

  public String concatenateStrings(String str1, String str2) {
    String sumStrings = str1 + str2;
    return sumStrings;
  }
}