import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

class JavaRegex{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}

//Write your code here
class MyRegex {

    private String A = "([01]?[0-9]{1,2}|2[0-4][0-9]|25[0-5])";
    private String B = "([01]?[0-9]{1,2}|2[0-4][0-9]|25[0-5])";
    private String C = "([01]?[0-9]{1,2}|2[0-4][0-9]|25[0-5])";
    private String D = "([01]?[0-9]{1,2}|2[0-4][0-9]|25[0-5])";

    String pattern = A+"."+B+"."+C+"."+D;
}
