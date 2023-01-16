package CA_serialization;

import java.io.Serializable;

public class Vehicle implements Serializable {

    private String makeModel;
    private int year;
    private double reatilPrice;
    private boolean is4WD;
    private static final long serialVersionUID = -3137544449731066653L;

    public Vehicle(String makeModel, int year, double reatilPrice, boolean is4WD) {
        this.makeModel = makeModel;
        this.year = year;
        this.reatilPrice = reatilPrice;
        this.is4WD = is4WD;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getReatilPrice() {
        return reatilPrice;
    }

    public void setReatilPrice(double reatilPrice) {
        this.reatilPrice = reatilPrice;
    }

    public boolean isIs4WD() {
        return is4WD;
    }

    public void setIs4WD(boolean is4WD) {
        this.is4WD = is4WD;
    }


    public void printVehicle() {
        System.out.println(
                "Vehicle{" +
                        "makeModel='" + makeModel + '\'' +
                        ", year=" + year +
                        ", reatilPrice=" + reatilPrice +
                        ", is4WD=" + is4WD +
                        '}' );

    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "makeModel='" + makeModel + '\'' +
                ", year=" + year +
                ", reatilPrice=" + reatilPrice +
                ", is4WD=" + is4WD +
                '}';
    }
}
