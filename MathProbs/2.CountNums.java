
class Solution {
    static int evenlyDivides(int n) {
        int count=0;
        if(n==0){
            count=1;
        }
        while(n!=0){
            count++;
            n/=10;
        }
        return count;
}
}