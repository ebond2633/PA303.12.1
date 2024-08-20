import java.util.Scanner;


 public class MyCalculator {
    /*
     * Create the method long power(int, int) here.
     */
public long power(int n, int p) throws Exception{
    long result = 0;
    if (n==0 && p==0)
        throw new Exception("n and p should not be zero.");
    else if (n<0 || p>0)
        throw new Exception("n or p should not be negative.");
    else result=(long) math.pow(n,p);
    return result;
}
}

