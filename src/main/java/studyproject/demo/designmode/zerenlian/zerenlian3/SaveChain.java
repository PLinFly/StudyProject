package studyproject.demo.designmode.zerenlian.zerenlian3;

import java.util.concurrent.LinkedBlockingDeque;

public class SaveChain extends Thread implements IChain {

    LinkedBlockingDeque<Request> requests = new LinkedBlockingDeque<>();

    private IChain chain;

    private volatile boolean ifEnd = false;

    public void shutDown(){
        ifEnd = true;
    }

    public SaveChain(){
    }

    public SaveChain(IChain chain) {
        this.chain = chain;
    }

    @Override
    public void run() {
        while(!ifEnd){
            try {
                // TODO 这里做自己的逻辑
                Request request = requests.take();
                if(null != chain){
                    chain.procdess(request);
                }
                System.out.println("save chain");
            } catch (InterruptedException e) {
                e.printStackTrace();
                shutDown();
            }

        }
    }

    @Override
    public void procdess(Request request) {
        // 加入到阻塞队列里面
        requests.add(request);
    }

}
