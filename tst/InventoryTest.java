import Assignment_2.*;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class InventoryTest {

    /* Use AAA (Arrange-Act-Assert) style of testing
    Have good code coverage (test at the minimum every method excluding simple getters and setters, every branches inside a method, test with boundary values, etc)
    Have happy cases (at a minimum), and failure cases when a failure can happen
    You will need to rely on a helper method to test the printAveragePriceOfAllVehicles() method
    */

    @Test
    public void testAddVehicle(){
        Inventory testInventory = new Inventory();
        testInventory.add(new Car("Nissan", "GT-R",2021, 4, 113540, 16,false));
        testInventory.add(new Truck("Ford", "Bronco",1970, 4, 67600, 11,true, 3500));

        Assert.assertEquals("Didnt add cars to list", MainTest.vehicleArrayList.size(), 2);

    }

    @Test
    public void testRemoveVehicle(){

        //Car 1
        Car car1 = new Car("Toyota", "Supra Turbo",1994, 4, 139900, 17,false);
        MainTest.vehicleArrayList.add(car1);
        //Truck 1 being removed
        Truck truck1 = new Truck("Toyota", "Tacoma",2022 , 2, 27150 , 20,true,6800);
        MainTest.vehicleArrayList.add(truck1);

        Inventory testInventory = new Inventory();
        testInventory.remove(truck1);

        Assert.assertEquals("List of vehicles are wrong",MainTest.vehicleArrayList.size(), 1);


    }

    @Test
    public void testFindCheapestVehicle(){
        Inventory testInventory = new Inventory();
        testInventory.add(new Car("Nissan", "GT-R",2021, 4, 113540, 16,false));
        testInventory.add(new Truck("Ford", "Bronco",1970, 4, 67600, 11,true, 3500));

        System.out.println("_____CHEAPEST CAR_____");
        testInventory.findCheapestVehicle().printVehicle();

        Assert.assertEquals("Wrong vehicle", "_____CHEAPEST CAR_____\n" +
                "Vehicle\n" +
                "1970 Ford Bronco\n" +
                "Four or two wheel drive = 4\n" +
                "$67600.0\n" +
                "11 MPG\n" +
                "Side step or not = true\n" +
                "Tow Capacity = 3500", "_____CHEAPEST CAR_____\n" +
                "Vehicle\n" +
                "1970 Ford Bronco\n" +
                "Four or two wheel drive = 4\n" +
                "$67600.0\n" +
                "11 MPG\n" +
                "Side step or not = true\n" +
                "Tow Capacity = 3500");

    }

    @Test
    public void testFindMostExpensiveVehicle(){
        Inventory testInventory = new Inventory();
        testInventory.add(new Car("Nissan", "GT-R",2021, 4, 113540, 16,false));
        testInventory.add(new Truck("Ford", "Bronco",1970, 4, 67600, 11,true, 3500));

        System.out.println("_____MOST EXPENSIVE CAR_____");
        testInventory.findMostExpensiveVehicle().printVehicle();

        Assert.assertEquals("Wrong vehicle", "_____MOST EXPENSIVE CAR_____\n" +
                "Vehicle\n" +
                "2021 Nissan GT-R\n" +
                "Four or two wheel drive = 4\n" +
                "$113540.0\n" +
                "16 MPG\n" +
                "Convertable or not = false", "_____MOST EXPENSIVE CAR_____\n" +
                "Vehicle\n" +
                "2021 Nissan GT-R\n" +
                "Four or two wheel drive = 4\n" +
                "$113540.0\n" +
                "16 MPG\n" +
                "Convertable or not = false");

    }

    @Test
    public void testPrintAveragePriceOfAllVehicles(){
        Inventory testInventory = new Inventory();
        testInventory.add(new Car("Nissan", "GT-R",2021, 4, 113540, 16,false));
        testInventory.add(new Truck("Ford", "Bronco",1970, 4, 67600, 11,true, 3500));

        testInventory.printAveragePriceOfAllVehicles();

        Assert.assertEquals("Wrong average price of all of vehicles","Average price of all vehicles:" +
                "$" + 90570,"Average price of all vehicles:" +
                "$" + 90570);

    }

    @Test
    public void testPrintVehicle(){
        //Car 1
        Car car1 = new Car("Toyota", "Supra Turbo",1994, 4, 139900, 17,false);
        MainTest.vehicleArrayList.add(car1);

        //Truck 1
        Truck truck1 = new Truck("Toyota", "Tacoma",2022 , 2, 27150 , 20,true,6800);
        MainTest.vehicleArrayList.add(truck1);

        //cycles through list and prints out each vehicle
        for (Vehicle element: MainTest.vehicleArrayList) {
            element.printVehicle();
        }

        Assert.assertEquals("Wrong list of vehicles", "Vehicle\n" +
                "1994 Toyota Supra Turbo\n" +
                "Four or two wheel drive = 4\n" +
                "$139900.0\n" +
                "17 MPG\n" +
                "Convertable or not = false\n" +
                "\n" +
                "Vehicle\n" +
                "2022 Toyota Tacoma\n" +
                "Four or two wheel drive = 2\n" +
                "$27150.0\n" +
                "20 MPG\n" +
                "Side step or not = true\n" +
                "Tow Capacity = 6800", "Vehicle\n" +
                "1994 Toyota Supra Turbo\n" +
                "Four or two wheel drive = 4\n" +
                "$139900.0\n" +
                "17 MPG\n" +
                "Convertable or not = false\n" +
                "\n" +
                "Vehicle\n" +
                "2022 Toyota Tacoma\n" +
                "Four or two wheel drive = 2\n" +
                "$27150.0\n" +
                "20 MPG\n" +
                "Side step or not = true\n" +
                "Tow Capacity = 6800");

    }

}
