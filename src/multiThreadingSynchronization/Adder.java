package multiThreadingSynchronization;

import java.util.concurrent.locks.Lock;

public class Adder implements Runnable {
    private Count count;
    private Lock lock;

    public Adder(Count count, Lock lock) {
        this.count = count;
        this.lock = lock;
    }
    /*
    public Adder(Count count) {
        this.count = count;
        //this.lock = lock;
    }
*/
    @Override
    public void run() {
    	//count.setCount(count.getCount() + 1);
    	lock.lock();
    	 for(int i=0;i<10000;i++) {
             count.setCount(count.getCount() + 1);
         }
    	 System.out.println("Count Adder Inside lock: " + count.getCount());
    	 lock.unlock();
    	 System.out.println("Count Adder: " + count.getCount());
    	/*
        System.out.println("Hi, adder");
        lock.lock();
        for(int i=0;i<10000;i++) {
            count.setCount(count.getCount() + 1);
        }
        System.out.println("Count Adder: " + count.getCount());
        lock.unlock();
        System.out.println("Bye, adder");
        */
    }
}