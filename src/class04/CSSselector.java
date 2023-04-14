package class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSselector {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver" , "Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.facebook.com/");

        // Click on the button Create account using CSS Selector

       WebElement CreateNewBtn = driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button']"));

        // Click on the button
        CreateNewBtn.click();

        Thread.sleep(2000); // Selenium is very quick and will not write the firstName in the cell unless we give it some time.

        // fill in the first Name
       WebElement firstName = driver.findElement(By.cssSelector("input[name='firstname']"));
       firstName.sendKeys("Tawheedullah");


    }
}
