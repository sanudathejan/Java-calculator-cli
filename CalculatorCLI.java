import java.util.Scanner;

public class CalculatorCLI {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true ;

        System.out.println("Simple Calculator ");
        System.out.println("Available operations in project are : + - * / ");
        System.out.println("Type 'exit' to quit\n");

        while (running) { 
            System.out.println("Enter first number: ");
            String input = scanner.next();

            if (input.equalsIgnoreCase("exit")) {
                running = false;
                break;
            }
             double num1;
             try{ 
                num1 = Double.parseDouble(input);
             }catch (NumberFormatException e) {
                System.out.println("Invalid Number! Try again.\n");
                continue;

             }  
             System.out.print("Enter operator (+ - * /): ");
             char operator = scanner.next().charAt(0);
             
             System.out.print("Enter second number:");
             double num2;
             try { 
                num2 = Double.parseDouble(scanner.next());
             } catch (NumberFormatException e ) {
                System.out.println("Invalid number! Try again.\n");
                continue;
             }

             double result = 0;
             boolean validOperation = true;

             switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 == 0) {
                        System.out.println("Error!! Division by zero.");
                        validOperation = false;
                    } else {
                        result = num1 / num2;
                    }
                    break;
                default:
                    System.out.println("Invalid operator!");
                    validOperation = false;
             }
             if (validOperation) {
                System.out.println("Result: "+ result + "\n");
             } 
        } 

        System.out.println("Calculator exited.");
        scanner.close();
    }
}
