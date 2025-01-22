import java.util.HashMap;
import java.util.Map;

public class Calculator {
    public double add(double a, double b) {
        return a + b; //Compute the sum of the two inputs and return it
    }

    public double subtract(double a, double b) {
        return a - b; //Find the difference between the two inputs
    }

    public double multiply(double a, double b) {
        return a * b; //Calculate the product of the given numbers
    }

    public double divide(double a, double b) {
        if (b == 0) { //Verify that the divisor is not zero
            throw new ArithmeticException("Division by zero is not allowed"); // Raise an error if the divisor is zero
        }
        return a / b; //Perform the division and provide the result
    }

    public int fibonacci(int n) {
        if (n <= 1) return n; //Directly return n if it is 0 or 1
        return fibonacci(n - 1) + fibonacci(n - 2); //Sum the two preceding Fibonacci numbers recursively
    }

    public double mean(double[] array) {
        double sum = 0; //Begin with a total sum of zero
        for (double num : array) { //Loop through all elements in the array
            sum += num; //Add the current element to the total
        }
        return sum / array.length; //Divide the total sum by the number of elements to find the mean
    }

    public int mode(int[] array) {
        Map<Integer, Integer> frequencyMap = new HashMap<>(); //Use a map to count occurrences of each number
        for (int num : array) { //Iterate through the array
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1); //Increment the count for each number
        }

        int mode = array[0]; //Set the mode to the first number in the array initially
        int maxCount = 0; //Start with a maximum count of zero
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > maxCount) { //Check if the current number appears more often than the current maximum
                maxCount = entry.getValue(); //Update the highest frequency
                mode = entry.getKey(); //Set the mode to the number with the highest frequency
            }
        }
        return mode; //Output the mode value
    }
}

