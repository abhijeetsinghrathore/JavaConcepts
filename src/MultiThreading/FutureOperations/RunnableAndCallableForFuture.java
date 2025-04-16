package MultiThreading.FutureOperations;


import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class RunnableAndCallableForFuture {
	
	public static void main(String args[])
	{
		ThreadPoolExecutor exec = new ThreadPoolExecutor(2,4,10,TimeUnit.MINUTES,
				new ArrayBlockingQueue<>(2), Executors.defaultThreadFactory(),new ThreadPoolExecutor.AbortPolicy());
		
		
		Future<?> object1 = exec.submit(()->{
			System.out.println("Task1 executed");
		});
		
		try {
			Object object = object1.get();
			System.out.print("object1 is null: ");
			System.out.println(object == null);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Future<List<Integer>> object2 = exec.submit(()->{
			System.out.println("Task2 executed");
			return Arrays.asList(1,2);
		});
		
		try {
			System.out.println(object2.get());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
