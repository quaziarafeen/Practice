package problemsandsolutions;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeTwoArraysAndRemoveDuplicatesProgram {

    // Merge Two Arrays Into Single Sorted Array Without Duplicates
    // given  arrayA={1,3,4}
    // given  arrayB={4,5,6,7,8}
    // output {1,3,4,5,6,7,8}

//    private static int[] mergeArraysAndRemoveDuplicates(int[] arrayA, int[] arrayB)
//    {
//        //return IntStream.concat(IntStream.of(arrayA), IntStream.of(arrayB)).distinct().sorted().toArray();
//        return IntStream.concat(IntStream.of(arrayA), IntStream.of(arrayB)).distinct().sorted().toArray();
//    }
//    public static void main(String[] args)
//    {
//        int[] arrayA = new int[] {1,2,3,4,5};
//
//        int[] arrayB = new int[] {4,5,6,7,8};
//
//        int[] mergedArray = mergeArraysAndRemoveDuplicates(arrayA, arrayB);
//
//        System.out.println("Array A : "+ Arrays.toString(arrayA));
//
//        System.out.println("Array B : "+Arrays.toString(arrayB));
//
//        System.out.println("Sorted Merged Array With No Duplicates : ");
//
//        System.out.println(Arrays.toString(mergedArray));
//    }


public static int [] duplicate (int [] arrayA ,int [] arrayB){
        return IntStream.concat(IntStream.of(arrayA),IntStream.of(arrayB)).distinct().sorted().toArray();
}

    public static void main(String[] args) {
    int [] arreyA= new int[]{1,2,3,4,5,6};
    int [] arreyB= new int[]{1,2,3,4,5,6,7,8};
    int [] margedArrey = duplicate(arreyA,arreyB);
        System.out.println("Array A " +Arrays.toString(arreyA));
        System.out.println("Array b " +Arrays.toString(arreyB));
        System.out.println("Sorted And marger Value is : ");
        System.out.println(Arrays.toString(margedArrey));

    }


}
