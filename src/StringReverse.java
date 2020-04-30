public class StringReverse {
    public static void main(String[] args) {
        StringBuffer name = new StringBuffer("Quazi Arafeen");
        System.out.println(name.reverse());
        String nameReverse = "Hello Everybody";
        var reverse1 = nameReverse.split(" ");
        var output=" ";           //
        for (int i= reverse1.length-1;i>=0;i--){
            output = output + reverse1[i]+" ";
        }
        System.out.print(output);
    }

}
