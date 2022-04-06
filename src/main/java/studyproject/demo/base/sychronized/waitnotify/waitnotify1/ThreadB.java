package studyproject.demo.base.sychronized.waitnotify.waitnotify1;

/**
 * @author: penglin
 * @date: 2022/4/6
 * @description:
 */
public class ThreadB implements Runnable{
    Object lock;

    public ThreadB(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        synchronized (lock){
            System.out.println("ThreadB start");
            lock.notify();
            System.out.println("ThreadB end");
        }
    }
}
