/******************************************************************************
Problem Statement: Given an integer N return the reverse of the given number.

Note: If a number has trailing zeros, then its reverse will not include them. 
For e.g., reverse of 10400 will be 401 instead of 00401.
*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
		int n=10400;
		int rev=0;
		while(n!=0){
		    int dig=n%10;
		    rev=(rev*10)+dig;
		    n/=10;
		}
		System.out.println(rev);
	}
}
