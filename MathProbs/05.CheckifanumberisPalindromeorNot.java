/******************************************************************************
Problem Statement: Given an integer N, return true if it is a palindrome else return false.

A palindrome is a number that reads the same backward as forward.
For example, 121, 1331, and 4554 are palindromes because they remain the same when their digits are reversed.
*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
		int n=4554;
		int temp=n;
		int rev=0;
		while(n!=0){
		    int dig=n%10;
		    rev=(rev*10)+dig;
		    n/=10;
		}
		if(rev==temp){
		  System.out.println("The given number is palindrome");  
		}
		else{
		    System.out.println("The given number is not palindrome");
		}
		
	}
}
