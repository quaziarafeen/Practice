package problemsandsolutions;

public class Palindrome {
    public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called Palindrome.
          For example, MOM,DAD,MADAM are
          Palindrome. So write java code to check if a given String is Palindrome or not.
         */
        isPalindrome("rac");
        isPalindrome("MOM");
        isPalindrome("DAD");
        isPalindrome("MADAM");

    }

    public static void isPalindrome(String a){
        boolean status = true;
        char[] word = a.toLowerCase().toCharArray();//rac

        int i1 = 0;
        int i2 = word.length - 1;//3-1=0,1,2

        while (i2 > i1) //3>0
        { if (word[i1] != word[i2]) {
                status = false;
            }
            ++i1;
            --i2;
        }
        System.out.println((a + " is a palindrome word : " + status));
    }

}
