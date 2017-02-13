package cn.edu.sdut.softlab.unsynced;

/**
 * Created by subaochen on 17-2-13.
 */
public class Client {
    public static void main(String[] args) throws InterruptedException {
        Box box = new Box();
        Producer p = new Producer(box);
        Thread pt = new Thread(p);
        pt.start();
        Consumer c = new Consumer(box);
        Thread ct = new Thread(c);
        ct.start();
        Thread.sleep(5000);
        pt.interrupt();
        ct.interrupt();
    }
}
