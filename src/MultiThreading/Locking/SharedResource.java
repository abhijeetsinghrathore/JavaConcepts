package MultiThreading.Locking;

import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.*;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class SharedResource {
	
	boolean isAvailable = false;
	
	//1: Reentrant lock
	ReentrantLock lock = new ReentrantLock();
	
	// 2: ReadWriteLock
	ReadWriteLock lock1 = new ReentrantReadWriteLock();
	
	// 3: StampedLock
	StampedLock lock2 = new StampedLock();
	
	//4: Semaphores, permits n thread to acess the critical section
	Semaphore lock3 = new Semaphore(2);
	
	public void producer()
	{
		
		// ReentrantLock
		lock.lock();
		lock.unlock();
		
		
		// ReadWriteLock : Read lock
		lock1.readLock().lock();
		lock1.readLock().unlock();
		
		
		// ReadWriteLock : Write lock
		lock1.writeLock().lock();
		lock1.writeLock().unlock();
		
		
		// StampedLock : Pessimistic readLock
		long stamp = lock2.readLock();
		lock2.unlockRead(stamp);
		
		// StampedLock : Pessimistic readLock
		long stamp2 = lock2.writeLock();
		lock2.unlockWrite(stamp2);
		
		
		// StampedLock : optimistic locking
		long stamp3= lock2.tryOptimisticRead();
		
		if(lock2.validate(stamp3))
		{
			// do the update
		}
		// there is no need to unlock in optimistic locking
		
		
		
		// Semaphores
		try {
			lock3.acquire();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		lock3.release();
		
	}

}
