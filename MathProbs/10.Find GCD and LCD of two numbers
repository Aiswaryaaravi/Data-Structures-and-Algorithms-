/******************************************************************************
Find GCD of two numbers
Problem Statement: Given two integers N1 and N2, find their greatest common divisor.

The Greatest Common Divisor of any two integers is the largest number that divides both integers.
*******************************************************************************/

// O(n)
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int gcd=1;
		int max=Math.max(n1,n2);
		int min=Math.min(n1,n2);
		if(max%min==0){
		    gcd=min;
		}
		else{
		  for(int i=2;i<=min;i++){
		    if(n1%i==0 && n2%i==0){
		        gcd=i;
		    }
		    
		  }
	   }
	   System.out.println("GCD:"+gcd);
	   int lcm=(n1*n2)/gcd;
	   System.out.println("LCM:"+lcm);
	}
}



// O(log n) --> Euclidean distance
// gcd(a,b)=gcd(a-b,b) iff a>b

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        while (a!=0 && b!=0) {
            if (a > b)
                a %= b;  
            else
                b %= a; 
        }
        int gcd = (a==0 ? b:a);
        System.out.println("GCD:"+gcd);
        int lcm=(a*b)/gcd;
        System.out.println("LCM:"+lcm);
        
    }
}
