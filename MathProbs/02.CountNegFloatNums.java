public class Main
{
	public static void main(String[] args) {
		int count=0;
		double n1=-1234.45;
		String str=String.valueOf(Math.abs(n1)).replace(".","");
		int n=Integer.parseInt(str);
		while(n!=0){
		    int dig=n%10;
		    count+=1;
		    n/=10;
		}
		System.out.println(count);
	}
}
