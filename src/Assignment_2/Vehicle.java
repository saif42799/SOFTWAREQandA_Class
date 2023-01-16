package Assignment_2;

public class Vehicle {

    //Super class

    //attributes of a vehicles
    private String make;
    private String model;
    private int year;
    private int fourOrTwoWheelDrive;
    private double reatailPrice;
    private int milesPerGallon;

    //constructor
    public Vehicle(String make, String model, int year, int fourOrTwoWheelDrive, int reatailPrice, int milesPerGallon) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.fourOrTwoWheelDrive = fourOrTwoWheelDrive;
        this.reatailPrice = reatailPrice;
        this.milesPerGallon = milesPerGallon;

    }

    //getters and setters
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getFourOrTwoWheelDrive() {
        return fourOrTwoWheelDrive;
    }

    public void setFourOrTwoWheelDrive(int fourOrTwoWheelDrive) {
        this.fourOrTwoWheelDrive = fourOrTwoWheelDrive;
    }

    public int getReatailPrice() {
        return (int) reatailPrice;
    }

    public void setReatailPrice(int reatailPrice) {
        this.reatailPrice = reatailPrice;
    }

    public int getMilesPerGallon() {
        return milesPerGallon;
    }

    public void setMilesPerGallon(int milesPerGallon) {
        this.milesPerGallon = milesPerGallon;
    }


    public void printVehicle() {
        System.out.println(
                "Vehicle" + "\n" +
                        year + " " + make + " " + model + "\n" +
                        "Four or two wheel drive = " + fourOrTwoWheelDrive + "\n" +
                        "$" + reatailPrice + "\n" +
                        milesPerGallon + " MPG"  );

    }

//    @Override
//    public String toString() {
//        return
//                "Vehicle{" + "\n" +
//                year + " " + make + " " + model + "\n" +
//                "Four or two wheel drive = " + fourOrTwoWheelDrive + "\n" +
//                "$" + reatailPrice + "\n" +
//                milesPerGallon + " MPG" + '}' + "\n" ;
//    }
}
