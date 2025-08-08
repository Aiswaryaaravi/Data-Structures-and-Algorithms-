public class Solution {
    public int reverseExponentiation(int n) {
        // code here
        int temp=n;
         int  rev=0;
         while(n!=0){
             int last=n%10;
             n/=10;
             rev=rev*10+last;
         }
         int pow=(int) Math.pow(temp,rev);
         return pow;
        
    }
}