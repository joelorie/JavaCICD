package joelorie.github.io;

public class GradeCalculator {

  public static String getGrade(double score) {
    if (score > 100 || score < 0) {
      return "Score must be between 0 and 100.";
    } else if (score >= 90) {
      return "Grade: A";
    } else if (score >= 80) {
      return "Grade: B";
    } else if (score >= 70) {
      return "Grade: C";
    } else if (score >= 60) {
      return "Grade: D";
    } else {
      return "Grade: F";
    }
  }

  public static void calculateGrade(java.util.Scanner scanner) {
    System.out.println("Enter the score (0-100): ");
    double score = getNumber(scanner);
    System.out.println(getGrade(score));
  }

  public static double getNumber(java.util.Scanner scanner) {
    while (true) {
      try {
        return Double.parseDouble(scanner.nextLine());
      } catch (NumberFormatException e) {
        System.out.println("Invalid input. Please enter a valid number:");
      }
    }
  }
}