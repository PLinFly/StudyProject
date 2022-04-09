package studyproject.demo.designmode.qiaojie;

/**
 * @author: penglin
 * @date: 2022/4/8
 * @description:
 */
public abstract class ShapeQiaoJie {
    protected Color color;
    protected Size size;

    public ShapeQiaoJie(Color color, Size size) {
        this.color = color;
        this.size = size;
    }

    abstract void shape();

}
