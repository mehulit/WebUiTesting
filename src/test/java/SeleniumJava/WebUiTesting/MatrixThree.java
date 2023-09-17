package SeleniumJava.WebUiTesting;

public class MatrixThree {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int a[][] = {{2,3,4},{5,16,7},{8,9,0}};
		int max = a[2][1];
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				if(a[i][j]>=max)
				{
					System.out.println(max = a[i][j]); 
				}
				
			}
			
		}
		
	}
}
