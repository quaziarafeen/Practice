package problemsandsolutions;

import java.util.Scanner;

public class FineEvenOddNumber {
    // we was facing a problem when taking string input from scanner and use it in a condition of if/else method.

    // separate method and run 1-100 , even and odd number
    // from scanner

    public static int numberSize;

    public static void main(String[] args) {
        System.out.println("Enter your number");
        Scanner input=new Scanner(System.in);

        numberSize=input.nextInt();
        FineEvenOddNumber.isEvenOrOdd();


    }

    public static void isEvenOrOdd() {

        //Even or Odd Number
        for (int i = 0; i < numberSize; i++) {

            if (i % 2 == 0) {
                System.out.println(i + " is Even Number");
            } else {
                System.out.println(i + " is Odd Number");
            }

        }


    }}
