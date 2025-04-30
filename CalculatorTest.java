public class CalculatorTest {

    public static void main(String[] args) {
        String result = Calculator.Run("10+5*3"); 
        System.out.println(result);
        
        if ("25.0".equals(result)) {
            System.out.println("Test passed.");
        } else {
            System.out.println("Test failed. Got: " + result);
        }
    }
}
