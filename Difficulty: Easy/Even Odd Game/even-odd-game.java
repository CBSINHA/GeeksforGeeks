//{ Driver Code Starts
// Initial Template for Java

import java.util.Scanner;

class Main {

    
// } Driver Code Ends
// User function Template for Java

public static String utility(int n) {

    // write your code here
    String result="";
    if(n%2==0){
        result="Friend";
    }
    else result="You";
    return result;
}

//{ Driver Code Starts.

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-- > 0) {
            int number = scn.nextInt();
            System.out.println(utility(number));

            System.out.println("~");
        }
        scn.close();
    }
}
// } Driver Code Ends