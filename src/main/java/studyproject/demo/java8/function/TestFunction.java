package studyproject.demo.java8.function;

import java.util.function.Function;

/**
 * @author: penglin
 * @date: 2022/4/23
 * @description:
 * Function 这个类的作用就是减少重复代码的出现，就是说程序中只有某个集中的某一部分的代码是重复的
 * 然后在这个区域的前后代码都是完全一样的，这时候就可以Function
 *
 * 实际上呢，常见的简便写法就是运用的lambda表达式来实现的，因为Function类中只有一个抽象方法，
 * lambda表达式中的内容就相当于apply方法中的内容
 *
 * Function可以理解为函数，也即是y = f(x)
 * 以下面test方法为例，在使用的地方重写了apply方法，在test方法内部调用apply方法得到返回值，然后就是通用的处理
 *
 * 这个东西对使用场景有一定的限制，虽然可以在一定程度上减少代码的重复量，但是相对的来说还是降低了代码的可读性
 */
public class TestFunction implements Function {
    @Override
    public Object apply(Object o) {

        return null;
    }

    public static void main(String[] args) {
//        Function<Integer,Integer> triangle = arg -> arg*3;
//        Function<Integer,Integer> square = arg -> arg*arg;
//        int result1 = triangle.apply(1); //result1: 3
//        int result2 = square.apply(1);//result2: 1
//        System.out.println(result1);
//        System.out.println(result2);

        test(arg -> test1(1));

        test((x) -> {
            x = x + 1;
            x = x * 200;
            x = x - 5;
            return  x;
        });

        test((x) -> {
            x = x * 5;
            x = x + 20;
            return  x;
        });
    }

    static void test(Function<Integer,Integer> ints){
        // 。。 一些重复代码
        Integer apply = ints.apply(1);
        System.out.println(apply);
        // 。。 一些重复代码
    }

    static Integer test1(int x){
        return x;
    }
}
