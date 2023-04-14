package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebOrderTask2{
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver" , "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");

        //Maximize the window
        driver.manage().window().maximize();

        // Enter User name
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");

        Thread.sleep(1000);

        // Enter password
        driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("test");

        Thread.sleep(1000);

        // click on login button
        driver.findElement(By.className("button")).click();

        Thread.sleep(1000);

        // Verify that the title is "Web Orders"
        String title = driver.getTitle();
        if (title.equalsIgnoreCase("web orders")){
            System.out.println("the title is correct");
        }
        else {
            System.out.println("the title is incorrect");
        }

        Thread.sleep(2000);

        //logout
        driver.findElement(By.linkText("Logout")).click();

        Thread.sleep(1000);

        // close the browser
        driver.quit();
    }
}