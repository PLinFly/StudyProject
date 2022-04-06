package studyproject.demo.base.sychronized.waitnotify.waitnotify1;

/**
 * @author: penglin
 * @date: 2022/4/6
 * @description:
 */
public class ThreadA implements Runnable{

    Object lock;

    public ThreadA(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {

        synchronized (lock){
            System.out.println("ThreadA start");
            try {
                lock.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("ThreadA end");
        }
    }
}
