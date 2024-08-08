package csed8;

public class sum {

    // Method to add two numbers
    public static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        // Test the add method
        int num1 = 500;
        int num2 = 10;
        
        // Call the add method and store the result
        int result = add(num1, num2);
        
        // Print the result
        System.out.println("The sum of " + num1 + " and " + num2 + " is " + result);
    }
}
