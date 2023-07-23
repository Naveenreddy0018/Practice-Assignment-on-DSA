import java.util.Scanner;

public class JavaAnagrams {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        char[] st1 = a.toLowerCase().toCharArray();
        char[] st2 = b.toLowerCase().toCharArray();
        
        java.util.Arrays.sort(st1);
        java.util.Arrays.sort(st2);
        
        return java.util.Arrays.equals(st1, st2);
        
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
