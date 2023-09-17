package SeleniumJava.WebUiTesting;

public class LearnLoop5
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		int i, j, k;
		int n =5;
		
		for(i=1; i<=n; i++)
		{
			for(k=1; k<=n-i; k++)
			{
				System.out.print(" ");
			}
			for(j=1; j<=i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}