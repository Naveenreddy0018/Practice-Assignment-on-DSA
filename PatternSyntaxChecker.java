import java.util.Scanner;
import java.util.regex.*;

public class PatternSyntaxChecker
{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++)
        {
           String pattern=sc.nextLine();
           try{
               Pattern.compile(pattern);
               System.out.println("Valid");
           } 
           catch(Exception e){
               System.out.println("Invalid");
           }
        }
	}
}



