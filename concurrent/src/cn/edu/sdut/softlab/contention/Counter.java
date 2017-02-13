package cn.edu.sdut.softlab.contention;

import java.util.Random;

/**
 * Created by subaochen on 17-2-13.
 * 本例来自https://docs.oracle.com/javase/tutorial/essential/concurrency/interfere.html
 */
public class Counter {
    private int c = 0;
    private static final int T1 = 500;
    private static final int T2 = 200;

    public void increment() {
        int temp = c;
        try {
            Thread.sleep(T1);
        } catch (InterruptedException e) {
            System.out.println("increament is interrupted before temp++, c = " + c);
        }
        temp++;
        try {
            Thread.sleep(T2);
        } catch (InterruptedException e) {
            System.out.println("increment is interrupted after temp++, c = " + c);
            //return
        }
        c = temp;
    }

    public void decrement() {
        int temp = c;
        try {
            Thread.sleep(T1);
        } catch (InterruptedException e) {
            System.out.println("decreament is interrupted before temp--, c = " + c);
        }
        temp--;
        try {
            Thread.sleep(T2);
        } catch (InterruptedException e) {
            System.out.println("decreament is interrupted after temp--, c = " + c);
            //return;
        }

        c = temp;
    }

    public int value() {
        return c;
    }
}
