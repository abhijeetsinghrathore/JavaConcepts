package MultiThreading.ThreadPoolExecutor;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

//application where we will  use the max thread , minpoolSize : 2, queueSizze = 2, task submitted is 5, so additonalThread are created
public class ApplicationToUseAdditionalThreads {
	public static void main(String args[])
	{
		//ThreadPoolExecutor executor = new ThreadPoolExecutor(2,4,10 ,TimeUnit.MINUTES,new ArrayBlockingQueue<>(2), Executors.defaultThreadFactory(), new ThreadPoolExecutor.DiscardPolicy());
		ThreadPoolExecutor executor = new ThreadPoolExecutor(2,4,10 ,TimeUnit.MINUTES,new ArrayBlockingQueue<>(2),new CustomThreadFactory(), new CustomRejectHandler());
		executor.allowCoreThreadTimeOut(true);// this will allow the termination of thread is the thread pool after an idle time of 10mins
		
		for(int i = 0;i<5;i++) {
			
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
