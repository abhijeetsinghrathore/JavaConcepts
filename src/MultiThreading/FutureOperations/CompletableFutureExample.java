package MultiThreading.FutureOperations;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class CompletableFutureExample {
	
	public static void main(String args[])
	{
		ThreadPoolExecutor exec = new ThreadPoolExecutor(2,4,10,TimeUnit.MINUTES,
				new ArrayBlockingQueue<>(2), Executors.defaultThreadFactory(),new ThreadPoolExecutor.AbortPolicy());
		
		
		// if we dont supply the executor , by default it picks the fork-join pool executor
		/*
		 * CompletableFuture<String> future = CompletableFuture.supplyAsync(()->{ return
		 * "Task completed"; });
		 */
		
		CompletableFuture<String> future = CompletableFuture.supplyAsync(()->{ return
				  "Task completed"; }, exec);
		
		try {
			System.out.println(future.get());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
