package studyproject.demo.designmode.zerenlian.zerenlian1;

import studyproject.demo.designmode.zerenlian.zerenlian1.IChain;
import studyproject.demo.designmode.zerenlian.zerenlian1.Request;

/**
 * @author: penglin
 * @date: 2022/4/4
 * @description:
 */
public class SaveChain implements IChain {

    IChain chain;

    public SaveChain() {
    }

    public SaveChain(IChain chain){
        this.chain = chain;
    }

    @Override
    public void procdess(Request request) {
        // TODO 这个chain的逻辑处理
        System.out.println("save chain");
        // 指向下一个chain
        if(chain != null){
            chain.procdess(request);
        }
    }
}
