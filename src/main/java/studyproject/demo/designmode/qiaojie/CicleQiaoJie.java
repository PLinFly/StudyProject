package studyproject.demo.designmode.qiaojie;

/**
 * @author: penglin
 * @date: 2022/4/8
 * @description:
 */
public class CicleQiaoJie extends ShapeQiaoJie{

    public CicleQiaoJie(Color color, Size size) {
        super(color, size);
    }

    @Override
    void shape() {
        size.size();
        color.color();
        System.out.println("圆");
    }
}
