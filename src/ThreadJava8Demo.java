
public class ThreadJava8Demo extends Thread
{
	public ThreadJava8Demo()
	{
		
	}

	@Override
	public void run() 
	{
		// TODO Auto-generated method stub
		int h=0;
		final int MAX=5000;
		for (int i=0; i<MAX; i++) 
		{
			h++;
			System.out.println(getName() + ":" + h);
		}
	}
}
