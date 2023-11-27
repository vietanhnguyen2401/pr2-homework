package Chapter10;

public class working_array_2 {
     public static void main(String[] args) {
         int[] nums = { 2, 0, 1, 3 };
         /* Do some operations on array */
         int sum = 0, i;
         int n;
         for (i = 0; i < 4; i++) {
             n = nums[i];
             System.out.printf("nums[%d] = %d%n", i, n);
             sum = sum + n;
             }

         System.out.print("Sum: ");
         System.out.println(sum);
        }
}

