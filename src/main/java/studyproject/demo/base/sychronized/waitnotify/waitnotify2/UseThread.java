package studyproject.demo.base.sychronized.waitnotify.waitnotify2;

/**
 * 线程A先输出一句再占用锁，从时间上赶不及B直接获得锁（大概率），这个时候B直接获得锁然后执行结束，A就一直阻塞
 *
 * 可以先让B等待一小段时间，让A先拿到锁，这时候就可以正常的执行结束
 */
public class UseThread {

    public static void main(String[] args) {
        Object lock = new Object();
        ThreadA threadA = new ThreadA(lock);
        ThreadB threadB = new ThreadB(lock);
        Thread thread = new Thread(threadA);
        Thread thread1 = new Thread(threadB);

        thread.start();
        thread1.start();
    }
}
