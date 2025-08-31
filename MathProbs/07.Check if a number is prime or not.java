/******************************************************************************
Check if a number is prime or not

Problem Statement: Given an integer N, check whether it is prime or not. 
A prime number is a number that is only divisible by 1 and itself and the total number of divisors is 2.
*******************************************************************************/

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int flag=0;
		for(int i=2;i<Math.sqrt(n);i++){
		    if(n%i==0){
		        flag++;
		        if((n/2)!=i){
		            flag++;
		        }
		    }
		}
		if(flag==0){
		    System.out.print("Its a prime number");
		}
		else{
		    System.out.print("Its not a prime number");
		}
	}
}
