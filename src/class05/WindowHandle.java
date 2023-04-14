package class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowHandle {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver" , "Driver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://accounts.google.com/InteractiveLogin/signinchooser?continue=https%3A%2F%2Fmail." +
                "google.com%2Fmail%2Fu%2F0%2F&emr=1&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2" +
                "F&osid=1&passive=1209600&service=mail&ifkv=AWnogHeUxT9FTbSQAcvInHefBlWY_YO5at3ToVHjnIsXKV" +
                "1g1Xu0lILpu-lS49zJCpkOZubgK9VRxA&flowName=GlifWebSignIn&flowEntry=ServiceLogin");

        // Click on help button on facebook page opened from the link above
        driver.findElement(By.xpath("//a[text()='Help']")).click();

        // Click on the privacy button on facebook page opened from the link above
        driver.findElement(By.xpath("//a[text()='Privacy']")).click();

        // Get the window handle of the parent window wherein the focus of the driver is, Window handle is unique every time we run the code.
         String parentWindowHandle = driver.getWindowHandle();
        System.out.println(parentWindowHandle);

        // Get window handles of all the windows that have been opened up
        Set<String> windowHandles = driver.getWindowHandles(); // Window handles will always be a set of Strings when it is more than 1
        System.out.println(windowHandles);

        for (String wh : windowHandles){
            // switch the focus of the driver to help window
            driver.switchTo().window(wh);
            // check the title of the window to which our focus is right now.
            String title = driver.getTitle();
            if (title.equalsIgnoreCase("Google Account Help")){ // to find title inspect CTRL+F and write //title.
                break;
            }

        }
        // To verify that we have switched to the right window,
        System.out.println(driver.getTitle());

        // Switched the focus back to the Gmail page which is the parent page whom handle we found above so reusing them.
        driver.switchTo().window(parentWindowHandle);

        // Verify that we have switched to the parent page which is Gmail page.
        System.out.println(driver.getTitle());
    }
}
