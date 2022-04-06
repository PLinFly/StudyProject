package studyproject.demo.designmode.zerenlian.zerenlian1;

/**
 * @author: penglin
 * @date: 2022/4/4
 * @description:
 */
public class PreChain implements IChain {

    private IChain chain;

    public PreChain(){

    }

    public PreChain(IChain chain) {
        this.chain = chain;
    }

    @Override
    public void procdess(Request request) {
        // TODO 这里可以对请求进行处理
        System.out.println("pre chain");
        // 然后下面就是指向下一个链
        if(chain != null){
            chain.procdess(request);
        }
    }
}
