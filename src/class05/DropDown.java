package class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver" , "Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://practice.syntaxtechs.net/basic-select-dropdown-demo.php");

        // To use select class of Java we must have select tagname in the html code
        // locate the webelement
       WebElement dropdown = driver.findElement(By.xpath("//select[@id='select-demo']"));


       // Declare an object of select class to use select class
        Select sel = new Select(dropdown);

        // Using select class we have diffrent methods to select the desired option.
        // Select by index
        sel.selectByIndex(2);

        Thread.sleep(2000);

        // Select by value
        sel.selectByValue("Tuesday");

        Thread.sleep(2000);

        // Select by visible text
        sel.selectByVisibleText("Friday");





    }
}
