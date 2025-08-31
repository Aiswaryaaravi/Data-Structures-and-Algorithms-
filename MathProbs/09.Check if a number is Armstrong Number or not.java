/******************************************************************************
Check if a number is Armstrong Number or not
Problem Statement: Given an integer N, return true it is an Armstrong number otherwise return false.

An Amrstrong number is a number that is equal to the sum of its own digits each raised 
to the power of the number of digits.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(amrstrong(n));
	}
	public static boolean amrstrong(int n){
	    int count=String.valueOf(n).length();
	    int am=0;
	    int temp=n;
	    while(n!=0){
	        int dig=n%10;
	        am+=Math.pow(dig,count);
	        n/=10;
	    }
	    if(am==temp){
	        return true;
	    }
	    else{
	        return false;
	    }
	}
}
