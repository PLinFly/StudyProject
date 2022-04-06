package studyproject.demo.designmode.zerenlian.zerenlian1;

/**
 * @author: penglin
 * @date: 2022/4/4
 * @description:
 * 1.这种形式只是简单的将下一个链指定，有点简陋
 * 2.这种是串行执行的，我有个问题，如果责任链某个地方通不过怎么办
 *
 */
public class ChainMain {

    public static void main(String[] args) {
        Request request = new Request("100", "success");
        SaveChain saveChain = new SaveChain();
        PrintChain printChain = new PrintChain(saveChain);
        PreChain preChain = new PreChain(printChain);
        preChain.procdess(request);
    }
}
