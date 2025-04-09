package MultiThreading.ProducerConsumerProblem;

public class App {
	
	public static void main(String args[]) throws InterruptedException
	{
		SharedResource resource = new SharedResource(3);
		
		Runnable producer = () ->{
			for(int i=0;i<=6;i++)
			{
				resource.produce(i);
			}
		};
		
		Runnable consumer = () -> {
			for(int i=0;i<=6;i++)
			{
				resource.consume();
			}
		};
		
		Thread producerThread = new Thread(producer);
		Thread consumerThread = new Thread(consumer);
		
		producerThread.start();
		
		consumerThread.start();
	}

}
