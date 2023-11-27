public class Tutorial4_1_design {
    public class Arrays {
    }
    /**
     * Count the number of elements of an array of integers that are negative
     * @require a neg null
     * @effects return number of elements of a that are negative
     *
     * i.e. result = [x | in a/\ x < 0 =0].length
     *  e.g. countNegatives([-1,0,-2,1])=2
     *
     * */
    public static int countNegatives(int[] a){
        return -1;
    }

    /**
     * Count the number of even elements of array of positive integers
     * @require a neg null /\ for all x in a, x>0
     * @effects return number of even elements of a

     * i.e. result = [x | x in a /\ x % 2 =0].length
     * e.g. countEvents([1,2,4,6,7,8])=4
     */
    public static int countEvent(int[] a){
        return 1;
    }

    /**
     * Divide the elements of a real number array by a real number
     *
     * @requires a neq null /\ b neq 0
     *
     * @effects divide each element of a by b
     * i.e. a_post = [x / x = y / b, y in a]
     * e.g. divArray ([2,3,4,5,6], 2) = [1, 1.5, 2, 2.5, 3]
     */
    public static void divArrays(double[] a, double[] b){

    }

    /**
     *
     * Find the minimum element in an array of integers
     * @require a neg null
     * @effects return minimum number in a
     *
     * i.e. result = [x / x in a /\ x is minimum].length
     * e.g min([12, 1234, 45, 67, 1 ])=1
     */
    public static int min(int[] a){
        return 0;
    }

    /**
     * Determine whether an array of integers is in ascending order
     * @require a neg null
     * @effect
     * @effects return Array 'a' is in ascending order ? True/False
     *
     * i.e. Check = True/False
     * e.g isAscSorted([4,3,2,1])= true
     */
    public static boolean isAscSorted(int[] a){
        return true;
    }

    /**
     * Find the length of an array of CHARs
     *
     * @requires a neq null
     * @effects return length of a
     *
     *          i.e.result = [x / x = a.length]
     *
     *          e.g.([HelloWorld]) = 9
     */
    public static int length(char[] a){
        return 1;
    }

    /**
     *Find the median of an array of reals, that is the array value closest to the middle in the sense that as many array elements are smaller than it as are greater than it.
     *@requires a neq null /\ x in a is real number
     *@effects return median of a
     *
     *i.e. result = [x / x = total / a.length + 1]
     * e.g ([1,2,3]) = 2
     */
    public static double median(double[] a){
        return 1;
    }
    /**
     * Compare two arbitrary arrays of reals
     * @require a,b neq null
     * @effect  return arbitrary of two arrays a & b
     *
     *
     * i.e result: a ⊂ b, a ⊃ b, a ∩ b, or a = b
     * e.g compare([])= ([1,2,3] , [1,2,3,4]) => a ⊂ b
     */
    public static boolean compare(double[] a, double[]b){
        return false;
    }
    /**
     * Compute the frequencies of each element of an array of reals
     * @require a neg null
     * @effect return
     *
     * i.e result =
     * e.g freq([10, 20, 20])=[10,1],[20,2]
     */
    public static int freq(double[] a){
        return 1;
    }
}
