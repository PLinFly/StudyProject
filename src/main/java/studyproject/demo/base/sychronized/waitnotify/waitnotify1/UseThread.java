package studyproject.demo.base.sychronized.waitnotify.waitnotify1;

/**
 * @author: penglin
 * @date: 2022/4/6
 * @description:
 * 这里演示 wait和notify的使用
 * 两个线程抢占锁的顺序是无法固定的
 * 如果是线程A 先抢占到锁 wait的时候会让出锁 然后B 拿到 能正常结束
 * 如果是线程B 先抢占到锁 直接notify结束了 A再抢到锁 这个时候就会一直阻塞 详情参数2
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
