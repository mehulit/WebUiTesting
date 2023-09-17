package SeleniumJava.WebUiTesting;

public class MatrixMin
{

	private static final int mincolumn = 0;
	private static final int[][] a = null;
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		int a[][] = {{2,3,4},{5,16,7},{8,9,0}};
		int min = a[0][0];
		int mincolumn=0;
		
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				if(a[i][j]<min)
				{
					System.out.println(min = a[i][j]);
					System.out.println(mincolumn = j); //  8 9 0
				}
			}
		}
	}
	//private int[][] a;
	int max = a[0][mincolumn];

}
