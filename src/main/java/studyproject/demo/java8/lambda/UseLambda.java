package studyproject.demo.java8.lambda;

/**
 * @author: penglin
 * @date: 2022/4/4
 * @description:
 */
public class UseLambda {
    private ILmbda iLmbda;

    public UseLambda(ILmbda lmbda){
        System.out.println("2");
    }

    public UseLambda(Object o){}


//    如果是两个接口的话就分不清了
//    public UseLambda(ILmbda2 lmbda){
//        System.out.println("2");
//    }
}
