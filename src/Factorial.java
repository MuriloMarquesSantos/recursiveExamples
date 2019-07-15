import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {

        int typedNumber;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please type an Integer number greater than 0, for Factorial Method");
        typedNumber = scanner.hasNextInt() ? scanner.nextInt() : -1;

        if (typedNumber < 0 ) {
            System.out.println("You typed un invalid value, please insert Integer greater than 0");
        }
        else {
            System.out.println("The factorial of your number is: " + executeFactorial(typedNumber));
        }
    }

    static int executeFactorial(int n) {
        if (n >=1) {
           return n * executeFactorial(n -1);
        }
        else {
           return 1;
        }
    }
}
