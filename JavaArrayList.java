import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        
        ArrayList<ArrayList<Integer>> numbers = new ArrayList<>();
        int n = sc.nextInt();
        int d = 0;
        ArrayList<Integer> tempArrayList = null;
                
        for(int i = 0 ; i < n ; i++) {
        
            d = sc.nextInt();
            tempArrayList = new ArrayList<>();
        
            for(int j = 0 ; j < d ; j++) {
                tempArrayList.add(sc.nextInt());
            }
        
            numbers.add(tempArrayList);
        }
                
        int q = sc.nextInt();
        int x = 0;
        int y = 0;
               
        for(int i = 0 ; i < q ; i++) {
        
            x = sc.nextInt();
            y = sc.nextInt();
                    
            try {
                System.out.println(numbers.get(x - 1).get(y - 1));
            } catch(Exception e) {
                System.out.println("ERROR!");
            }
        
        }
                
        sc.close();
    }
}
