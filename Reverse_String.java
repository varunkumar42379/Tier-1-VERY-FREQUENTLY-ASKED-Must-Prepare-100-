// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        String str="automation";
        String str1="";
        //StringBuilder str1=new StringBuilder(str).reverse();
        char[] ch=str.toCharArray();

   for(int i=ch.length-1;i>=0;i--){
     str1+=ch[i];
   }
        System.out.println(str1);
    }
}
