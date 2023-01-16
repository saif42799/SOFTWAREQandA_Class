package CA_serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**Class: SerializableDemo.java
 * @author Saif Shaikh
 * @version 1.0
 * Course : ITEC 4260
 * Fall 2022
 * Written: November 10, 2022
 * Description: Create employee, write employee to file, returns message
 *
 */

public class SerializableDemo {
    public static void main(String[] args) {

        Employee e = new Employee();
        e.name = "Reyan Ali";
        e.address = "Phokka Kuan, Ambehta Peer";
        e.SSN = 11122333;
        e.number = 101;

        try {
            FileOutputStream fileOut = new FileOutputStream("src/CA_serialization/employee.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(e);
            out.close();
            fileOut.close();
            System.out.println("Serialized data is saved in src/CA_serialization/employee.ser");

        }catch (IOException i){
            i.printStackTrace();
        }

    }
}
