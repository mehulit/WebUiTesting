package SeleniumJava.WebUiTesting;

public class Airline extends Aircraftrule
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		Aircraftrule a = new Airline();
		a.engine();
		a.wing();
		a.color();
		a.logo();

	}

	@Override
	public void color()
	{
		// TODO Auto-generated method stub
		System.out.println("Red color");
		
	}

	@Override
	public void logo()
	{
		// TODO Auto-generated method stub
		System.out.println("black color logo");
		
	}

}
