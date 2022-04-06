package studyproject.demo.designmode.strategy.strategy2;

/**
 * @author: penglin
 * @date: 2022/4/5
 * @description: 用抽象类的形式，其实我觉得在实际情况中，使用抽象类来实现策略模式还好一点
 * 因为说接口定义规范，抽象类定义不同点。父类有自己的实现，子类只用实现不同的地方就可以了
 * 具体的就不写了，差不多的
 */
public abstract class Strategy {

    public void work(){
        System.out.println("work");
    }

    public abstract void worked();
}
