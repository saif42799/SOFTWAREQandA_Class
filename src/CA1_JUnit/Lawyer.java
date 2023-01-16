package CA1_JUnit;

public class Lawyer extends EMployee{

    private final double HOURLY_WAGE = 20.5;
    private final int MAXIMUM_HOURS_ALLOWED = 250;
    private final int MINIMUM_HOURS_REQUIRED = 160;
    private final int PENALTY = 1000;
    private final int MAX_MONTHLY_WAGE = 5000;


    public Lawyer(String name) {
        super(name);
    }

    public int getVacationdays() {
        return 1;
    }

    public double calculateMonthlyWage(int hours, int overtime){
        if (hours + overtime >= MAXIMUM_HOURS_ALLOWED){
            return MAX_MONTHLY_WAGE;

        }
//        else if (hours <= MINIMUM_HOURS_REQUIRED && overtime == 0){
//            return (hours + HOURLY_WAGE) - PENALTY;
//
//        }
        else if (hours > 0 && overtime == 0){
            return (hours * HOURLY_WAGE) - PENALTY;

        }
        else if (hours == 0){
            return 0;

        }
        else{
            return (hours + overtime) * HOURLY_WAGE;
        }
    }

    public void doLegalStuff(){
        return;
    }


}
