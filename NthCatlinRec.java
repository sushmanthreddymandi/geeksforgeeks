import java.util.*;
class NthCatlinRec
{
	public static int nthCatlinRec(int n)
	{
		if(n<=1)
			return 1;
		int total=0;
		for(int i=0;i<n;i++)
		{
			total+=nthCatlinRec(i)*nthCatlinRec(n-i-1);
		}
		return total;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println(nthCatlinRec(i));
		}
	}
}