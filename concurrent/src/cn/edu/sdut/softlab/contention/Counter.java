package cn.edu.sdut.softlab.contention;

import java.util.Random;

/**
 * Created by subaochen on 17-2-13.
 */
public class Counter {
    private int c = 0;

    public synchronized void increment() {
        System.out.println("in increment()");
        sleep();
        int temp = c;
        System.out.println("in increment() - after get value from c to temp:" + c);
        sleep();
        temp++;
        System.out.println("in increment() - after temp++:" + temp);
        sleep();
        c = temp;
        sleep();
        System.out.println("in increment() - after store c to new value:" + temp);
    }

    public  synchronized void decrement() {
        System.out.println("in decrement()");
        sleep();
        int temp = c;
        System.out.println("in decrement() - after get value from c to temp:" + temp);
        sleep();
        temp--;
        System.out.println("in decrement() - after temp--:" + temp);
        sleep();
        c = temp;
        sleep();
        System.out.println("in decrement() - after store c to new value:" + temp);
    }

    public int value() {
        return c;
    }

    private void sleep() {
        Random random = new Random();
        try {
            Thread.sleep(random.nextInt(1000));
        } catch (InterruptedException e) {
            return;
        }
    }
}
