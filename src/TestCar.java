
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

    }
}
