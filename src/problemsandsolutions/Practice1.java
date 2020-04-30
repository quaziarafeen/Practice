package problemsandsolutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;

public class Practice1 {
    public static void main(String[] args) {
//        StringBuffer reverse = new StringBuffer("Quazi");
//        System.out.println(reverse.reverse());
        String word = "I am learning Java";
        char [] wordToLetter = word.toCharArray();
        for (int  i=wordToLetter.length-1;i >= 0; i--) {
            System.out.print(wordToLetter[i]);
        }
        //var sc = new Scanner(System.in);
//        int noCount = 5;
//        System.out.println("What is the pyramid size :" +" " +noCount);
//        //sc.nextInt();
//        int rowCount = 1;
//        System.out.println("The Pyramid will be : ");
//        for (int i = noCount; i > 0; i--) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print(" "); }
//             for (int j = 1; j <= rowCount; j++) {
//                 //System.out.print(rowCount+" ");
//                 //System.out.print(j+" ");
//                 System.out.print("* ");
//                 }
//             System.out.println();
//             rowCount++; }
//    String a = "OneSpace TwoSpace ThreeSpace";
//        String b = a.replaceFirst(" ","").toLowerCase();
//        System.out.println(b);
//        duplicate("Better Butter");
//        duplicate("Job bob rob");
//        int [] a={1,2,3,4,5};
//        int [] b={1,2,3,4,6};
//        boolean result = true;
//        if(a.length == b.length){
//            for(int i = 0;i<a.length;i++){
//                if(a[i]!= b[i]){
//                    result = false;
//                }
//            }
//        }
//            else{ result = false; }
//               if(result) {
//                   System.out.println("Two arreys are equal");
//               }else {
//                   System.out.println("Two arreys not are equal");
//               }
//               isAnagramOrNot("mom","dad");
//               isArmostrong(9474);

        int [] c={11,25,39,44,68,70,105,110,2000};
        findAll(c);
//        System.out.println(Arrays.equals(a,b));
//        System.out.println(Arrays.equals(a,c));
        //int [] d ={1,2,3,4,4,3,2,1};
        //findDuplicatesUsingBruteForce(d);
        isSum(3395);
        System.out.println(getLLessThanN(145,4));
        //Constructing An ArrayList

        ArrayList<String> listWithDuplicateElements = new ArrayList<String>();
        listWithDuplicateElements.add("JAVA");

        listWithDuplicateElements.add("J2EE");

        listWithDuplicateElements.add("JSP");

        listWithDuplicateElements.add("SERVLETS");

        listWithDuplicateElements.add("JAVA");

        listWithDuplicateElements.add("STRUTS");

        listWithDuplicateElements.add("JSP");

        //Printing listWithDuplicateElements
        System.out.print("ArrayList With Duplicate Elements :");

        System.out.println(listWithDuplicateElements);

        //Constructing LinkedHashSet using listWithDuplicateElements

        LinkedHashSet<String> set = new LinkedHashSet<String>(listWithDuplicateElements);

        //Constructing listWithoutDuplicateElements using set

        ArrayList<String> listWithoutDuplicateElements = new ArrayList<String>(set);

        //Printing listWithoutDuplicateElements

        System.out.print("ArrayList After Removing Duplicate Elements :");

        System.out.println(listWithoutDuplicateElements);
    }
    static void findAll(int[] a){
        Arrays.sort(a);
//        for( int i=0;i<=a.length;i++){
//            if(a[i]>100){
                System.out.println(a[0]+" "+a[a.length-3]);

        }


    static void findDuplicatesUsingBruteForce(int[] inputArray)
    {
        for (int i = 0; i < inputArray.length; i++)//1,2
        {
            //System.out.println("I =" +i);
            for (int j = i+1; j < inputArray.length; j++)//2,5
            {
                //System.out.println("J = " +j);
                if(inputArray [i] == inputArray [j])
                {
                    System.out.println("Duplicate Element : "+inputArray [j]+" ");
                }
            }
        }
    }
    static void isArmostrong(int a){
        int Number = a;
        int value =  String.valueOf(a).length();//1,5,3=3,339
        int b = 0;
        while (Number != 0)
        {   int lastDigit = Number % 10;//3,5/9,3
            int lastDigitOfPower = 1;
            for(int i = 0; i<value;i++ ){
            lastDigitOfPower = lastDigitOfPower * lastDigit;//1*3=3,3*3=9,9*3=27
            }
            b = b+lastDigitOfPower;//27,125+1=153
            Number = Number / 10;//15,1/33,3
        }if(b == a){
            System.out.println("This is a Armostrong number");
        }else {
            System.out.println("This is a not Armostrong number");
        }
    }
    static void isSum(int a){
        int Number = a;
        int b = 0;
        while (Number != 0)//3395,339,33,3,0=0
        {   int lastDigit = Number % 10;//5,9,3,3
            b = b+lastDigit;//0+5,0+9,0+3,0+3
            Number = Number / 10;//339,33,3,0
            }
        System.out.println("Sum of all digit of " +a+" ="+" "+b);


            //System.out.println("This is a not Armostrong number");

    }
    static void isAnagramOrNot(String value1,String value2){
        boolean status = true;
        if(value1.length() != value2.length()){
            status = false;
        }else{
            char[] a = value1.toLowerCase().toCharArray();
            char[] b = value2.toLowerCase().toCharArray();
            Arrays.sort(a);
            Arrays.sort(b);
            status=Arrays.equals(a,b);
        }
        System.out.println(value1+" "+"and"+" "+value2+" "+"are anagram is"+" "+status);
//        if(status)
//        {
//            System.out.println(value1+" and "+value2+" are anagrams");
//        }
//        else
//        {
//            System.out.println(value1+" and "+value2+" are not anagrams");
//        }
    }
         static void duplicate(String a){
        var word = new HashMap<Character,Integer>();
        char[] letter =a.toLowerCase().toCharArray();//b=1,e=1,t=1,t=2,e=2,r=1,b=2,u=1,t=3,t=4,e=3,r=2
             for (char cd:letter) { if(word.containsKey(cd)){
                 word.put(cd,word.get(cd)+1);
                 //cd=b,1+1=2
             }else { word.put(cd,1);
             //cd=b,1
                 }}
             //System.out.println(cd+ " "+":"+word.get(cd));}
                 for (char d:word.keySet()) {
                     if (word.get(d)>1){
                         System.out.println(d+ " "+":"+word.get(d));
                     } }



         }
    static int getLLessThanN(int number, int digit)
    {
        //Converting digit to char

        char c = Integer.toString(digit).charAt(0);

        //Decrementing number & checking whether it contains digit

        for (int i = number; i > 0; --i)
        {
            if(Integer.toString(i).indexOf(c) == -1)
            {
                //If 'i' doesn't contain 'c'

                return i;
            }
        }

        return -1;
    }
    }

