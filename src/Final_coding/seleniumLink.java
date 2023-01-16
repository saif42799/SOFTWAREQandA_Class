package Final_coding;

import com.sun.deploy.cache.BaseLocalApplicationProperties;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.List;

public class seleniumLink {

//2. Write a test case using Selenium to grab all hyperlinks on the page
// "https://final.com" and verify that there are less than one hundred
// links on that page. As a debug message, you must also print out
// (using System.out.println() ) all the links in the test.


    public static WebDriver driver;

    @BeforeClass
    public static void setUpChrome(){
        //Create a new WebDriver instance (use Chrome)
        //download ChromeDriver from // and put the path here
        System.setProperty("webdriver.chrome.driver","C:/Users/Saif4/Downloads/chromedriver_win32/chromedriver.exe");
        driver = new ChromeDriver();

    }

    @Test
    public void testLinkCount() {
        // driver has been defined in the setup() method
//        BaseLocalApplicationProperties driver;
        driver.get("https://final.com");
        // your code goes here

        String link = "";

        List<WebElement> linksOnPage = driver.findElements(By.tagName("a"));

        if(linksOnPage.size() > 100) {
            System.out.println("Links on the page are greater than 100");
        }else {
            System.out.println("Links on the the page less than 100");
        }

        Iterator<WebElement> iterator = linksOnPage.iterator();
        while (iterator.hasNext()) {

            link = iterator.next().getText();
            System.out.println(link);

        }

        driver.quit();

    }

}
