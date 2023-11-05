import java.util.Scanner;

public class except{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Enter two numbers: ");
            int num1 = Integer.parseInt(scanner.nextLine());
            int num = Integer.parseInt(scanner.nextLine());
            
            if (num == 0) {
                throw new ArithmeticException("Division by zero is not allowed");
            }
            
            int result = num1 / num;
            System.out.println("Result: " + result);
        } catch (NumberFormatException e) {
            System.err.println("NumberFormatException: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.err.println("ArithmeticException: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("General Exception: " + e.getMessage());
        } finally {
            System.out.println("This block always gets executed.");
            scanner.close();
        }
    }
}
