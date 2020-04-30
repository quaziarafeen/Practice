package problemsandsolutions;

public class Permutation {
    public static void main(String[] args) {

        /*
         * Permutation of String "ABC" is "ABC" "BAC" "BCA" "ACB" "CAB" "CBA".
         * Write Java program to compute all Permutation of a String
         *
         */
        permutation("ABC");
    }



    private static void doPermutation(String prefix, String str) {

        int n = str.length();

        if (n == 0)
            System.out.println(prefix);
        else {

            for (int i = 0; i < n; i++)

                doPermutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1, n));
        }

    }

    public static void permutation(String str) {
        doPermutation("", str);
    }

}
