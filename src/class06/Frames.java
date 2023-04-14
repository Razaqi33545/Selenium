package class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://www.uitestpractice.com/Students/Switchto");

        // Switch the focus of the driver to iframe which contains the input box
        // Method : By index
        driver.switchTo().frame(0); // This statement will shift the focus to the first frame.

        WebElement textbox = driver.findElement(By.xpath("//input[@id='name']"));
        textbox.sendKeys("abracadabra");

        // Switch the focus to the parent window which is the parent window
        driver.switchTo().defaultContent();

        // Get the text : click on the below link
        WebElement text = driver.findElement(By.xpath("//h3"));
        System.out.println("The text is : " + text.getText());

        // Get the text from iframe ; enter your name :
        // First we must switch the focus of the driver to iframe
        driver.switchTo().frame("iframe_a");
        WebElement getLabel = driver.findElement(By.xpath("//label"));
        System.out.println("The text is : " + getLabel.getText());

        // go back to main page or change focus of the driver to the main page.
        driver.switchTo().defaultContent();

        // Clear the text in the text box
        // First switch the focus to iframe and then clear the text
        WebElement frame1 = driver.findElement(By.xpath("//iframe[@name='iframe_a']"));
        driver.switchTo().frame(frame1);
        // Now clear the textbox which we have already found above
        textbox.clear();


    }
}