package studyproject.demo.base.sychronized.waitnotify.waitnotify2;

public class ThreadB implements Runnable{
    Object lock;

    public ThreadB(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
//        try {
//            Thread.sleep(200);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        synchronized (lock){
            System.out.println("ThreadB start");
            lock.notify();
            System.out.println("ThreadB end");
        }
    }
}
