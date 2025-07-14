import java.util.*;
public class MyStringBuilder {
    public static void main(String args[]) {
     // Declaration of StringBuilder
     StringBuilder sb = new StringBuilder("HelloWorld");
     System.out.println(sb);
    // Get A Character from Index
     StringBuilder sb1 = new StringBuilder("Tony");
     System.out.println(sb1.charAt(0));
    // Set a Character at Index
     StringBuilder sb2 = new StringBuilder("Tony");
     sb.setCharAt(0, 'P');
     System.out.println(sb2);
       // Insert a Character at Index
       StringBuilder sb3 = new StringBuilder("tony");
     sb3.insert(0, 'S');
     System.out.println(sb3);
     //Delete char at some Index
      StringBuilder sb4 = new StringBuilder("tony");
     sb4.insert(0, 'S');
     System.out.println(sb4);
	//delete char
     sb4.delete(0, 1);
     System.out.println(sb4);
     //Append a String
      StringBuilder sb5 = new StringBuilder("Tony");
     sb5.append(" Stark");
     System.out.println(sb5);
     //Print Length
     StringBuilder sb6 = new StringBuilder("Tony");
     sb6.append(" Stark");
     System.out.println(sb6);
     System.out.println(sb6.length());
   }
}