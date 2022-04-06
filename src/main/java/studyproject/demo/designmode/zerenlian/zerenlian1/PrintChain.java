package studyproject.demo.designmode.zerenlian.zerenlian1;

/**
 * @author: penglin
 * @date: 2022/4/4
 * @description:
 */
public class PrintChain implements IChain {

    private IChain chain;

    public PrintChain() {
    }

    public PrintChain(IChain chain){
        this.chain = chain;
    }

    @Override
    public void procdess(Request request) {
        // TODO 逻辑处理
        System.out.println("print chain");
        if(chain != null){
            chain.procdess(request);
        }
    }
}
