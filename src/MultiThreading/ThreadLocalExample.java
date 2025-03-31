package MultiThreading;

public class ThreadLocalExample {
	
  public static void main(String args[])
  {
	  	ThreadLocal<Integer> tlocal= new ThreadLocal<>();
	  	
		
		Thread t1 = new Thread(()->{
			System.out.println(Thread.currentThread().getName()+ "Thread running");
			tlocal.set(1);
			System.out.println(tlocal.get());
			
			
		});
		t1.setName("Thread1");
		t1.start();
		
		Runnable r = () ->{
			System.out.println(Thread.currentThread().getName()+ "Thread running");
			tlocal.set(2);
			System.out.println(tlocal.get());
			
			
		};
		Thread t2 = new Thread(r);
		t2.setName("Thread2");
		t2.start();
		
		System.out.println(tlocal.get());
  }
}
