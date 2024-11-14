// File: SumCalculatorTest.java
public class SumCalculatorTest {
    public static void main(String[] args) {
        SumCalculator calculator = new SumCalculator();
        int[] numbers = {10, 20, 30, -5, 40};
        
        try {
            int sum = calculator.calculateSum(numbers);
            System.out.println("Sum: " + sum);
        } catch (NegativeInputException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
