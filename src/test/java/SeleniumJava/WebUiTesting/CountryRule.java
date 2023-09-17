package SeleniumJava.WebUiTesting;

public class CountryRule implements CentralRule, trainSymbol
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		CountryRule cr = new CountryRule();
		cr.greenSignal();
		cr.redSignal();
		cr.yellowSignal();
		cr.handSignal();

	}

	@Override
	public void greenSignal()
	{
		
		// TODO Auto-generated method stub
		System.out.println("Green signal GO");
		
	}

	@Override
	public void redSignal()
	{
		
		// TODO Auto-generated method stub
		System.out.println("Red signal STOP");
		
	}
	
	public void yellowSignal()
	{
		
		// TODO Auto-generated method stub
		System.out.println("yellow signal WALK");
		
	}

	@Override
	public void handSignal()
	{
		// TODO Auto-generated method stub
		System.out.println("hand signal GO FAST");
		
	}
	
	
	

}
