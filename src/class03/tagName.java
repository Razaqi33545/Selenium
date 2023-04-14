package class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class tagName {

    /*
    In order to use this locator U jsut five the tagName.
    It is very helpful in scenarios where u want to get multiple elements with the same tag name.
     */
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver" , "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.amazon.com/");

        /*
        get all the links which are in tag <a> which is also called anchor tag
        lets use the locator By.tagName for this purpose
        */

       List <WebElement> tags = driver.findElements(By.tagName("a")); // The tag a has the links in it.
        for(WebElement tag : tags){
          String link = tag.getAttribute("href"); // All the links are inside the href attribute in tag a
            System.out.println(link);
        }







    }
}
