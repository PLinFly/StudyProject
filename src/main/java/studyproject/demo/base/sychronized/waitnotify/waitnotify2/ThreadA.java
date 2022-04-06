package studyproject.demo.base.sychronized.waitnotify.waitnotify2;

public class ThreadA implements Runnable{

    Object lock;

    public ThreadA(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {

        System.out.println("ThreadA start");
        synchronized (lock){
            try {
                lock.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("ThreadA end");
    }
}
