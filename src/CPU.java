public class CPU {
    double price;

    //nested class / inner class
     class Processor{
        double cores;
        String manufacturer;

        double getCache(){
            return 4.3;
        }
    }

    protected class RAM{
        //members of protected nested class
        double memory;
        String manufacturer;

        public RAM(double memory, String manufacturer){
            this.memory = memory;
            this.manufacturer = manufacturer;
        }

        double getClockSpeed(){
            return 5.5;
        }

        public String getManufacturer(){
            return this.manufacturer;
        }
    }
}
