package class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchingTheBrowser {
    public static void main(String[] args) throws InterruptedException {

        // Tell your project where the webdriver is located.
        // Mac user should not use .exe with chromedriver.
        System.setProperty("webdriver.chrome.driver" , "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // Open the website facebook.com
        driver.get("https://www.facebook.com/");

        // Get the current URL that is there in the browser
        String URL = driver.getCurrentUrl(); // We just declared the driver.getcurrenturl() int a variable URL
        // Print out the URL
        System.out.println(URL);
        System.out.println(driver.getCurrentUrl());

        // Get the title of the webpage
        String title = driver.getTitle();
        // Print the title of the page
        System.out.println("The title of the page is : "+title);

        // Give the 3 second process time to the browser and then closes.
        Thread.sleep(2000);

        // close the whole browser no matter how many tabs are open in the browser.
        driver.quit();

    }
}