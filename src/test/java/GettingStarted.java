import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;
/**
 * Created by Dmitry on 13.03.2017.
 */
public class GettingStarted extends BaseTest {
    @Test
    public void testGoogleSearch() throws Exception {
        // Optional, if not specified, WebDriver will search your path for chromedriver.
//        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");

//        WebDriver driver = new ChromeDriver();
        System.out.println("Test");
        driver.get("http://www.google.com/xhtml");
        Thread.sleep(5000);  // Let the user actually see something!
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("ChromeDriver");
        searchBox.submit();
        Thread.sleep(5000);  // Let the user actually see something!
        assertFalse(driver.getTitle().contains("ololo"));
        assertTrue(driver.getTitle().contains("Google"));

    }


}
