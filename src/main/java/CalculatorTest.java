public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        // Test Case 1: Kiểm tra cộng số dương
        int result1 = calculator.add(5, 10);
        if (result1 == 15) {
            System.out.println("Test Case 1 Passed: add(5, 10) = 15");
        } else {
            System.out.println("Test Case 1 Failed: Expected 15 but got " + result1);
        }

        // Test Case 2: Kiểm tra cộng số âm
        int result2 = calculator.add(-5, -10);
        if (result2 == -15) {
            System.out.println("Test Case 2 Passed: add(-5, -10) = -15");
        } else {
            System.out.println("Test Case 2 Failed: Expected -15 but got " + result2);
        }

        // Test Case 3: Kiểm tra cộng số dương và số âm
        int result3 = calculator.add(5, -10);
        if (result3 == -5) {
            System.out.println("Test Case 3 Passed: add(5, -10) = -5");
        } else {
            System.out.println("Test Case 3 Failed: Expected -5 but got " + result3);
        }
    }
}
