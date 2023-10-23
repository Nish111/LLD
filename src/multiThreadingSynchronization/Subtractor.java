package multiThreadingSynchronization;

import java.util.concurrent.locks.Lock;

public class Subtractor implements Runnable {
    private Count count;
    private Lock lock;

	/*
	 * public Subtractor(Count count) { // this.lock = lock; this.count = count;
	 * 
	 * }
	 */
    public Subtractor(Count count, Lock lock) {
        this.lock = lock;
        this.count = count;
    }
    @Override
    public void run() {
    	//count.setCount(count.getCount() - 1);
    	lock.lock();
    	for(int i=0;i<10000;i++) {
            count.setCount(count.getCount() - 1);
        }
    	System.out.println("Count Subtractor inside lock: " + count.getCount());
    	lock.unlock();
    	
    	try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	// with sleep output is
    	/*
    	 * Count : 0
Count Adder Inside lock: 10000
Count Adder: 10000
Count Subtractor inside lock: 0
Count Subtractor: 0
    	 */
    	 System.out.println("Count Subtractor: " + count.getCount());
    	 /*
    	  * this gives output as
    	  * Count : 0
Count Adder Inside lock: 10000
Count Adder: 10000
Count Subtractor inside lock: 0
Count Subtractor: 0
    	  */
    }
    /*
    public Subtractor(Count count, Lock lock) {
        this.lock = lock;
        this.count = count;
    }


    @Override
    public void run() {
        System.out.println("Hi, Subtractor");
        lock.lock(); // T2 taking a lock time 2ms
        for(int i=0;i<10000;i++) {
            count.setCount(count.getCount() - 1);
        }
        System.out.println("Count Subtractor: " + count.getCount());
        lock.unlock();
        System.out.println("Bye, Subtractor");
    }
    */
}
