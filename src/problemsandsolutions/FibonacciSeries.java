package problemsandsolutions;

import java.util.Scanner;

public class FibonacciSeries {
    /**
     * Java program to calculate and print Fibonacci number using both recursion
     * and Iteration.
     * Fibonacci number is sum of previous two Fibonacci numbers fn= fn-1+ fn-2
     * first 10 Fibonacci numbers are 1, 1, 2, 3, 5, 8, 13, 21, 34, 55
     *
     * @author Mahmud
     */



    public static void main(String args[]) {

        //input to print Fibonacci series upto how many numbers
        System.out.println("Enter number upto which Fibonacci series to print: ");
        Scanner input=new Scanner(System.in);
        int number = input.nextInt();

        System.out.println("Fibonacci series upto " + number +" numbers : ");
        //printing Fibonacci series upto number
        for(int i=1; i<=number; i++){

            System.out.print(fibonacci(i) +" ");
        }


    }


    /*
     * Java program for Fibonacci number using recursion.
     * This program uses tail recursion to calculate Fibonacci number for a given number
     * @return Fibonacci number
     */
    public static int doFibonacci(int number){
        if(number == 1 || number == 2){
            return 1;
        }
        int fibonacciNumber=doFibonacci(number-1) + doFibonacci(number -2);
        return fibonacciNumber; //tail recursion
    }


    /*
     * Java program to calculate Fibonacci number using loop or Iteration.
     * @return Fibonacci number
     */
    public static int fibonacci(int number){

        if(number == 1 || number == 2){
            return 1;
        }
        int fibo1=1, fibo2=1, fibonacci=1;

        for(int i= 3; i<= number; i++){

            //Fibonacci number is sum of previous two Fibonacci number
            fibonacci = fibo1 + fibo2;// 2
            fibo1 = fibo2;
            fibo2 = fibonacci; //2

        }
        return fibonacci; //Fibonacci number

    }
public static void fibonacciSeries(int number){

}

}
