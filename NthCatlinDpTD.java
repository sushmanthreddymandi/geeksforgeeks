import java.util.*;
class NthCatlinDpTD
{
	public static int nthCatlinDp(int n)
	{
		if(n<=1)
			return 1;
		int arr[]=new int[n+1];
		return nthCatlinDp(arr,n);
	}
	public static int nthCatlinDp(int arr[],int n)
	{
		if(n<=1)
			return 1;
		if(arr[n]!=1)
			return arr[n];
		int total=0;
		for(int i=0;i<n;i++)
		{
			total+=nthCatlinDp(i)*nthCatlinDp(n-i-1);
		}
		arr[n]=total;
		return arr[n];
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println(nthCatlinDp(i));
		}
	}
}