import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

/**Testing Class: helloGoogle
 * @author Saif Shaikh
 * @version 1.0
 * Course : Software Testing and QA Section 03
 * Fall 2022
 * Written: Oct 25, 2022
 * Description:
1. refer to the End to End Testing using Selenium (p.7) to setup
2. refer to p.8 to write a code to test Google Search
3. refer to (p.13) to confirm that title include "GGC" - find proper division. it's not navcnt
4. use the following URL to to the first form test https://tand.altervista.org/Activities/3-12.html
5. use the following URL to do the second form test  https://redx.altervista.org/Activities/3-22.html
6. find and click the "here" link

 */


public class helloGoogle {

    //first set web driver
    public static WebDriver driver;

    @BeforeClass public static void setUpChrome(){
        //Create a new WebDriver instance (use Chrome)
        //download ChromeDriver from // and put the path here
        System.setProperty("webdriver.chrome.driver","C:/Users/Saif4/Downloads/chromedriver_win32/chromedriver.exe");
        driver = new ChromeDriver();

    }


    @Test
    public void googleSearchExample() throws Exception {
        //opens up google page
        driver.get("http://www.google.com");

        //Finds text input element by its name
        WebElement element = driver.findElement(By.name("q"));

        //Searches for GGC
        element.clear();
        element.sendKeys("GGC");

        //Submits the form
        element.submit();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement nextPageElemement = driver.findElement(By.id("rcnt"));
        Assert.assertTrue("Expected GGC in title", driver.getTitle().contains("GGC"));

    }


    @Test
    public void classExampleTest() throws Exception{
        //gets altervista webpage
        driver.get("http://tand.altervista.org/Activities/3-12.html");

        //gets web element and types first name
        WebElement fname = driver.findElement(By.name("fname"));
        fname.clear();
        fname.sendKeys("Saif");
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

        //gets web element and types last name
        WebElement lname = driver.findElement(By.name("lname"));
        lname.clear();
        lname.sendKeys("Shaikh");
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

        //gets web element and types phone number
        WebElement phone = driver.findElement(By.name("phone"));
        phone.clear();
        phone.sendKeys("000-000-0000");
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

        //gets web element and types email
        WebElement email = driver.findElement(By.name("email"));
        email.clear();
        email.sendKeys("sshaikh4@ggc.edu");
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

        //gets web element and types comment
        WebElement comments = driver.findElement(By.name("comments"));
        comments.clear();
        comments.sendKeys("Hello World");
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

        //gets web element radio by xpath link and presses button
        driver.findElement(By.xpath("/html/body/form/input[2]")).click();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

        //finally press contact button
        driver.findElement(By.xpath("/html/body/form/input[4]")).click();

    }


    @Test
    public void testClassExampleTwo() throws Exception{
        //gets altervista webpage
        driver.get("http://redx.altervista.org/Activities/3-22.html");

        //gets web element and types studentId
        WebElement studentId = driver.findElement(By.name("studentId"));
        studentId.clear();
        studentId.sendKeys("900111222");
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

        //gets web element and types password
        WebElement password = driver.findElement(By.name("password"));
        password.clear();
        password.sendKeys("crazyPassword");
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

        //gets web element and types password again
        WebElement password2 = driver.findElement(By.name("password2"));
        password2.clear();
        password2.sendKeys("crazyPassword");
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

        //gets web element and types first name
        WebElement fname = driver.findElement(By.name("fname"));
        fname.clear();
        fname.sendKeys("Saif");
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

        //gets web element and types last name
        WebElement lname = driver.findElement(By.name("lname"));
        lname.clear();
        lname.sendKeys("Shaikh");
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

        //gets web element and types phone number
        WebElement phone = driver.findElement(By.name("phone"));
        phone.clear();
        phone.sendKeys("800-000-0000");
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

        //gets web element and types email
        WebElement email = driver.findElement(By.name("email"));
        email.clear();
        email.sendKeys("sshaikh4@ggc.edu");
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

        //gets web element and types city
        WebElement city = driver.findElement(By.name("city"));
        city.clear();
        city.sendKeys("Lawrenceville");
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

        //gets web element and types street name
        WebElement street = driver.findElement(By.name("street"));
        street.clear();
        street.sendKeys("Imaginary street");
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

        //gets web element and types State
        WebElement state = driver.findElement(By.name("state"));
        state.clear();
        state.sendKeys("GA");
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

        //gets web element and types zip code
        WebElement zip = driver.findElement(By.name("zip"));
        zip.clear();
        zip.sendKeys("80000");
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

        //gets web element and clicks level
        Select level = new Select(driver.findElement(By.id("level")));
        level.selectByIndex(4);
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

        //gets web element and clicks check box
        WebElement ownComputer = driver.findElement(By.name("ownComputer"));
        ownComputer.click();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

        //gets web element and clicks button
        driver.findElement(By.xpath("//*[@id=\"t3\"]")).click();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

        //gets web element and clicks check box
        WebElement browser = driver.findElement(By.name("firefox"));
        browser.click();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

        //gets web element and clicks level
        Select major = new Select(driver.findElement(By.id("major")));
        major.selectByIndex(2);
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

        //finally press contact button
        driver.findElement(By.xpath("/html/body/form/input[1]")).click();

        //click here button
        try{
            Thread.sleep(2000);
        } catch (InterruptedException ex){
            Thread.currentThread().interrupt();

            WebElement link = driver.findElement(By.linkText("here"));
            link.click();
        }
    }





}
