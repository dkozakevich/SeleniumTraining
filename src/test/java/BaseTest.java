import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;


public class BaseTest {
    protected WebDriver driver;

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("before method");
    }

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("before suite");
    }

    @BeforeTest
    public void setUp(){
        System.out.println("before test");
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("before class");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("after class");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("after test");
        driver.quit();
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("after method");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("after suite");
    }


}
