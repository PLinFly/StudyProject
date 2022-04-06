package studyproject.demo.java8.lambda;

/**
 * @author: penglin
 * @date: 2022/4/4
 * @description:
 * 使用限制：lambda表达式只能针对接口使用
 * lambda表达式 相当于给接口整了个实现类对象，重写了里面的方法,并且接口中只能有一个抽象方法
 * 编译之后，没有产生一个单独的.class字节码文件，对应的字节码文件会在运行的时候动态生成
 * 只是重写了里面的方法嗷
 *
 * 和lambda的区别参考：https://blog.csdn.net/weixin_44375501/article/details/109378288
 */
public class LambdaMain {

    public static void main(String[] args) {
        UseLambda useLambda = new UseLambda(() -> {
            System.out.println(1);
        });
    }
}
