import java.util.*;
class NthCatlinDpBP
{
	public static int nthCatlinDp(int n)
	{
		int arr[]=new int[n+2];
		arr[0]=arr[1]=1;
		for(int i=2;i<=n;i++)
		{
			for(int j=0;j<i;j++)
			arr[i]+=arr[j]*arr[i-j-1];
		}
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