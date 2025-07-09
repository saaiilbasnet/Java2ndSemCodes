import java.util.Scanner;

// Custom Exception
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class AgeInputValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter your age: ");
            String input = scanner.nextLine();

            // Check if input is numeric
            if (!input.matches("\\d+")) {
                throw new InvalidAgeException("Age must be a numeric value.");
            }

            int age = Integer.parseInt(input);

            // Check valid age range
            if (age <= 0 || age > 120) {
                throw new InvalidAgeException("Age must be between 1 and 120.");
            }

            System.out.println("Your age is: " + age);

        } catch (InvalidAgeException e) {
            System.out.println("Invalid Age: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
