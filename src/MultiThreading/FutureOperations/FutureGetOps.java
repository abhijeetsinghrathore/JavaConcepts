package MultiThreading.FutureOperations;

import java.util.concurrent.*;

public class FutureGetOps {
	
	public static void main(String args[])
	{
		ThreadPoolExecutor exec = new ThreadPoolExecutor(2,4,10,TimeUnit.MINUTES,
				new ArrayBlockingQueue<>(2), Executors.defaultThreadFactory(),new ThreadPoolExecutor.AbortPolicy());
		
		Future<?> f = exec.submit(()->{
			try {
				Thread.sleep(7000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread()+" :Thread executed the task");
		});
		
		try
		{
			f.get(2,TimeUnit.SECONDS);
		}
		catch(TimeoutException e)
		{
			System.out.println("Task is still executing, timeout exception");
		}
		catch(Exception e)
		{
			System.out.println("Task is still executing,not timeout exception");
		}
		
		try {
			f.get();
		}
		catch(Exception e)
		{
			System.out.println("Exception in f.get()");
		}
		
		System.out.println("Task completed");
	}

}
