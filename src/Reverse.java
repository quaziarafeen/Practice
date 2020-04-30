public class Reverse {
//    public static void main(String[] args) {
////    useForLoopForReverse();
////    useStringBufferForReverse();
//    useForloop();
//        }
//
//    public static void useStringBufferForReverse() {
//        String sentence = "Hello Everybody";
//        String[] word = sentence.split(" ");
//        for (int i = 0; i < word.length; i++) {
//            StringBuffer sb = new StringBuffer(word[i]);
//            System.out.print(sb.reverse());
//            System.out.print(" ");
//        }
//        }
//        public static void useForLoopForReverse () {
//            String sentence = "Hello everybody";
//            String[] word = sentence.split(" ");
//            for (int i = 0; i < word.length; i++) {
//                char[] wordToCharacter = word[i].toCharArray();
//                for (int j = wordToCharacter.length - 1; j >= 0; j--) {
//                    System.out.print(wordToCharacter[j]);
//                }
//
//                System.out.print(" ");
//            }
//        }
//        public static void useForloop(){
//        String sentence = "Hello Everybody";
//        var word = sentence.split(" ");
//        for(int i = 0; i<word.length;i++) {
//            StringBuffer reverseWord = new StringBuffer(word[i]);
//            System.out.print(reverseWord.reverse());
//            System.out.print(" ");
//        }
//
//        }

    public static void main (String[] args) throws java.lang.Exception {
        int a = 5,b = 7;
        int c =( a+=2*3+b--);
        System.out.println(c);
    }
   }
//
//
