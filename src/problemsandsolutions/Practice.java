package problemsandsolutions;

import java.util.HashMap;

public class Practice {

    //Reverse Word
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.print("Input a word: ");
//        String word = in.nextLine();
//        word = word.trim();
//        String result = "";
//        char[] ch=word.toCharArray();
//        for (int i = ch.length - 1; i >= 0; i--) {
//            result += ch[i];
//        }
//        System.out.println("Reverse word: "+result.trim());
//        Scanner reverse = new Scanner(System.in);
//        System.out.print("Input the Value :");
//        String reverseWord = reverse.nextLine();
//        reverseWord = reverseWord.trim();
//        String resultSet = "";
//        char [] cha = reverseWord.toCharArray();
//        for (int i = cha.length - 1;i >= 0; i --){
//            resultSet += cha [i];
//        }
//        System.out.println("Reverse word :" +resultSet.trim());
//        Scanner reverse = new Scanner(System.in);
//        System.out.print("Input the word : ");
//        String reverseWord = reverse.nextLine();
//        String result = "";
//        char[] word1 = reverseWord.toCharArray();
//        for (int i = word1.length -1;i>=0; i-- ){
//            result += word1 [i];
//        }
//        System.out.println("reverse word is : "+result);
//        Scanner reverse = new Scanner(System.in);
//        System.out.print("Input The word here :");
//        String reverseWord = reverse.nextLine();
//        reverseWord = reverseWord.trim();
//        String result = "";
//        char [] word = reverseWord.toCharArray();
//        for (int i = word.length -1;i>= 0; i--){
//            result += word [i];
//        }
//        System.out.println("Reverse word is : "+result.trim());
//        StringBuffer reverse = new StringBuffer("Quazi");
//        System.out.println(reverse.reverse());
//        String value = "Quazi";
//        char [] word = value.toCharArray();
//        for (int i = word.length-1;i>=0;i--){
//            System.out.print(word[i]);}
//        System.out.println(" ");
//        String orginal = "I am learning Java";
//        char [] expected = orginal.toCharArray();
//        for (int i = expected.length-1;i >= 0;i--)
//        {
//            System.out.print(expected[i]);
//        }
//        System.out.println("");
//       String reverse = "Shaibo";
//        StringBuffer reverse1 = new StringBuffer(reverse);
//        System.out.println(reverse1.reverse());

//        int[] myArrey = {1, 2, 5, 5, 6, 6, 7, 2};
//
//        for (int u = 0; u < myArrey.length-1; u++)
//        {
//            for (int j = u+1; j < myArrey.length; j++)
//            {
//                if ((myArrey[u] == myArrey[j]) && (u != j))
//                {
//                    System.out.println("Duplicate Element : "+myArrey[j]);
//                }
//
//            }
//        }
//        Scanner asd = new Scanner(System.in);
//        System.out.println("What is the pyramid value :");
//        int sd = asd.nextInt();
//        int dv = 1;
//        System.out.println("how will be pyramid");
//        for (int i = sd; i > 0 ; i--){
//            for (int j = 1;j <= i;j++){
//                System.out.print(" ");
//            }
//            for (int j =1;j <= dv;j++){
//                System.out.print(j+""+dv+"* ");
//
//
//            }
//            System.out.println();
//            dv++;
//        }
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter input string to be cleaned from white spaces...!");
//
//        String inputString = sc.nextLine();
//
//        String stringWithoutSpaces = inputString.replaceAll("\\s+","");
//
//        System.out.println("Input String : "+inputString);
//
//        System.out.println("Input String Without Spaces : "+stringWithoutSpaces);
//
//        //sc.close();
//        duplicate("Better butter");
        int[] arrayOne = {2, 5, 1, 7, 4};
        int[] arrayTwo = {2, 5, 1, 6, 4,9};
        boolean equalOrNot = true;
        if (arrayOne.length == arrayTwo.length) {
            for (int i = 0; i < arrayOne.length; i++) {
                if (arrayOne[i] != arrayTwo[i]) {
                    equalOrNot = false; }
            } } else { equalOrNot = false; }
        if (equalOrNot) {
            System.out.println("Two Arrays Are Equal");
        } else {
            System.out.println("Two Arrays Are Not equal");
        }
    }

static void duplicate(String inputString) {
    HashMap<Character, Integer> ab = new HashMap<Character, Integer>();
    char[] vb = inputString.toLowerCase().toCharArray();//Better Butter= b,e,t,t,e,r,b,u,t,t,e,r
    for (char s : vb) {
        if (ab.containsKey(s)) {
            ab.put(s, ab.get(s) + 1);
        } else {
            ab.put(s,1);
        }
    }
        for (char ch : ab.keySet()) {
            if (ab.get(ch) > 1) {
                //If any char has a count of more than 1, printing it's count

                System.out.println(ch + " : " + ab.get(ch));
            }
        }


    }

}


