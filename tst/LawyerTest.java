import CA1_JUnit.Lawyer;
import org.junit.Assert;
import org.junit.Test;

public class LawyerTest {

    @Test
    public void testVacationDays(){
        Lawyer bob = new Lawyer("Bob");
        int VacDays = bob.getVacationdays();
        Assert.assertEquals("Wrong number of vacay days", 1, VacDays);
    }

    @Test
    public void calculateMaximumMonthlyWage(){
        Lawyer bob = new Lawyer("Bob");
        double JulyDays = bob.calculateMonthlyWage(160, 90);
        Assert.assertEquals("Max monthly wage must be 5000", 5000, JulyDays, 0);
    }

    @Test
    public void calculateMinimunMonthlyWage(){
        Lawyer bob = new Lawyer("Bob");
        double JulyDays = bob.calculateMonthlyWage(159,0);
        Assert.assertEquals("Wrong number of vacay days", 2259.5, JulyDays, 0);
    }

    @Test
    public void calculateRegularMonthlyWage1(){
        Lawyer bob = new Lawyer("Bob");
        double JulyDays = bob.calculateMonthlyWage(0,0);
        Assert.assertEquals("Wrong number of vacay days", 0, JulyDays, 0);
    }

    @Test
    public void calculateRegularMonthlyWage2(){
        Lawyer bob = new Lawyer("Bob");
        double JulyDays = bob.calculateMonthlyWage(0,40);
        Assert.assertEquals("Wrong number of vacay days", 0, JulyDays, 0);
    }
}
