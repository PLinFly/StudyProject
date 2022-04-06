package studyproject.demo.designmode.strategy.strategy1;

/**
 * @author: penglin
 * @date: 2022/4/5
 * @description: 这个策略模式是通过实现接口的形式
 */
public class StrategyMain {

    public static void main(String[] args) {
        UseStrategy my = new UseStrategy(new MyStrategy());
        my.use();

        UseStrategy his = new UseStrategy(new HisStrategy());
        his.use();

        UseStrategy her = new UseStrategy(new HerStrategy());
        her.use();
    }
}
