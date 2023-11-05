import java.util.Scanner;

public class except2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a string: ");
            String input = scanner.nextLine();

            if (!input.equals("India")) {
                throw new NoMatchException("The input does not match 'India'.");
            }

            System.out.println("Input matches 'India'");
        } catch (NoMatchException e) {
            System.out.println("NoMatchException: " + e.getMessage());
        }
    }
}

class NoMatchException extends Exception {
    public NoMatchException(String message) {
        super(message);
    }
}
