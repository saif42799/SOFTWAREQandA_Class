package Final_coding;

import CA_serialization.Vehicle;
import com.sun.xml.internal.ws.developer.Serialization;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.SerializationUtils;
import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

public class Seeral_Deserial {
    public static void main(String[] args) throws IOException {
        Vehicle v1 = new Vehicle("Ford F150", 2015, 35000, false);
        serializeObj(v1);
    }


    public static void serializeObj(Vehicle myVehicle) throws IOException{
        File file = FileUtils.getFile("src/Final_coding/inventory3.obj");
        byte[] data = SerializationUtils.serialize(myVehicle);
        FileUtils.writeByteArrayToFile(file, data);

    }

    public String deserializeObj() throws IOException {
        File file = FileUtils.getFile("src/Final_coding/inventory3.obj");
        byte[] dataToDeserialize = FileUtils.readFileToByteArray(file);
        String deserializedObj = SerializationUtils.deserialize(dataToDeserialize);
        return deserializedObj;
    }

    //Describe what it means to serialize and deserialize. Then describe what the above 2 methods are doing.
    //
    //How would you test the two methods? Write JUnit test cases for the methods and explain your testing
    // methodology.

 //------------------------------------------------------------------------------------------------------
    //serialize = is when it is turned into a stream of bytes for storage or transmission to a file,
    // database, or memory.

    //deserialize = is the process of creating an initialized object from a serialize file
    //or object from a string or a series of bytes.
//------
    //serializeObj = gets the file inventory.obj and turns myVehicle it into a stream of bytes and
    // writes it to the file

    //deserializeObj = gets the file inventory.obj and read the serialize file and return
    // the deserialize file to make it readable

    @Test
    public void testSerializeObj() throws IOException {
        Vehicle v1 = new Vehicle("Ford F150", 2015, 35000, false);
        serializeObj(v1);
        Assert.assertEquals("Wrong vehicle", v1,"Whatever the file output is goes here");
    }
    @Test
    public void testDeserializeObj() throws IOException {
        Vehicle v1 = new Vehicle("Ford F150", 2015, 35000, false);
        deserializeObj();
        Assert.assertEquals("Wrong vehicle", v1,"Whatever the file output is goes here");
    }

    //used Junit testing methodology and used asserEqual to verify if test pasted



}
