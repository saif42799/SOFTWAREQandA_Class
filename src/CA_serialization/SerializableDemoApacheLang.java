package CA_serialization;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.SerializationUtils;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;

/**Class: SerializableDemoApacheLang.java
 * @author Saif Shaikh
 * @version 1.0
 * Course : ITEC 4260
 * Fall 2022
 * Written: November 10, 2022
 * Description: Create vehicle, write vehicle to file, returns message
 *
 */

public class SerializableDemoApacheLang {
    public static void main(String[] args) {

        Vehicle v1 = new Vehicle("Ford F150", 2015, 35000, false);
        Vehicle v2 = new Vehicle("Ford F250", 2015, 75000, false);
        Vehicle v3 = new Vehicle("Ford F350", 2015, 15000, false);

        Inventory inventory = new Inventory();
        inventory.add(v1);
        inventory.add(v2);
        inventory.add(v3);

        File file = FileUtils.getFile("src/CA_serialization/inventory.obj");
        byte[] data = SerializationUtils.serialize(inventory);

        try {
            FileUtils.writeByteArrayToFile(file, data);
            System.out.println("Serialized data is saved in src/CA_serialization/inventory.obj");

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
