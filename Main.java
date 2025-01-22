import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserInput userInput = new UserInput(scanner);
        Calculator calculator = new Calculator();

        System.out.println("Welcome to the Calculator Program!");

        boolean exit = false;
        while (!exit) {
            System.out.println("Choose an option:");
            System.out.println("1. Add\n2. Subtract\n3. Multiply\n4. Divide\n5. Fibonacci\n6. Mean\n7. Mode\n8. Exit");
            int choice = userInput.getNumberInput();

            switch (choice) {
                case 1:
                    System.out.println("Input two numbers:");
                    double a = userInput.getDoubleInput();
                    double b = userInput.getDoubleInput();
                    System.out.println("The sum is: " + calculator.add(a, b));
                    break;
                case 2:
                    System.out.println("Input two numbers:");
                    a = userInput.getDoubleInput();
                    b = userInput.getDoubleInput();
                    System.out.println("The difference is: " + calculator.subtract(a, b));
                    break;
                case 3:
                    System.out.println("Input two numbers:");
                    a = userInput.getDoubleInput();
                    b = userInput.getDoubleInput();
                    System.out.println("The product is: " + calculator.multiply(a, b));
                    break;
                case 4:
                    System.out.println("Input two numbers:");
                    a = userInput.getDoubleInput();
                    b = userInput.getDoubleInput();
                    System.out.println("The quotient is: " + calculator.divide(a, b));
                    break;
                case 5:
                    System.out.println("Enter a number for the Fibonacci sequence:");
                    int n = userInput.getNumberInput();
                    System.out.println("Fibonacci result: " + calculator.fibonacci(n));
                    break;
                case 6:
                    System.out.println("Specify the size of the array:");
                    int size = userInput.getNumberInput();
                    double[] arr = userInput.getArrayInput(size);
                    System.out.println("The mean is: " + calculator.mean(arr));
                    break;
                case 7:
                    System.out.println("Specify the size of the array:");
                    size = userInput.getNumberInput();
                    int[] intArr = userInput.getIntArrayInput(size);
                    System.out.println("The mode is: " + calculator.mode(intArr));
                    break;
                case 8:
                    exit = true;
                    System.out.println("Closing the program. See you next time!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();
    }
}

