package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebOrderTask {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver" , "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");

        //Maximize the window
        driver.manage().window().maximize();

        Thread.sleep(2000);

        // Send the username
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");

        Thread.sleep(2000);

        // Send the password
        driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("test");

        Thread.sleep(2000);

        // Click on the login button
        driver.findElement(By.className("button")).click();

    }
}
