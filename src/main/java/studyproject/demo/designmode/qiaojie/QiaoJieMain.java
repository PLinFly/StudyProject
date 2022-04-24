package studyproject.demo.designmode.qiaojie;

/**
 * @author: penglin
 * @date: 2022/4/8
 * @description: 桥接模式主要是针对多维度的变化。  其中一个维度的变化可能对某个结果导致大量的变化
 * 例子参考： https://blog.csdn.net/weixin_39296283/article/details/104953668?spm=1001.2014.3001.5506
 * 在本例中，以其中一个维度为主，其他维度为辅助，某一个维度的变化都可以给组合带来几何数的变化，此时可以采用桥接模式
 */
public class QiaoJieMain {

    private static ShapeQiaoJie shapeQiaoJie;

    public static void main(String[] args) {
        shapeQiaoJie = new CicleQiaoJie(new Red(),new Big());
        shapeQiaoJie.shape();

        shapeQiaoJie = new RectangleQiaoJie(new Green(),new Small());
        shapeQiaoJie.shape();
    }
}
