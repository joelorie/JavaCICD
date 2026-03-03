package joelorie.github.io;

public class ConsoleCalculator {
  public static void consoleCalculate(java.util.Scanner scanner) {
    while (true) {
      System.out.println("=== Console Calculator ===");
      System.out.println("1. Addition");
      System.out.println("2. Subtraction");
      System.out.println("3. Multiplication");
      System.out.println("4. Division");
      System.out.println("5. Exit");
      System.out.print("Select an operation (1-5): ");
      int choice = scanner.nextInt();
      if (choice == 5) {
        System.out.println("=== Exiting Console Calculator ===");
        break;
      }
      System.out.println("Enter first number:");
      double num1 = getNumber(scanner);
      System.out.println("Enter second number:");
      double num2 = getNumber(scanner);
      if (choice == 1) {
        System.out.println("Result of " + num1 + " + " + num2 + ": " + (num1 + num2));
        System.out.println();
      } else if (choice == 2) {
        System.out.println("Result of " + num1 + " - " + num2 + ": " + (num1 - num2));
        System.out.println();
      } else if (choice == 3) {
        System.out.println("Result of " + num1 + " * " + num2 + ": " + (num1 * num2));
        System.out.println();
      } else if (choice == 4) {
        if (num2 == 0) {
          System.out.println("Error: Division by zero.");
          System.out.println();
        } else {
          System.out.println("Result of " + num1 + " / " + num2 + ": " + (num1 / num2));
        }
      }

      System.out.println();
      System.out.println("Do you want to perform another calculation? (yes/no): ");
      String again = scanner.next();
      if (!again.equalsIgnoreCase("yes")) {
        System.out.println("=== Exiting Console Calculator ===");
        break;
      } else {
        System.out.println();
      }
    }

  }

  public static double getNumber(java.util.Scanner scanner) {
    while (true) {
      if (scanner.hasNextDouble()) {
        return scanner.nextDouble();
      } else {
        System.out.println("Invalid input. Please enter a valid number.");
        scanner.next();
      }
    }
  }

  public static char getOperator(java.util.Scanner scanner) {
    while (true) {
      String input = scanner.next();
      if (input.length() == 1 && "+-*/".indexOf(input.charAt(0)) != -1) {
        return input.charAt(0);
      } else {
        System.out.println("Invalid operator. Please enter one of +, -, *, /.");
      }
    }
  }
}
