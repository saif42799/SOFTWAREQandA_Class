package Assignment_2;

import com.beust.ah.A;
import org.checkerframework.checker.units.qual.C;

import java.util.ArrayList;

/**Class: MainTest.java
 * @author Saif Shaikh
 * @version 1.0
 * Course : ITEC 4260
 * Fall 2022
 * Written: November 10, 2022
 * Description: You are to write some basic classes in Java. You are to implement
 * Vehicle.java, Car.java, Truck.java and MainTest.java classes. Each Vehicle object
 * will represent information about a specific automobile that is for sale.
 *
 */

public class MainTest {

    //arraylist for vehicles
    //Inventory reaches into this list
    public static ArrayList<Vehicle> vehicleArrayList = new ArrayList<Vehicle>();

    public static void main(String[] args) {



        //Car 1
        Car car1 = new Car("Toyota", "Supra Turbo",1994, 4, 139900, 17,false);
        vehicleArrayList.add(car1);

        //Car 2
        Car car2 = new Car("Toyota", "Supra Turbo",2022, 4, 43540, 25,true);
        vehicleArrayList.add(car2);

        //Car 3
        Car car3 = new Car("Lexus", "IS 350",2020, 4, 40673, 20,false);
        vehicleArrayList.add(car3);

        //Truck 1
        Truck truck1 = new Truck("Toyota", "Tacoma",2022 , 2, 27150 , 20,true,6800);
        vehicleArrayList.add(truck1);

        //Truck 2
        Truck truck2 = new Truck("Chevrolet", "Silverado 1500",2022, 4, 34600, 23,true,11000);
        vehicleArrayList.add(truck2);

        //Truck 3
        Truck truck3 = new Truck("Ford", "MAVERICK",2022, 4, 20995, 17,false,4000);
        vehicleArrayList.add(truck3);



        Inventory inventory = new Inventory();
        //adds car to vehicleArrayList
        inventory.add(new Car("Nissan", "GT-R",2021, 4, 113540, 16,false));
        inventory.add(new Truck("Ford", "Bronco",1970, 4, 67600, 11,true, 3500));

        inventory.remove(truck3);




        //cycles through list and prints out each vehicle
        for (Vehicle element: vehicleArrayList) {
            element.printVehicle();
        }

        System.out.println("_____CHEAPEST CAR_____");
        inventory.findCheapestVehicle().printVehicle();

        System.out.println("_____MOST EXPENSIVE CAR_____");
        inventory.findMostExpensiveVehicle().printVehicle();

        inventory.printAveragePriceOfAllVehicles();

    }
}
