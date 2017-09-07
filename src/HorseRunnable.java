
public class HorseRunnable implements Runnable
{

	@Override
	public void run() 
	{
		// TODO Auto-generated method stub
		final int MAX = 5000;
		int h=0;
		for (int i=0; i<MAX; i++) 
		{
			//h++;
			System.out.println(++h);
		}
	}

}

