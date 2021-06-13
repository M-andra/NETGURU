package Base;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseTest {
    public WebDriver driver;

    public BaseTest(){

    }
    @Before
    public void Setup(){
    System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
    ChromeOptions ops = new ChromeOptions();
        ops.addArguments("--disable-notifications");
        driver = new ChromeDriver(ops);
        driver.get("https://www.merriam-webster.com/login");
        driver.manage().window().maximize();
    }
}
