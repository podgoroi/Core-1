package task.methods;

public class Methods {

  public String stringToLowerCase(String str) {
    String lowerStr = str.toLowerCase();
    return lowerStr;
  }

  public int sumOfTwoNumbers(int a, int b) {
    int result = a + b;
    return result;
  }

  public String sumOfTwoStrings(String a, String b) {
    String sumStrings = a +b;
    return sumStrings;
  }

  public String sumOfStringAndNumber(String str, int num) {
    int a = Integer.parseInt(str);
    String sumStr = Integer.toString(num + a);
    return sumStr;
  }

  public boolean compareStringNumberWithInt(String str, int num) {
    int str1 = Integer.parseInt(str);
    boolean bool = num > str1;
    return bool;
  }

  public boolean checkBooleans(boolean a, boolean b) {
    boolean c = a || b;
    return c;
  }

  public boolean isEven(int num) {
    boolean bool = num % 2 == 0 ? true : false;
    return bool;
  }

  public String checkArrayEvenOdd(int[] arr) {
    String result;
    int count = 0;
    for (int i = 0; i < arr.length; i++){
      if (arr[i] % 2 == 0) {
        count ++;
      } else {
        break;
      }
    }
    if (count == 0){
      result = "Массив нечетных чисел";
    } else if (count == arr.length){
      result = "Массив четных чисел";
    } else {
      result = "Массив четных и нечетных чисел";
    }
    return result;
  }

  public int[] sumArrayElements(int[] arr) {
    int[] arr2 = new int[arr.length];
    int count = 0;
    for (int i = 0; i < arr.length; i++) {
      count += arr[i];
      arr2[i] = count;
    }
    return arr2;
  }

  public int sumArray(int[] arr) {
    int result = 0;
    for (int i = 0; i < arr.length; i++) {
      result += arr[i];
    }
    return result;
  }

  public int ageInMonths(int years) {
    int months = years * 12;
    return months;
  }

  public int ageInMinutes(int years) {
    return 0;
  }

  public int ageInHours(int years) {
    return 0;
  }

  public boolean areNamesEqual(String name1, String name2) {
    name1 = name1.toLowerCase();
    name2 = name2.toLowerCase();
    boolean a;
    if (name1.equals(name2)) {
      a = true;
    } else {
      a = false;
    }
    return a;
  }

  public int getLastElement(int[] arr) {
    int count = arr[arr.length - 1];
    return count;
  }

  public int countLetterA(String str) {
    char[] chars = str.toCharArray();
    int count = str.length();
    return count;
  }

  private int wallet = 1000;

  public String withdraw(int amount) {
    String result;
    if (amount > wallet) {
      result = "Сумма слишком большая";
    } else {
      result = "Остаток в кошельке: " + (wallet - amount);
    }
    return result;
  }

  public String deposit(int amount) {
    return null;
  }
}
// Мои доработки