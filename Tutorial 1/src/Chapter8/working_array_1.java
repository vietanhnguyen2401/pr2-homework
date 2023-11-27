package Chapter8;
public class working_array_1 {
    public static void main(String[] args) {/* Declare the variables. */
        double principal;
        double rate;
        double interest;
         principal = 17000;
         rate = 0.07;
         interest = principal * rate;
         principal = principal + interest;
         /* Output the results. */
         System.out.print("The interest earned is ");
         System.out.println(interest);
         System.out.print("The value of the investment after one year is ");

         System.out.println(principal);
    }
}
