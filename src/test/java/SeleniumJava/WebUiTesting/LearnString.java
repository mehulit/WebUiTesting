package SeleniumJava.WebUiTesting;

public class LearnString
{

	public  static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String someString = "elephant";
		long count = someString.chars().filter(ch -> ch == 'e').count();
		System.out.println(count);

	}

}
