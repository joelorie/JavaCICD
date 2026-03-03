package joelorie.github.io;

public class NumberSequence {
  public static void printNumbers() {
    for (int i = 1; i <= 20; i++) {
      if (i % 2 == 0 && i % 5 == 0) {
        System.out.println(i + " - even, Multiple of 5");
      }else if (i % 2 == 0) {
        System.out.println(i + " - even");
      } else if (i % 2 != 0 && i % 5 == 0) {
        System.out.println(i + " - odd, Multiple of 5");
      } else {
        System.out.println(i + " - odd");
      }
    }
  }
}
