//Write an application to join the two Strings “Hello, ” & “How are you?” (Hint: Use String
//        method)

import java.util.*;

public class StringQ2 {
    public static  void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String str1=new String("Hello ,");
        String str2=new String("How are you?");
        String str3=str1.concat(str2);
        System.out.println(str3);
    }
}
