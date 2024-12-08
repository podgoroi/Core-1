package task.oop;

public class Child1 extends task.oop.Parent{

  public int sumOfTwoNumbers(int a, int b) {
    return a * b;
  }
  @Override
  public int sumOfStringAndNumber(String str, int num) {
    int result = super.sumOfStringAndNumber(str, num);
    return result * 2;
  }

  public String returnString(String str) {
    char [] a = str.toCharArray();
    String str1 = "" + a[0];
    return str1;
  }

  public void printParent() {
    System.out.println("I am Child1");
  }

  public String concatenateStrings(String str1, String str2) {
    String result = super.concatenateStrings(str1, str2);
    char [] a = result.toCharArray();
    String sum = "";
    for (int i = 0; i < (a.length / 2); i++){
      sum+=a[i];
    }
    return sum;
  }
}