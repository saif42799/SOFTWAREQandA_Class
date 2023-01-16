package Assignment_2;

public class Inventory {

    //constructor
    public Inventory() {

    }

    //add method
    public void add(Vehicle addVehicle){
        MainTest.vehicleArrayList.add(addVehicle);
    }

    //remove method
    public void remove(Vehicle removeVehicle){
        MainTest.vehicleArrayList.remove(removeVehicle);
    }

    //find cheapest vehicle method
    public Vehicle findCheapestVehicle(){

        Vehicle cheap = null;

        for (Vehicle e : MainTest.vehicleArrayList){
            if (cheap == null || cheap.getReatailPrice() > e.getReatailPrice()) {
                cheap = e;
            }
        }
        return cheap;
    }

    //find most expensive vehicle method
    public Vehicle findMostExpensiveVehicle(){

        Vehicle expensive = null;

        for (Vehicle e : MainTest.vehicleArrayList){
            if (expensive == null || expensive.getReatailPrice() < e.getReatailPrice()) {
                expensive = e;
            }
        }
        return expensive;
    }

    //prints average price of all vehicles method
    public void printAveragePriceOfAllVehicles(){

        int holderNum = 0;
        int expensiveCar = 0;

        for (Vehicle e : MainTest.vehicleArrayList){
            for (int i = 0; i <= MainTest.vehicleArrayList.size(); i++) {
                holderNum = e.getReatailPrice() ;

            }

            expensiveCar = holderNum + expensiveCar;

        }

        expensiveCar = expensiveCar / MainTest.vehicleArrayList.size();

        System.out.println("Average price of all vehicles: " + "\n" + "$" + expensiveCar);

    }

}
