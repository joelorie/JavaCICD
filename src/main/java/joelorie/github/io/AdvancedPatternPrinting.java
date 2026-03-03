package joelorie.github.io;

public class AdvancedPatternPrinting {
  public static void printAdvancedPattern() {
    int rows = 5;
    for (int i = 1; i <= rows; i++) {
      System.out.print(" ".repeat(rows - i));
      System.out.print("*".repeat(i));
      System.out.print(" ");
      System.out.print("*".repeat(i));
      System.out.println();
    }
  }
}
