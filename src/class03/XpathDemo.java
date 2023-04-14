package class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver" , "Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2fTestComplete11%2fWebOrders%2fDefault.aspx");

        driver.manage().window().maximize();

        // Declare the username ==> as the return data is web element we use WebElement as datatype
       WebElement username = driver.findElement(By.xpath("//input[contains(@name,'username')]"));
        username.sendKeys("Tester");

        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("test");

        Thread.sleep(2000);

        // Clear the username text box using method clear()
        username.clear();

        Thread.sleep(2000);

        // Get the text username next to the username text box on the console
        WebElement usernameText = driver.findElement(By.xpath("//label[text()='Username:']"));
        System.out.println(usernameText.getText());

        Thread.sleep(2000);

        // get the text password which is beside the password text box
        WebElement passwordText = driver.findElement(By.xpath("//label[text()='Password:']"));
        String pasText = passwordText.getText();
        System.out.println(pasText);

    }
}
