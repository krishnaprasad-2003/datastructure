// File: SumCalculator.java
public class SumCalculator {
    public int calculateSum(int[] numbers) throws NegativeInputException {
        int sum = 0;
        
        for (int num : numbers) {
            if (num < 0) {
                throw new NegativeInputException("Negative input found.");
            }
            sum += num;
        }
        
        return sum;
    }
}
