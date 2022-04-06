package studyproject.demo.base.neibulei;

/**
 * @author: penglin
 * @date: 2022/4/4
 * @description: 这是匿名内部类
 * 针对对象：可以使接口、抽象类、具体类
 *
 * 编译之后产生一个单独的.class字节码文件
 * 和lambda的区别参考：https://blog.csdn.net/weixin_44375501/article/details/109378288
 */
public class VehicleMain {

    public static void main(String[] args) {
        UseVehicle useVehicle = new UseVehicle(new Vehicle() {
            @Override
            public void color() {
                System.out.println("color");
            }

            @Override
            public void speed() {
                System.out.println("speed");
            }
        });
        useVehicle.work();

        //--------------------------------------------

        UseVehicle vehicle = new UseVehicle(new Object() {
            @Override
            public int hashCode() {
                return 1;
            }
        });
//        System.out.println(vehicle.hashCode());
    }
}
