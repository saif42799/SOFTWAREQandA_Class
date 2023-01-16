package CA_serialization;

public class Employee implements java.io.Serializable{
    public String name;
    public String address;
    public transient int SSN;
    public int number;
    private static final long serialVersionUID = -8518386347282233289L;


    public void mailCheck(){
        System.out.println("Mailing a check to " + name + " " + address);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", SSN=" + SSN +
                ", number=" + number +
                '}';
    }
}
