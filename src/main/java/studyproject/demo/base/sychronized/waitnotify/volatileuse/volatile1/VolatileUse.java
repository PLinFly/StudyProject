package studyproject.demo.base.sychronized.waitnotify.volatileuse.volatile1;

/**
 * @author: penglin
 * @date: 2022/4/10
 * @description:
 */
public class VolatileUse {

    public static volatile boolean flag = false;

    public static void main(String[] args) throws Exception {
        Thread thread = new Thread(() -> {
            long start = System.currentTimeMillis();
            while(!flag){
                System.out.println(1);
            }
            long end = System.currentTimeMillis();
            System.out.println(end-start);
        });
        thread.start();
        Thread.sleep(2000);
        flag = true;
    }
}
