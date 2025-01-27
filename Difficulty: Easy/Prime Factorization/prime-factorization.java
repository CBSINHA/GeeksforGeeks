//{ Driver Code Starts
// Initial Template for Java
import java.io.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(read.readLine());

        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());

            printPrimeFactorization(n);

            System.out.println();

            System.out.println("~");
        }
    }

    
// } Driver Code Ends
// User function Template for Java

// This function should print the prime factorization
// of the number n
// The new line is given by the driver's code.
public static int count(int i){
    int count=0;
    for(int j=1;j<=i;j++){
        if(j%i==0){
            count++;
        }
    }
    return count;
}
public static void printPrimeFactorization(int n) {
    // code here
    for(int i=2;n>1;){
        if(n%i==0&&count(i)<=2){
            n=n/i;
            System.out.print(i+" ");
        }
        else i++;
    }
}


//{ Driver Code Starts.
}
// } Driver Code Ends