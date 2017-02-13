package cn.edu.sdut.softlab.unsynced;

import java.util.Random;

/**
 * Created by subaochen on 17-2-13.
 */
public class Consumer implements Runnable {
    private Box box;
    public Consumer(Box box) {
        this.box = box;
    }

    @Override
    public void run() {
        Random random = new Random();
        while(true) {
            System.out.println("consumer value: " + box.getValue());
            try {
                Thread.sleep(random.nextInt(2000));
            } catch (InterruptedException e) {
                break;
            }
        }
    }
}
