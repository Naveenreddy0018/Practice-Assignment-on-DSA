import java.io.*;
import java.util.*;

public class StringTokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        String [] arr= s.split("[\\s!?,._'@]+");
        int size = arr.length;
        for (String str : arr) 
            if (str.isEmpty()) size--; 

        System.out.println(size);
        for (String str : arr) {
            if (!str.isEmpty()) 
            System.out.println(str);
        }
        scan.close();
    }
}

