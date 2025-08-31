/******************************************************************************
Return range of prime numbers

Problem Statement: Given an integer start of the range and end of it, check whether it is prime or not return if its prime. 
A prime number is a number that is only divisible by 1 and itself and the total number of divisors is 2.
*******************************************************************************/
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		List<Integer> prime=new ArrayList<>();
		int start=sc.nextInt();
		int end=sc.nextInt();
		for(int i=start;i<end;i++){
		    int index=2;
		    int flag=0;
		    double last=Math.sqrt(i);
		    if(i%index==0){
		        flag++;
		        if(index!=(i/index)){
		            flag++;
		        }
		        index++;
		    }
		    if(flag==0){
		        prime.add(i);
		    }
		    
		}
		System.out.println(prime);
	}
}
