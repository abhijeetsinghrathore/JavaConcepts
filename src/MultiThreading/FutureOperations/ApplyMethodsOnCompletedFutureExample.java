package MultiThreading.FutureOperations;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ApplyMethodsOnCompletedFutureExample {
	
	public static void main(String args[])
	{
		ThreadPoolExecutor exec = new ThreadPoolExecutor(2,4,10,TimeUnit.MINUTES,
				new ArrayBlockingQueue<>(2), Executors.defaultThreadFactory(),new ThreadPoolExecutor.AbortPolicy());
		
		
		/* Example for thenApply() */
		
		CompletableFuture<String> future1 = CompletableFuture.supplyAsync(()->{ 
			System.out.println("Thread exceuting supplyAsync for future1 : "+Thread.currentThread().getName());
			
			return
				  "Task1 completed"; }, exec).thenApply((String v)->
		{
			System.out.println("Thread exceuting thenApply for future1 : "+Thread.currentThread().getName());
			
			return v+ " succesfully";
		});
		
		try {
			System.out.println(future1.get());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		/* Example for thenApplyAsync() */
		
		CompletableFuture<String> future2 = CompletableFuture.supplyAsync(()->{ 
			System.out.println("Thread exceuting supplyAsync for future1 : "+Thread.currentThread().getName());
			
			return
				  "Task2 completed"; }, exec).thenApplyAsync((String v)->
		{
			System.out.println("Thread exceuting thenApplyAsnc for future1 : "+Thread.currentThread().getName());
			
			return v+ " succesfully";
		});
		
		try {
			System.out.println(future2.get());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
