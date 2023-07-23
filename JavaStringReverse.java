import java.io.*;
import java.util.*;

public class JavaStingReverse {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String new_str = "";
        for(int i = A.length()-1; i >= 0; i--) {
            new_str += A.charAt(i);
        }
        
        if(A.equals(new_str)) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
        /* Enter your code here. Print output to STDOUT. */
        
    }
}



