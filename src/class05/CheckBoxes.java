package class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckBoxes {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver" , "Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://practice.syntaxtechs.net/basic-checkbox-demo.php");

        //Get all the Checkboxes
        List <WebElement> checkboxes = driver.findElements(By.xpath("//input[@class='cb1-element']"));

        // Iterate through the list With for each loop
        for (WebElement checkbox : checkboxes) {
            String value = checkbox.getAttribute("value");
            if (value.equalsIgnoreCase("Option-2")){
                    checkbox.click();
            }
        }


        /*


        // Iterate thourgh the list of checkboxes  With simple for loop
        for (int i = 0; i < checkboxes.size(); i++){
           String value = checkboxes.get(i).getAttribute("value");
            // check if this is the desired checkbox, if yes click it, if not iterate
            if (value.equalsIgnoreCase("Option-2")){
                checkboxes.get(i).click();
            }
        }
            */





    }
}