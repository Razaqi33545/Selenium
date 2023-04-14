package class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {
    public static void main(String[] args) throws InterruptedException {

        // Connnect to webDriver
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        // Initiate the instance of webdriver
        WebDriver driver = new ChromeDriver();

        // Open Google.com
        driver.get("https://www.google.com/");

        Thread.sleep(2000);

        // now navigate to facebook.com
        driver.navigate().to("https://www.facebook.com/");

        // Give three seconds wait time to process
        Thread.sleep(2000);

        // Go back to Google
        driver.navigate().back();

        Thread.sleep(2000);

        // Go back to facebook
        driver.navigate().forward();

        Thread.sleep(2000);

        // Refresh the page
        driver.navigate().refresh();

        // Will close the currently tab only not the whole browser
        driver.close();
    }
}
