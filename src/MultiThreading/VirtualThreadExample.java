package MultiThreading;

public class VirtualThreadExample {
	
	public static void main(String args[])
	{
		Thread t1 = Thread.ofVirtual().start(()->{
			System.out.println("Created virtual thread"+ Thread.currentThread().getName());
		});
		
	}

}
