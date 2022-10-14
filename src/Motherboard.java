public class Motherboard {

    private String model;
    public Motherboard(String model){
        this.model = model;
    }

    public String getModel(){
        return this.model;
    }
    //static inner class
     class USB{
        private int usb2 = 2;
        private int usb3 = 1;

        int getTotalPorts(){
            // accessing the variable model of the outer classs
            if(Motherboard.this.model.equals("MSI")) {
                return 4;
            }
            else {
                return usb2 + usb3;
            }
        }
    }
}
