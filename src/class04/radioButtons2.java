package class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class radioButtons2 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://practice.syntaxtechs.net/basic-radiobutton-demo.php");

//        find all the age group radio buttons
//        the xpath here is common to all the webElements that have age group
        List<WebElement> radioButtons = driver.findElements(By.xpath("//input[@name='ageGroup']"));

//        iterate over the list to see your desired one
        for(WebElement radioButton : radioButtons){
            String age = radioButton.getAttribute("value");
//            if the value of the WebElment is 0-5 click on it
            if(age.equalsIgnoreCase("0 - 5")){ // With changing the value button will change.
                radioButton.click();
            }
        }




    }
}
