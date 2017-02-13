package cn.edu.sdut.softlab.contention;

import java.util.Random;

/**
 * Created by subaochen on 17-2-13.
 */
public class CounterClient {
    private static Counter counter = new Counter();
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                counter.increment();
                System.out.println("t1,counter value=" + counter.value());
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                counter.decrement();
                System.out.println("t2,counter value=" + counter.value());
            }
        });

        t1.start();
        t2.start();


    }
}
