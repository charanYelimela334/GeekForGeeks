//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(in.readLine());

            Solution ob = new Solution();
            List<Integer> ans = new ArrayList<Integer>();
            ans = ob.primeDivision(N);
            System.out.println(ans.get(0) + " " + ans.get(1));
        
System.out.println("~");
}
    }
}
// } Driver Code Ends


// User function Template for Java


class GfG{
    
    static boolean[] sieve(int n){
        
        boolean[] isPrime = new boolean[n+1];
        
        Arrays.fill(isPrime,true);
        
        isPrime[0]=isPrime[1]=false;
        
        for(int i=2;i*i<=n;i++){
            if(isPrime[i]){
                for(int j=i*i;j<=n;j+=i){
                    isPrime[j]=false;
                }
            }
        }
        
        return isPrime;
    }
        
    
}



class Solution {
    static List<Integer> primeDivision(int n) {
        // code here
        boolean[] isPrime = GfG.sieve(n);
        
        for(int i=2;i<=n/2;i++){
            if(isPrime[i]&&isPrime[n-i]){
                return Arrays.asList(i,n-i);
            }
            
        }
        return new ArrayList<>();
    }
}