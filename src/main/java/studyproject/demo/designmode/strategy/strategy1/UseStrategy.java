package studyproject.demo.designmode.strategy.strategy1;

/**
 * @author: penglin
 * @date: 2022/4/5
 * @description:
 */
public class UseStrategy {
    private IStrategy strategy;

    public UseStrategy(IStrategy strategy) {
        this.strategy = strategy;
    }

    public void use(){
        strategy.deal();
    }
}
