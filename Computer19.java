// File: Computer.java
package dharani;

public class Computer19 {
    // Inner class Processor
    public class Processor {
        // Method to display details of the processor
        public void displayDetails() {
            System.out.println("Processor Details:");
            System.out.println("Brand: Intel");
            System.out.println("Speed: 3.4 GHz");
        }
    }

    // Main method within the same file for simplicity
    public static void main(String[] args) {
        // Create an instance of the outer class Computer
        Computer19 computer = new Computer19();
        
        // Create an instance of the inner class Processor
        Computer19.Processor processor = computer.new Processor();
        
        // Call the displayDetails method
        processor.displayDetails();
    }
}
