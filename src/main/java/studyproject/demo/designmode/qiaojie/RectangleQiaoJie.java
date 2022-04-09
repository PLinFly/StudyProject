package studyproject.demo.designmode.qiaojie;

/**
 * @author: penglin
 * @date: 2022/4/8
 * @description:
 */
public class RectangleQiaoJie extends ShapeQiaoJie{

    public RectangleQiaoJie(Color color, Size size) {
        super(color, size);
    }

    @Override
    void shape() {
        size.size();
        color.color();
        System.out.println("长方形");
    }
}
