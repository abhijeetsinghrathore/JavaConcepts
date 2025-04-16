package MultiThreading.ThreadPoolExecutor;

import java.util.concurrent.*;

public class ExecutorsUtility {
	
	public static void main(String args[])
	{
		// Fixed thread pool executor : fixed number of min/max thread
		ExecutorService executor = Executors.newFixedThreadPool(2);
		executor.submit(()->{
			System.out.println("Fixed thread pool");
		});
		
		// Cached thread pool executor : creates thread on demand 
		ExecutorService executor1 = Executors.newCachedThreadPool();
		executor1.submit(()->{
			System.out.println("Cached thread pool");
		});
		
		// Single thread pool executor: only 1 thread is present, good for sequential processing
		ExecutorService executor2 = Executors.newSingleThreadExecutor();
		executor2.submit(()->{
			System.out.println("Single thread pool");
		});
		
		// Fork-Join or Work-Stealing executor
		ExecutorService executor3 = Executors.newWorkStealingPool();
		executor3.submit(()->{
			System.out.println("Work-Stealing thread pool");
		});
		
		// Another mehthod to create ForkJoin pool
		ForkJoinPool pool = ForkJoinPool.commonPool();
		pool.submit(()->{
			System.out.println("Fork-Join thread pool");
		});
	}

}
