/******************************************************************************
Print all Divisors

Problem statement
Given an integer ‘N’, your task is to write a program that returns all the divisors of ‘N’ in ascending order.

For example:
'N' = 5.
The divisors of 5 are 1, 5.

*******************************************************************************/
// O(n)
import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++){
		    if(n%i==0){
		        System.out.print(i+" ");
		    }
		}
		
	}
}

// O(n/2)

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		List<Integer> div=new ArrayList<>();
		for(int i=1;i<=Math.sqrt(n);i++){
		    if(n%i==0){
		        div.add(i);
		        if(i!=(n/i)){
		            div.add(n/i);
		        }
		    }
		}
		Collections.sort(div);
		System.out.println(div);
		
	}
}
