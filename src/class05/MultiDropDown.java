package class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiDropDown {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver" , "Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://practice.syntaxtechs.net/basic-select-dropdown-demo.php");

        // Get the drop down
         WebElement DD = driver.findElement(By.xpath("//select[@id='multi-select']"));

        // Use the select class
        Select sel = new Select(DD);

        // select by value
        sel.selectByValue("New Jersey");

        Thread.sleep(2000);

        sel.selectByIndex(7);

        Thread.sleep(2000);

        // Select by VisibleText
        sel.selectByVisibleText("Ohio");

        Thread.sleep(2000);

        // When it comes to mulit-select drop down we can also de-select
        sel.deselectByValue("New Jersey");

        Thread.sleep(2000);

        sel.deselectByVisibleText("Ohio");

        sel.deselectByIndex(7);

        // Check wheter the drop down is multi-drop down or single drop down
        System.out.println("Drop Down is Multi-Select : " + sel.isMultiple());







    }
}
