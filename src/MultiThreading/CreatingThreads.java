package MultiThreading;

public class CreatingThreads {
	
	
	public static void main(String[] args) throws InterruptedException
	{
		SharedResource resource = new SharedResource(0);
		
		Thread t1 = new Thread(()->{
			System.out.println(Thread.currentThread().getName()+ "Thread running");
			
			for(int i=0;i< 500;i++)
			{
				resource.setCount(resource.getCount()+1);
			}
		});
		t1.setName("Thread1");
		t1.start();
		
		Runnable r = () ->{
			System.out.println(Thread.currentThread().getName()+ "Thread running");
			
			for(int i=0;i< 500;i++)
			{
				resource.setCount(resource.getCount()+1);
			}
		};
		Thread t2 = new Thread(r);
		t2.setName("Thread2");
		t2.start();
		
		t1.join();
		t2.join();
		
		
		System.out.println("Value of count is :"+resource.count);
		
		
	}

}
