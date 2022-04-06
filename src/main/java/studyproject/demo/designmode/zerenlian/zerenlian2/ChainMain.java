package studyproject.demo.designmode.zerenlian.zerenlian2;


/**
 * @author: penglin
 * @date: 2022/4/4
 * @description:
 * 1.这里每个chain都继承了Thread，具体对request处理都是一个新的线程进行处理
 * 2.这也就意味着线程之间没有先后顺序的保证，适用于没有先后顺序的情况，要保证先后顺序还是使用于情况包 1
 * 3.现在如果是这样的情况：① 每一个链包含两种不同的处理情况  ② 多线程处理 每个Request按顺序执行一条链路
 * 情况①见包3
 */
public class ChainMain {

    static PreChain chain;

    public ChainMain(){
        SaveChain saveChain = new SaveChain();
        PrintChain printChain = new PrintChain(saveChain);
        chain = new PreChain(printChain);
        saveChain.start();
        printChain.start();
        chain.start();
    }

    public static void main(String[] args) throws InterruptedException {
        new ChainMain();
        Request request = new Request("100", "success");
        chain.procdess(request);

//        Thread.sleep(2000);
//        chain.procdess(new Request());

    }
}
