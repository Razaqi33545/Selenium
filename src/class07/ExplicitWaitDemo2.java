package class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitDemo2 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");

        //Click on the alert button
        driver.findElement(By.xpath("//button[@id='alert']")).click();

        // Wait until the alert is present, so this type of wait is explicit wait when you wait until something appears.
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();


    }
}
