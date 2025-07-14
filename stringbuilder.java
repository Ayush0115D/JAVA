import java.util.*;
public class stringbuilder {
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
    }
}