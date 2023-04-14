package class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TablesDemo {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

//    Task : goto syntax HRMS application and login and goto the pim option

        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");

        //fill out username
        driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("admin");

        //fill out password
        driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("Hum@nhrm123");

        //press the Login button
        driver.findElement(By.xpath("//input[@name='Submit']")).click();

        Thread.sleep(2000);

        //find the PIM button
        WebElement pimBtn = driver.findElement(By.xpath("//b[text()='PIM']"));

        //click on it
        pimBtn.click();

        Thread.sleep(2000);

        //find the Employee List
        WebElement employeeListBtn = driver.findElement(By.xpath("//a[text()='Employee List']"));

        //click on it
        employeeListBtn.click();

        Thread.sleep(2000);

//        get the employee id 52396A and click on the checkbox associated with it
//in order to find the desired id
        boolean idfound=true;
        while(idfound) {
//        as DOM is refresehed after the click on next page and all previous elemenets found are discarded so we find elements in the loop
            List<WebElement> ids = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr/td[2]"));
            for (int i = 0; i < ids.size(); i++) {
                String id = ids.get(i).getText();

                if (id.equalsIgnoreCase("52289A")) {

                    System.out.println("id is on the row " + i);
//                to click on the particular checkbox
                    WebElement checkBox = driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr[" + (i + 1) + "]/td[1]"));
                    checkBox.click();
                    idfound=!true; // !true = false
                    break;
                }
            }
        Thread.sleep(2000);

//        click on the next page : If not found on first page it will click on the next page until it finds it, on upcoming pages.
            if(idfound) {
                WebElement nextBtn = driver.findElement(By.xpath("//a[text()='Next']"));
                nextBtn.click();
            }
        }

    }
}
