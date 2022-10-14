
public class TestCar {
    public static void main(String [] args){

        Car car1 = new Car("Mazda", "8WD");

        // create an object of inner class using the outer class
        Car.Engine engine = car1.new Engine();
        engine.setEngine();
        System.out.println("Engine type for 8Wd = "+engine.getEngineType());

        Car car2 = new Car("Chrysler","4WD");
        Car.Engine car2Engine = car2.new Engine();
        car2Engine.setEngine();
        System.out.println("Engine type for 4WD = "+car2Engine.getEngineType());



        // create an object of the static nested class
        Motherboard motherboard = new Motherboard("Gigabyte");
        Motherboard.USB usb = motherboard.new USB();
        System.out.println("Total "+motherboard.getModel()+ " USB Ports = "+usb.getTotalPorts());


        Gearbox mcLaren = new Gearbox(6);
        mcLaren.operateClutch(true);
        mcLaren.changeGear(1);
        mcLaren.operateClutch(false);
        System.out.println(mcLaren.wheelSpeed(1000));
        mcLaren.changeGear(2);
        System.out.println(mcLaren.wheelSpeed(3000));
        mcLaren.operateClutch(true);
        mcLaren.changeGear(3);
        mcLaren.operateClutch(false);
        System.out.println(mcLaren.wheelSpeed(6000));

    }
}
