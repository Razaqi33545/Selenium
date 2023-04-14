package class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioBtns {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://practice.syntaxtechs.net/basic-radiobutton-demo.php");

        //        click on the radio button Male
        WebElement maleButton = driver.findElement(By.cssSelector("input[value='Male']"));
        maleButton.click();

//        check if the radio button is enabled
        boolean isEnabledMale = maleButton.isEnabled();
        System.out.println("the radio button male is enabled : "+isEnabledMale);

//        check if the radio button is Displayed
        boolean isDisplayedMale = maleButton.isDisplayed();
        System.out.println("the radio button male is displayed : "+isDisplayedMale);

//        check if the radio button is Selected
        boolean isSelectedmale = maleButton.isSelected();
        System.out.println("the radio button male is selected : "+isSelectedmale);

//      if the radio button is not selected click on it
        if(!isSelectedmale) {
            maleButton.click();
        }
//        check if the radio button is selected after the click
        isSelectedmale=maleButton.isSelected();
        System.out.println("the status of selection is : "+ isSelectedmale);




    }
}