package MultiThreading.ThreadPoolExecutor;

import java.util.concurrent.*;

// application where we will not use the max thread , minpoolSize : 2, queueSizze = 2, task submitted is 4, so no additonalThread are created
public class Application {
	
	public static void main(String args[])
	{
		//ThreadPoolExecutor executor = new ThreadPoolExecutor(2,4,10 ,TimeUnit.MINUTES,new ArrayBlockingQueue<>(2), Executors.defaultThreadFactory(), new ThreadPoolExecutor.DiscardPolicy());
		ThreadPoolExecutor executor = new ThreadPoolExecutor(2,4,10 ,TimeUnit.MINUTES,new ArrayBlockingQueue<>(2),new CustomThreadFactory(), new CustomRejectHandler());
		
		
		for(int i = 0;i<4;i++) {
			
			executor.submit(()->{
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Thread : "+Thread.currentThread()+" executing task.");
			});
		}
		
		executor.shutdown();
	}

}
