package joelorie.github.io;

public class InputValidation {
  public static void validateInputAndDisplayFactorial(java.util.Scanner scanner) {
    while (true) {
      System.out.println("Enter a positive integer: ");
      String input = scanner.nextLine();
      try {
        int number = Integer.parseInt(input);
        if (number >= 0) {
          long factorial = 1;
          for (int i = 1; i <= number; i++) {
            factorial *= i;
          }
          System.out.println("Factorial of " + number + " is: " + factorial);
          break;
        } else {
          System.out.println("Please enter a valid positive integer.");
        }
      } catch (NumberFormatException e) {
        System.out.println("Please enter a valid positive integer.");
        continue;
      }
    }
  }
}
