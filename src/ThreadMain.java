
public class ThreadMain 
{
	public static void main(String[] args) 
	{
		int h1=0;
		
		//ThreadJava8Demo	th1 = new ThreadJava8Demo();
		ThreadJava8Demo	th2 = new ThreadJava8Demo();
		Thread th3 = new Thread(new HorseRunnable());
		
		th3.start();
		th2.start();
		for (int i=0; i<5000; i++) 
		{
			h1++;
			System.out.println("H1:" + h1);
		}
		
		
	}

}
