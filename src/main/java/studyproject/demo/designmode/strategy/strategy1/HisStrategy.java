package studyproject.demo.designmode.strategy.strategy1;

/**
 * @author: penglin
 * @date: 2022/4/5
 * @description:
 */
public class HisStrategy implements IStrategy {
    @Override
    public void deal() {
        System.out.println("His Strategy");
    }
}
