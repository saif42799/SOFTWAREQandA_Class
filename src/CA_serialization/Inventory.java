package CA_serialization;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Inventory implements Serializable {

    //attributes
    private static final long serialVersionUID = -849874494987651720L;
    private List<Vehicle> inventoryList = new ArrayList<Vehicle>();

    //constructor
    public Inventory() {

    }

    //getters and setters
    public List<Vehicle> getInventoryList() {
        return inventoryList;
    }

    public void setInventoryList(List<Vehicle> inventoryList) {
        this.inventoryList = inventoryList;
    }

    //add method
    public void add(Vehicle addVehicle){
        inventoryList.add(addVehicle);
    }

}
