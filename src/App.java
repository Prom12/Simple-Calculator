import java.util.Scanner;

// Operation interface
interface Operation {
    int apply(int x, int y);
}

// Concrete classes implementing the Operation interface
class AddOperation implements Operation {
    public int apply(int x, int y) {
        return x + y;
    }
}

class SubtractOperation implements Operation {
    public int apply(int x, int y) {
        return x - y;
    }
}

class MultiplyOperation implements Operation {
    public int apply(int x, int y) {
        return x * y;
    }
}

class DivideOperation implements Operation {
    public int apply(int x, int y) {
        if (y != 0) {
            return x / y;
        } else {
            System.out.println("Cannot divide by zero.");
            return 0; // Return a default value in case of division by zero
        }
    }
}

// OperationFactory responsible for creating Operation objects
class OperationFactory {
    public static Operation createOperation(String operator) {
        switch (operator) {
            case "add":
                return new AddOperation();
            case "subtract":
                return new SubtractOperation();
            case "multiply":
                return new MultiplyOperation();
            case "divide":
                return new DivideOperation();
            default:
                throw new IllegalArgumentException("Invalid operator. Please enter add, subtract, divide, or multiply.");
        }
    }
}

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int result = 0;

        System.out.println("Welcome to A Simple Calculator that takes in two numbers");

        System.out.println("Please enter the first number");
        int x = scanner.nextInt();

        System.out.println("Please enter the Second number");
        int y = scanner.nextInt();

        System.out.println("Please type in add or subtract or divide or multiply");
        String operator = scanner.next().toLowerCase();

        try {
            // Using the Factory to create an Operation object
            Operation operation = OperationFactory.createOperation(operator);

            // Apply the selected operation
            result = operation.apply(x, y);

            // Display the result
            System.out.println("The result is: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}
