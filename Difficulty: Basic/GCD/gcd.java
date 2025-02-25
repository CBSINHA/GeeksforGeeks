//{ Driver Code Starts
//Initial Template for Java

import java.util.Scanner;

class Main {

    
// } Driver Code Ends

//User function Template for Java

public static int gcd(int a, int b){

        
    //code here to calculate and return gcd of a and b
    int gcd=1;
        for(int i=Math.min(a,b);i>=1;i--){
            if(a%i==0&&b%i==0&&i>gcd)gcd=i;
        }
        return gcd;
}


//{ Driver Code Starts.

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t-- > 0) {
            int A = scn.nextInt();
            int B = scn.nextInt();
            int ans = gcd(A,B);
            System.out.println(ans);
        
System.out.println("~");
}
        scn.close();
    }
}
// } Driver Code Ends