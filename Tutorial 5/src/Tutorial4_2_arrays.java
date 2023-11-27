public class Tutorial4_2_arrays {

    /**
     * Count the number of elements of an array of integers that are negative
     *
     * @requires a neq null /\ for all x in a. x < 0
     * @effects return number of negative in a
     * <p>
     * i.e. result = [x / x in a /\ x < 0].length
     * <p>
     * e.g. ([1, -1, 3, -5, -2, 4]) = 3
     */
    public static int countNegative(int[] a) {
        int result = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) {
                result++;
            }
        }
        return result;
    }

    /**
     * Count the number of even elements of an array of positive integers
     *
     * @requires a not eq null /\ for all x in a. x > 0
     * @effects return number of even element of a
     * <p>
     * i.e. result = [x / x in a /\ x % 2 = 0].length
     * <p>
     * e.g. countEvens ([1,2,3,4,5,6]) = 3
     */
    public static int countEvens(int[] a) {
        int result = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                result++;
            }
        }
        return result;
    }

    /**
     * Divide the elements of a real number array by a real number
     *
     * @requires a neq null /\ b neq 0
     * @modifies a
     * @effects divide each element of a by b
     * <p>
     * i.e. a_post = [x / x = y / b, y in a]
     * <p>
     * e.g. divArray ([2,3,4,5,6], 2) = [1, 1.5, 2, 2.5, 3]
     */
    public static void divArray(double[] a, int b) {
        for (int i = 0; i < a.length; i++) {
            a[i] = a[i] / b;
        }
    }



    /**
     * Find the minimum element in an array of integers
     *
     * @requires a neq null
     * @effects return minimum number in a
     * <p>
     * i.e. result = [x / x in a /\ x is minimum].length
     * <p>
     * e.g. ([1,2,3,4,5,6]) = 1
     */
    public static int min(int[] a) {
        int temp = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 1; j <= a.length; j++) {
                if (a[i] < a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return temp;
    }

    /**
     * Determine whether an array of integers is in ascending order
     *
     * @requires a neq null
     * @effects return Array 'a' is in ascending order ? True/False
     * <p>
     * i.e. Check = True/False
     * <p>
     * e.g. ([1,3,-1,2,-4]) = No
     */
    public static boolean isAscSorted(int[] a) {
        int i;
        for (i = 0; i < a.length; i++) ;
        {
            if (a[i] < a[i + 1]) {
                return true;
            } else {
                return false;
            }
        }
    }

    /**
     * Find the length of an array of CHARs
     *
     * @requires a neq null
     * @effects return length of a
     * <p>
     * i.e.result = [x / x = a.length]
     * <p>
     * e.g.([HelloWorld]) = 9
     */
    public static int length(char[] a) {
        int n = 0, t = 0;
        while (true) {
            try {
                t = a[n++];
            } catch (ArrayIndexOutOfBoundsException ex) {
                n--;
                break;
            }
        }
        return n;
    }

    /**
     * Find the median of an array of reals
     *
     * @requires a neq null /\ x in a is real number
     * @effects return median of a
     * <p>
     * i.e. result = [x / x = total / a.length + 1]
     * <p>
     * e.g. ([1,2,3]) = 2
     */
    public static double median(double[] a) {
        double median;
        if (a.length % 2 == 0) {
            median = ((double) a[a.length / 2] + (double) a[a.length / 2 - 1]) / 2;
        } else {
            median = (double) a[a.length / 2];
        }
        return median;
    }

    /**
     * Compare two arbitrary arrays of reals
     *
     * @requires a,b neq null
     * @effects
     *          return arbitrary of two arrays a & b
     *
     *          i.e. result: a ⊂ b, a ⊃ b, a ∩ b, or a = b
     *
     *          e.g. ([1,2,3] , [1,2,3,4]) => a ⊂ b
     */
    public static boolean compare(double[] a, double[] b) {
        double[] A = {1,2,3};
        double[] B = {1,2,3,4};
        if (A == B) {
            System.out.println("Same");
        } else {
            System.out.println("Not same");
        }
        return true;
    }

    /**
     * Compute the frequencies of each element of an array of reals
     * @require a neg null
     * @effect return
     *
     * i.e result =
     * e.g freq([1, 2, 8, 3, 2, 2, 2, 5, 1])=[1,2,8,3,5],[2,4,1,1,1]
     */
    public static int freq(double[] a){
        int [] arr = new int [] {1, 2, 8, 3, 2, 2, 2, 5, 1};
        int [] fr = new int [arr.length];
        int visited = -1;
        for(int i = 0; i < arr.length; i++){
            int count = 1;
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    count++;
                    fr[j] = visited;
                }
            }
            if(fr[i] != visited)
                fr[i] = count;
        }
        return 1;
    }

}
