package cn.edu.sdut.softlab.unsynced;

import java.util.Random;

/**
 * Created by subaochen on 17-2-13.
 */
public class Producer implements Runnable {
    private Box box;
    private int counter = 0;

    public Producer(Box box) {
        this.box = box;
    }

    @Override
    public void run() {
        Random random = new Random();
        while(true) {
            box.setValue(counter++);
            System.out.println("producer value: " + box.getValue());
            try {
                Thread.sleep(random.nextInt(1000));
            } catch (InterruptedException e) {
                break;
            }
        }
    }
}
