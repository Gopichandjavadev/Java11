package java11;

import java.util.stream.Collectors;

public class StringMethods {

    public static void main(String[] args) {
        
        System.out.println(" ".isBlank()); //true
        
        String s = "Chand";
        System.out.println(s.isBlank()); //false
        String s1 = "";
        System.out.println(s1.isBlank()); //true
        
        String str = "JD\nJD\nJD"; 
        System.out.println(str);
        System.out.println(str.lines().collect(Collectors.toList()));
        
        String str1 = " JD "; 
        System.out.print("Start");
        System.out.print(str1.strip());
        System.out.println("End");
        
        System.out.print("Start");
        System.out.print(str1.stripLeading());
        System.out.println("End");
        
        System.out.print("Start");
        System.out.print(str1.stripTrailing());
        System.out.println("End");
        
        
        String str2 = "=".repeat(2);
        System.out.println(str2); //prints ==

    }

}
