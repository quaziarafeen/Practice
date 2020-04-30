package problemsandsolutions;

public class FindSmallestNumber {

    public static void main(String[] args) {
        FindSmallestNumber sm=new FindSmallestNumber();
        System.out.println(sm.smallestNumber());
    }
    public int smallestNumber(){
        int number1=38;
        int number2=48;
        int number3=68;
        int number4=78;
        //return Math.min(Math.min(number1,number2),Math.min(number3,number4));
        return Math.min(Math.min(number1,number2),number3);
    }


}
