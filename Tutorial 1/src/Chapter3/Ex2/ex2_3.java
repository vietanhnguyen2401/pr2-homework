package Chapter3.Ex2;
import java.util.Scanner;
public class ex2_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in );
        String usersName;
        String upperCaseName;

        System.out.print("Please enter your name: ");
        usersName = sc.nextLine();

        upperCaseName = usersName.toUpperCase();

        System.out.println("Hello, " + upperCaseName + ", nice to meet you!");

    }
}
