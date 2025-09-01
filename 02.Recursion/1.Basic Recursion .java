/******************************************************************************
Basic Recursion 
*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
	    int num=3,rep=12;
	    int sum=0;
		printntimes(num,rep);
        namentimes(num,rep);
        printntimes(1,rep);
        revsersennums(1,rep);
        sumof1stn(1,rep,sum);
        
	}
// 	Time complexity--> O(n)
// 	Space complexity--> O(n)
	public static void namentimes(int n,int rep){
	    if(n>rep){
	        return;
	    }
	    System.out.println("Recursion");
	    namentimes(n+1,rep);
	}
	
// 	Time complexity--> O(n)
// 	Space complexity--> O(n)
	public static void printntimes(int n,int rep){
	    if(n>rep){
	        return;
	    }
	    printntimes(n+1,rep);
	    System.out.print(n+" ");
	}
// 	Time complexity--> O(n)
// 	Space complexity--> O(n)
    public static void revsersennums(int st,int end){
        if(end<st){
            return;
        }
        System.out.print(end+" ");
        revsersennums(st,end-1);
    }
 // 	Time complexity--> O(n)
// 	Space complexity--> O(n)   
    public static void sumof1stn(int st,int end,int sum){
        if(end<st){
            System.out.print(sum+" ");
            return;
        }
        sum+=st;
        sumof1stn(st+1,end,sum);
    }
}
