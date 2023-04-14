package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingElements{

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver" , "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com/");

        Thread.sleep(2000);

        // Send in the username
        driver.findElement(By.id("email")).sendKeys("dendanadan@gmail.com");

        Thread.sleep(2000);
        // send the password
        driver.findElement(By.name("pass")).sendKeys("HeraPhere2");

        Thread.sleep(2000);
        //click on the "Create New Account" button
        driver.findElement(By.linkText("Create new account")).click();

        Thread.sleep(2000);
        // Click on forgotten password
        driver.findElement(By.partialLinkText("password")).click();

        driver.quit();


    }
}
