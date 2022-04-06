package studyproject.demo.base.neibulei;

/**
 * @author: penglin
 * @date: 2022/4/4
 * @description:
 */
public class UseVehicle {

    private Vehicle vehicle;

    public UseVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public UseVehicle(Object o) {
        System.out.println(2);
    }

    public void work(){
        vehicle.color();
        vehicle.speed();
    }

    public void salary(Object o){
        System.out.println(1);
    }
}
