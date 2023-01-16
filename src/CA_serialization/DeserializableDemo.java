package CA_serialization;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.SerializationUtils;

import java.io.*;

/**Class: DeserializableDemo.java
 * @author Saif Shaikh
 * @version 1.0
 * Course : ITEC 4260
 * Fall 2022
 * Written: November 10, 2022
 * Description: Takes in file and deserializes in and write it to output1.txt
 *
 */

public class DeserializableDemo {
    public static void main(String[] args) throws IOException {

        File file = FileUtils.getFile("src/CA_serialization/employee.ser");

        byte[] dataToDeserialize = null;

        try {

            dataToDeserialize = FileUtils.readFileToByteArray(file);

        }catch (IOException e ){
            e.printStackTrace();
        }

        Employee deserializedInv = SerializationUtils.deserialize(dataToDeserialize);
        FileWriter myWriter = new FileWriter("src/CA_serialization/output1.txt");

        deserializedInv.mailCheck();

        myWriter.write(deserializedInv.toString());

        myWriter.close();

    }
}


