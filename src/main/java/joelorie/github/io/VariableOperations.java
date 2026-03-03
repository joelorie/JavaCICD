package joelorie.github.io;

public class VariableOperations {
  public static void run(java.util.Scanner scanner) {
    var a = 15;
    var b = 4;
    var c = 7;

    var sum = a + b + c;
    var product = a * b;
    var expression = (a + b) * c;
    var remainder = a % b;
    System.out.println("Sum: " + sum);
    System.out.println("Product: " + product);
    System.out.println("Expression (a + b) * c: " + expression);
    System.out.println("Remainder of a divided by b: " + remainder);  
  }
}
