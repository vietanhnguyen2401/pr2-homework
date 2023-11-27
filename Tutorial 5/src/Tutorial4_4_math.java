public class Tutorial4_4_math {
    /**
     *  determine the remainder after integer division using only subtraction.
     *
     *
     * @requires a > b /\ a % b != 0
     * @effects
     *          return remainder after integer division using subtraction
     *
     *          i.e. r = a - (b * result)
     *
     *          e.g. ([10, 3]) = 10 - (3 * 3) = 1
     */
    public static int remainder(int a, int b){
        while(a > b) {
            a = a-b;
        }
        return a;

    }

    /**
     * determine the middle one of three numbers
     *
     *
     * @requires Array a neq null /\ a[x,y,z]
     * @effects
     *          return middle number in one of three number
     *
     *          i.e. x = [b / b > a && b < c]
     *          e.g. 1,2,3 = 2
     * @return
     */
    public static boolean middle(int a, int b, int c) {
        if (b > a && a > c || c > a && a > b) {
            System.out.print(a + "is a middle number");
        }
        if (a > b && b > c || c > b && b > a) {
            System.out.print(b + "is a middle number");
        }
        if (a > c && c > b || b > c && c > a) {
            System.out.print(c + "is a middle number");
        }
        return true;
    }

    /**
     * determine whether or not a string is a palindrom
     *
     * @requires String neq null
     * @effects
     *          return whether or not a string is a palindrome
     *
     *          i.e. Check = True/ False
     *
     *          e.g. "xe đua" => string is palindrome
     */
    public static boolean isPalindrome(String str){
        int i = 0;
        int j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
        }
        return true;
    }

    /**
     *  determine if an integer is a prime
     *
     * @requires a neq null
     * @effects
     *          return a is a prime or not
     *
     *          i.e. Check = true/False
     *
     *          e.g. 1 => a prime
     */
    public static boolean isPrime(int a) {
        if (a <= 1)
            return false;

        // Check from 2 to n-1
        for (int i = 2; i < a; i++)
            if (a % i == 0)
                return false;

        return true;
    }
}
