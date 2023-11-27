package Chapter3.Ex2;
import java.util.Scanner;
public class ex2_4 {
        public static void main(String[] args) {

            int quarters;
            int dimes;
            int nickels;
            int pennies;

            Scanner stdio = new Scanner( System.in );

            double dollars;

            /* Ask the user for the number of each type of coin. */

            System.out.print("Enter the number of quarters:  ");
            quarters = stdio.nextInt();
            stdio.nextLine();

            System.out.print("Enter the number of dimes:     ");
            dimes = stdio.nextInt();
            stdio.nextLine();

            System.out.print("Enter the number of nickels:   ");
            nickels = stdio.nextInt();
            stdio.nextLine();

            System.out.print("Enter the number of pennies:   ");
            pennies = stdio.nextInt();
            stdio.nextLine();

            /* Add up the values of the coins, in dollars. */

            dollars = (0.25 * quarters) + (0.10 * dimes)
                    + (0.05 * nickels) + (0.01 * pennies);

            /* Report the result back to the user. */

            System.out.println();
            System.out.print("The total in dollars is $");
            System.out.printf("%1.2f", dollars);  // Formatted output!
            System.out.println();

        }
}
