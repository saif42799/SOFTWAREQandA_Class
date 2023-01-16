package Assignment_2;

public class Truck extends Vehicle{

    //child class

    //attributes
    private boolean sideStepOrNot;
    private int towCapacity;


    //constructor
    public Truck(String make, String model, int year, int fourOrTwoWheelDrive, int reatailPrice, int milesPerGallon, boolean sideStepOrNot, int towCapacity) {
        super(make, model, year, fourOrTwoWheelDrive, reatailPrice, milesPerGallon);
        this.sideStepOrNot = sideStepOrNot;
        this.towCapacity = towCapacity;
    }

    //getter and setters
    public boolean getSideStepOrNot() {
        return sideStepOrNot;
    }

    public void setSideStepOrNot(boolean sideStepOrNot) {
        this.sideStepOrNot = sideStepOrNot;
    }

    public int getTowCapacity() {
        return towCapacity;
    }

    public void setTowCapacity(int towCapacity) {
        this.towCapacity = towCapacity;
    }

    //print truck attribute
    @Override
    public void printVehicle() {
        super.printVehicle();
        if (sideStepOrNot == true || sideStepOrNot == false){
            System.out.println("Side step or not = " + sideStepOrNot);
            System.out.println("Tow Capacity = " + towCapacity + "\n" );
        }


    }
}
