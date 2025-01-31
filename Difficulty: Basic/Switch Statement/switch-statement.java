//{ Driver Code Starts
// Initial Template for Java

import java.util.Scanner;

class Main {

    
// } Driver Code Ends
// User function Template for Java

public static String utility(int number) {

    // write your code here
    String result="";
    switch(number){
        case 1:
            result="One";
            break;
            case 2:
            result="Two";
            break;
            case 3:
            result="Three";
            break;
            case 4:
            result="Four";
            break;
            case 5:
            result="Five";
            break;
            case 6:
            result="Six";
            break;
            case 7:
            result="Seven";
            break;
            case 8:
            result="Eight";
            break;
            case 9:
            result="Nine";
            break;
            default:
            result="Unknown";
    }
    return result;
}

//{ Driver Code Starts.

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-- > 0) {
            int number = scn.nextInt();
            System.out.println(utility(number));
        }
        scn.close();
    }
}
// } Driver Code Ends