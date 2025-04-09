package MultiThreading.ProducerConsumerProblem;


import java.util.*;
public class SharedResource {
	
	private Queue<Integer> q;
	private int maxSize;
	
	public SharedResource(int size)
	{
		this.q=new LinkedList<>();
		this.maxSize = size;
	}
	
	
	public synchronized void  produce(int item)
	{
		while(q.size()==maxSize)
		{
			System.out.println("Cannot add more item to the queue, queue is full");
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		q.add(item);
		System.out.println("Item added to the queue by producer: "+item);
		notify();
	}
	
	public synchronized int consume()
	{
		while(q.isEmpty())
		{
			System.out.println("Queue is empty, cannot consume");
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		int item = q.poll();
		System.out.println("Consumed item from the queue: "+item);
		notify();
		
		return item;
	}

}
