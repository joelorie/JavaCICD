package joelorie.github.io;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Select an option: " );
        System.out.println("1. Variable Operations");
        System.out.println("2. Grade Calculator");
        System.out.println("3. Print Number Sequence");
        System.out.println("4. Number Sequence Factorial Calculator");
        System.out.println("5. Print Pattern");
        System.out.println("6. Print advanced pattern");
        System.out.println("7. Console Calculator");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        scanner.nextLine();
        switch (choice) {
            case 1 -> VariableOperations.run(scanner);
            case 2 -> GradeCalculator.calculateGrade(scanner);
            case 3 -> NumberSequence.printNumbers();
            case 4 -> InputValidation.validateInputAndDisplayFactorial(scanner);
            case 5 -> PatternPrinting.printPattern();
            case 6 -> AdvancedPatternPrinting.printAdvancedPattern();
            case 7 -> ConsoleCalculator.consoleCalculate(scanner);
            default -> System.out.println("Invalid option selected.");
        }
        scanner.close();
    }
}
