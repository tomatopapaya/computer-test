class vehicle
{
    void run(){
        System.out.println("engine is running");
    }
}
class Car extends vehicle{
    public int tire;
    public String getInformation() {
        return "汽車:"+ tire + "輪";
    }
}
class Scooter extends vehicle{
    public int tire;
    public String getInformation() {
        return "機車:" +tire + "輪";
    }
}


public class Car2 {
    public static void main(String[] args) {
        Car car = new Car();
        Scooter scooter = new Scooter();
        car.tire = 4;
        scooter.tire = 2;
        System.out.println(scooter.getInformation());
        scooter.run();
        System.out.println(car.getInformation());
        car.run();
    }
}


