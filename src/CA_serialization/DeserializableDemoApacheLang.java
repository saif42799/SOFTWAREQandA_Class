package CA_serialization;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.SerializationUtils;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**Class: DeserializableDemo.java
 * @author Saif Shaikh
 * @version 1.0
 * Course : ITEC 4260
 * Fall 2022
 * Written: November 10, 2022
 * Description: Takes in file and deserializes in and write it to output2.txt
 *
 */

public class DeserializableDemoApacheLang {
    public static void main(String[] args) throws Exception {

        File file = FileUtils.getFile("src/CA_serialization/inventory.obj");
        byte[] dataToDeserialize = null;

        try {

            dataToDeserialize = FileUtils.readFileToByteArray(file);

        }catch (IOException e ){
            e.printStackTrace();
        }

        Inventory deserializedInv = SerializationUtils.deserialize(dataToDeserialize);
        FileWriter myWriter = new FileWriter("src/CA_serialization/output2.txt");

        for (Vehicle v : deserializedInv.getInventoryList()){
            v.printVehicle();
            myWriter.write(v.toString());
        }

        myWriter.close();

    }
}
