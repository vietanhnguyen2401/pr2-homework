public class Tutorial4_3_design {

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
        return 0;
    }

    /**
     * determine the middle one of three numbers
     *
     *
     * @requires Array a neq null /\ a[x,y,z]
     * @effects
     *          return middle number in one of three number
     *
     *          i.e. x = a[2]
     *
     *          e.g. ([1,2,3]) = 2
     */
    public static int middle(int[] a){
        return 1;
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
    public static boolean isPalindrome(String a) {
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
        return true;
    }
}
