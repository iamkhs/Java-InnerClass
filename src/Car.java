public class Car {
    private final String carName;
    private final String carType;

    // assign values using constructor
    public Car(String carName, String carType){
        this.carName = carName;
        this.carType = carType;
    }

    //private method
    private String getCarName(){
        return this.carName;
    }


    // inner class
    class Engine{
        private String engineType;
        protected void setEngine(){

            // Accessing the carType property of Car
            if (Car.this.carType.equals("4WD")){

                // Invoking method getCarName() of Car
                if (Car.this.getCarName().equals("Chrysler")){
                    this.engineType = "Smaller";
                }else {
                    this.engineType = "Bigger";
                }
            }
            else {
                this.engineType = "Bigger";
            }
        }

        protected String getEngineType(){
            return this.engineType;
        }
    }

}
