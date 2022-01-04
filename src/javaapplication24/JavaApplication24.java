package javaapplication24;
import java.util.Scanner;
import java.util.regex.*;
class A{  
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        String str = Sc.nextLine();
        Pattern pat = Pattern.compile("https:\\/\\/www.*\\.[a-z]{2,3}");
        
        Matcher mat = pat.matcher(str);
        str = mat.replaceAll(" ");
        System.out.println(str);
        
        //boolean f = mat.matches();
        //if(f) System.out.println("Matched");
        //else System.out.println("Not Matched");
    }
    
}

