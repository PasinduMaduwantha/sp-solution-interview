import java.math.BigInteger;

public class ProblemThree {

    public void prinNFibonacci(int n){
        long a = 0, b = 1;  
            
        System.out.print(a + ", " + b);  
        
        for (int i = 2; i < n; i++) { 
            System.out.print(", " + fibonacci(i));        
        }
        System.out.println();  
    }

    public static BigInteger fibonacci(int n) {
        BigInteger a = BigInteger.ZERO;
        BigInteger b = BigInteger.ONE;

        for (int i = 2; i <= n; i++) {
            BigInteger next = a.add(b); 
            a = b;  
            b = next;  
        }
        return b;  // Return the nth Fibonacci number
    }
    
}

