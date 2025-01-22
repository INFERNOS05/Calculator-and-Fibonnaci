import java.util.Scanner;

public class UserInput {
    private Scanner scanner;

    public UserInput(Scanner scanner) {
        this.scanner = scanner; //Assign the provided scanner instance to the class field
    }

    public int getNumberInput() {
        System.out.print("Enter an integer: ");
        return scanner.nextInt(); //Retrieve and return an integer value from the user
    }

    public double getDoubleInput() {
        System.out.print("Enter a number: ");
        return scanner.nextDouble(); //Accept a decimal value and return it
    }

    public double[] getArrayInput(int size) {
        double[] array = new double[size];
        System.out.println("Provide " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextDouble(); //Capture each decimal number from the user
        }
        return array; // Send back the array of decimal numbers
    }

    public int[] getIntArrayInput(int size) {
        int[] array = new int[size];
        System.out.println("Provide " + size + " integers:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt(); //Store each integer input from the user
        }
        return array; //Return the integer array to the caller
    }
}

