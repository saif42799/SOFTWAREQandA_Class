package CA1_JUnit;

public class EMployee {

    private String name;
    private int vacDays;


    public EMployee(String name){
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVacDays() {
        return vacDays;
    }

    public void setVacDays(int vacDays) {
        this.vacDays = vacDays;
    }
}
