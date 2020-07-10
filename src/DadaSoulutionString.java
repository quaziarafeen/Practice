import java.util.*;

public class DadaSoulutionString {
//    public static void main(String[] args) {
//        //wordDisplay();
//        //wordDisplaySix();
//        //booleanReturn();
//        //reverseArrey();
//        //averageValue();
//        //duplicateValue1();
//        //findDuplicatesUsingSorting();
//        //findDuplicatesUsingHashSet();
//        //duplicateRemove();
//        primeNumber();
//
//    }
//
//    /**
//     * (1) Write a program which will display all the character line by line.
//     * Let    str =”How are you?”; Output will be:
//     * H
//     * o
//     * w
//     * .
//     * .
//     */
//
//    public static void wordDisplay() {
//        var sentence = "How are you?";
//        var word = sentence.toCharArray();
//        for (int i = 0; i <= word.length - 1; i++) {
//            System.out.print(word[i]);
//        }
//    }
//
//    /**
//     * (2)  Write a program which will return the part of a string , where the length of the string will be 6.
//     * Given str = “I am learing java”.
//     */
//    public static void wordDisplaySix() {
//        var sentence = "I am learing java";
//        sentence = sentence.replaceAll(" ", "");
//        var word = sentence.toCharArray();
//        for (int i = 0; i < 6; i++) {
//            System.out.print(word[i]);
//
//        }
//    }
//
//    /**
//     * (3) Write a method with two arguments string, and it will return Boolean result. If they are same return true, else return false.
//     */
//    public static void booleanReturn() {
//        String word1 = "Hello";
//        String word2 = "World";
//        boolean status = true;
//        if (word1 == word2) {
//            status = true;
//        } else {
//            status = false;
//        }
//        System.out.println(status);
//    }
//
//    /**
//     * (1) Print the array element in reverse way.
//     */
//    public static void reverseArrey() {
//        int[] number = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        //String reverse = number.toString();
//        for (int i = number.length - 1; i >= 0; i--) {
//            System.out.print(number[i]);
//            System.out.print(" ");
//        }
//
//    }
//
//    /**
//     * (2) Print the average value of array elements.
//     */
//    public static void averageValue() {
//        double number = 0;
//        double arr[] = {1, 2, 3, 4, 5, 6, 7};
//        for (int i = 0; i <= arr.length - 1; i++) {
//            number = number + arr[i];
//            // System.out.print(number);
//        }
//        double average = number / arr.length;
//        System.out.println(average);
//    }
//
//    /**
//     * (3) Write a Java program to find the duplicate values of an array of integer values.
//     */
//    public static void duplicateValue() {
//        HashMap<Integer, Integer> map = new HashMap<>();
//        int[] array = {1, 2, 3, 4, 5, 5, 6, 7, 8, 8, 7, 4, 5, 2, 4};
//        for (int i = 0; i < array.length; i++) {
//            map.put(array[i], i + 1);
//        }
//        System.out.println(map.entrySet());
//
//    }
//
//    public static void duplicateValue1() {
//        //HashMap<Integer,Integer> map = new HashMap<>();
//        int[] array = {1, 2, 2, 3, 3, 4, 5, 7, 7};
//        //Arrays.sort(array);
//        //String array1 = array.toString();
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 1 + i; j < array.length; j++) {
//                if (array[j] == array[i]) {
//                    System.out.print(array[j]);
//                    System.out.print(" ");
//                }
////            System.out.print("BB=" +" "+array[i]);
////            System.out.print(" ");
//            }
//        }
//
//    }
//
//    /**
//     * (4) Write a program to remove the duplicate element from an array.
//     */
//    static void duplicateRemove() {
//        int[] array = {1, 2, 2, 8, 8, 3, 3, 4, 5, 7, 7};
//        Arrays.sort(array);
//        String convert = array.toString();
//        HashSet<String> set = new HashSet<String>(Collections.singleton(convert));
//        Object[] array1 = set.toArray();
//        System.out.println(array1);
//    }
//
//    static void primeNumber() {
//
//        boolean prime;
//        int n;
//        int i;
//
//        for (n = 1; n <= 100; n++) {
//            prime = true;
//            i = 2;
//            while (i <= n / 2) {
//                if (n % i == 0) {
//                    prime = false;
//                    break;
//                }
//                i++;
//            }
//            if (prime) {
//                System.out.println(n);
//            }
//
//
//        }
//    }
//
////    public static void ArrayList<Integer> findprimes(int number) {
////        ArrayList<Integer> primes = new ArrayList<>();
////        int n = 5;
////        boolean prime = true;
////        int i;
////        i = 2;
////        while (i <= n / 2) {
////            if (n % i == 0) {
////                prime = false;
////                break;
////            }
////        }
////    }
    public static void fizz(){
        int n = 15;

        // loop for 14 times
        for (int i=1; i<4; i++)
        {
            if (i%15==0)
                System.out.println("FizzBuzz"+" ");
                // number divisible by 5, print 'Buzz'
                // in place of the number
            else if (i%5==0)
                System.out.println("Buzz"+" ");

                // number divisible by 3, print 'Fizz'
                // in place of the number
            else if (i%3==0)
                System.out.println("Fizz"+" ");

                // number divisible by 15(divisible by
                // both 3 & 5), print 'FizzBuzz' in
                // place of the number

            else // print the numbers
                System.out.println(i+" ");
        }

}
    public static void main(String args[]) { //fizz();
        fizz();
        int n = 15;

        // loop for 100 times
        for (int i = 1; i < n; i++) {
            if (i % 15 == 0)
                System.out.println("FizzBuzz" + " ");
                // number divisible by 5, print 'Buzz'
                // in place of the number
            else if (i % 5 == 0)
                System.out.println("Buzz" + " ");

                // number divisible by 3, print 'Fizz'
                // in place of the number
            else if (i % 3 == 0)
                System.out.println("Fizz" + " ");

                // number divisible by 15(divisible by
                // both 3 & 5), print 'FizzBuzz' in
                // place of the number

            else // print the numbers

                System.out.println(i + " ");
            //i = i - 2;
        }
        //System.out.println(i+" ");


    }
}
