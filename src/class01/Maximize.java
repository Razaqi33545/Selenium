package class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Maximize {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");

        Thread.sleep(2000);

        // Maximize the window
        driver.manage().window().maximize();

        Thread.sleep(2000);

        // Open to full Screen
        driver.manage().window().fullscreen();
    }
}
