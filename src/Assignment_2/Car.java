package Assignment_2;

public class Car extends Vehicle{

    //child class

    //attribute
    private boolean convertableOrNot;

    //constructor
    public Car(String make, String model, int year, int fourOrTwoWheelDrive, int reatailPrice, int milesPerGallon, boolean convertableOrNot) {
        super(make, model, year, fourOrTwoWheelDrive, reatailPrice, milesPerGallon);
        this.convertableOrNot = convertableOrNot;
    }

    //getters and setters
    public boolean isConvertableOrNot() {
        return convertableOrNot;
    }

    public void setConvertableOrNot(boolean convertableOrNot) {
        this.convertableOrNot = convertableOrNot;
    }

    //print car attribute
    @Override
    public void printVehicle() {
        super.printVehicle();
        if (convertableOrNot == true || convertableOrNot == false){
            System.out.println("Convertable or not = " + convertableOrNot + "\n" );
        }

    }

}
