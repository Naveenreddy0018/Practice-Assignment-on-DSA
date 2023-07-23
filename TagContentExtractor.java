import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TagContentExtractor {
	public static void main(String[] args){
		String regex = "<(.+)>([^<>]+)</(\\1)>";
        Pattern p = Pattern.compile(regex);
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases>0){
			String line = in.nextLine();
            Matcher m = p.matcher(line);

            boolean bandera = true;
            while (m.find()) {
                System.out.println(m.group(2));
                bandera = false;
            }

            if (bandera) {
                System.out.println("None");
            }
			
          	//Write your code here
			
			testCases--;
		}
	}
}



