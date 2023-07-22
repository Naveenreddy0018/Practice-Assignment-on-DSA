import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Integer[] i = {1, 2, 3};
        String[] s = {"Hello", "World"};
        printArray(i);
        printArray(s);
    }
    
    public static <T> void printArray(T[] array) {
        for(T ele : array) {
            System.out.println(ele);
        }
    }
}
