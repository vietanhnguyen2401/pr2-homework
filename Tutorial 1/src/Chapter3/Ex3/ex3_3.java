package Chapter3.Ex3;
import utils.TextIO_old;

public class ex3_3 {
    public static void main(String[] args) {

        double firstNum;
        double secondNum;
        char operator;
        double value;

        System.out.println("Enter expressions such as  2 + 2  or  34.2 * 7.81");
        System.out.println("Using any of the operators +, -, *, /.");
        System.out.println("To end, enter a 0.");
        System.out.println();

        while (true) {

            /* Get user's input, ending program if first number is 0. */

            System.out.print("");
            firstNum = TextIO_old.getDouble();
            if (firstNum == 0)
                break;
            operator = TextIO_old.getChar();
            secondNum = TextIO_old.getlnDouble();

            /* Compute the value of the expression. */

            switch (operator) {
                case '+':
                    value = firstNum + secondNum;
                    break;
                case '-':
                    value = firstNum - secondNum;
                    break;
                case '*':
                    value = firstNum * secondNum;
                    break;
                case '/':
                    value = firstNum / secondNum;
                    break;
                default:
                    System.out.println("Unknown operator: " + operator);
                    continue;  // Back to start of loop!
            } // end switch

            /* Display the value. */

            System.out.println("Value is " + value);
            System.out.println();

        } // end while
        System.out.println("Good bye");
    }
}
