import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int result = 0;

        //  Output telling the user what application they are about to use
        System.out.println("Welcome to A Simple Calculator that takes in two numbers");
        //  Tell the to input 2 values
        System.out.println("Please enter the first number");
        int x = scanner.nextInt();

        System.out.println("Please enter the Second number");
        int y = scanner.nextInt();
        //  what do you want to do
        System.out.println("please type in add or substract or divide or multiply");
        String operator = scanner.next().toLowerCase();

        switch(operator){
            case "add":
                 result = x + y;
                break;
            case "substract":
                result = x - y;
                break;
            case "divide":
                if (y != 0)
                    result = x / y;
                break;
            case "multiply":
                result = x * y;
                break;
        }

        //  Result
        System.out.println("The result is : " + result);

        scanner.close();
        
    }
}
