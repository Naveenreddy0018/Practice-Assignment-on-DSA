import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class PrimalityTest {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();

        bufferedReader.close();
        BigInteger bigInt = new BigInteger(n);
        boolean isProbablePrime = bigInt.isProbablePrime(1);
        System.out.println(isProbablePrime ? "prime" : "not prime");
    }
}
