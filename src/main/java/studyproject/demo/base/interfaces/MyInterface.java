package studyproject.demo.base.interfaces;

/**
 * @author: penglin
 * @date: 2022/4/4
 * @description:
 */
public interface MyInterface {

    void homework();

    default void salary(){
    }

    default void work(){
        System.out.println("fefault work");
    }

    static void job(){
        System.out.println("static jbo");
    }
}
