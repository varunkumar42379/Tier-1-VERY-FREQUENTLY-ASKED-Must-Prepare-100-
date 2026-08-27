// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
        String str="madam";
        String str1="mada";
        //StringBuilder str1=new StringBuilder(str).reverse();
        char[] ch1=str.toCharArray();
        char[] ch2=str1.toCharArray();

       Arrays.sort(ch1);
       Arrays.sort(ch2);
   
        System.out.println(Arrays.equals(ch1,ch2));
    }
}
