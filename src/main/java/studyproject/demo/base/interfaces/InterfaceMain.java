package studyproject.demo.base.interfaces;

/**
 * @author: penglin
 * @date: 2022/4/4
 * @description: 这是对接口的测试，包括使用abstract、default、static
 * 使用abstract就是正常的子类重写
 * 使用default就是接口有一个实现，子类可以选择是否重写这个方法
 * 使用static就是用这个接口自己来调用方法
 *
 * 接口定义规范，抽象类定义不同点
 */
public class InterfaceMain {
    public static void main(String[] args) {
        MyInterfaceGet interfaceGet = new MyInterfaceGet();
        MyInterface.job();
        interfaceGet.homework();
        interfaceGet.work();
    }
}
