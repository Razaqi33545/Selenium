package class05;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationAlert {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver" , "Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://practice.syntaxtechs.net/javascript-alert-box-demo.php");

        // Click on the button for simple prompt alert
        driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']")).click();

        // Use switch to so you shift the focus of the webdriver to alert
        Alert alert = driver.switchTo().alert();

        Thread.sleep(2000);

        // As the alert did not have the cancle button we cannot cancle it and have to accept
        alert.accept();

        // Click on the prompt alert button
        driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']")).click();

        // As we have already switched the focus in alert above we can reuse it.
        alert.sendKeys("abracadabra");

        // accept it
        alert.accept();

    }
}
