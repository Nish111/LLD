package multiThreadingSynchronization;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) throws InterruptedException {
    	// without lock
    /*	Count count1 = new Count(0);
    	Adder ad = new Adder(count1);
    	Subtractor sb = new Subtractor(count1);
    	Thread t11 = new Thread(ad);
    	Thread t21 = new Thread(sb);
    	t11.start();
    	t21.start();
    	 System.out.println("Count : " + count1.getCount());
    	*/
    	 // with mutex lock
    	 Lock lock = new ReentrantLock();
    	 Count count1 = new Count(0);
     	Adder ad = new Adder(count1, lock);
     	Subtractor sb = new Subtractor(count1, lock);
     	Thread t11 = new Thread(ad);
     	Thread t21 = new Thread(sb);
     	t11.start();
     	t21.start();
     	 System.out.println("Count : " + count1.getCount());
    	 //        Lock lock = new ReentrantLock();
//        Count count = new Count(0);
//        Adder adder = new Adder(count,lock);
//        Subtractor subtractor = new Subtractor(count,lock);
//
//        Thread t1 = new Thread(adder);
//        Thread t2 = new Thread(subtractor);
//
//        t1.start(); // +1
//        t2.start(); // -1
/*
        Count count = new Count(0);
        IncrementCount iCount1 = new IncrementCount(count);
        IncrementCount iCount2 = new IncrementCount(count);
        Thread t1 = new Thread(iCount1);
        Thread t2 = new Thread(iCount2);

        t1.start();
        t2.start();

        Thread.sleep(1000); // pauses the current thread -> main thread
        System.out.println(count.getCount());
        */
    }
}
/*
        sequential -> count, 10000, final value -> 20000
        parallel ->

        count = 4
        // Thread1 -> 1 -> 2 -> 3 -> 4
        // Thread2 -> 4 -> 5 -> 6
        // Thread1 -> 6 -> 7

        Sequentially
            T1 -> 10000
            T2 -> 20000
 */
//