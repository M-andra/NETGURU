package Tests;

import Base.BaseTest;
import Help.PageMethods;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidatePage extends BaseTest {


    private Object pageMethods;

    public ValidatePage(){

    }
    @Test
    public void Validate() {

        //Login | Merriam-Webster
        pageMethods = new PageMethods(driver);
        System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.merriam-webster.com/login");
        driver.manage().window().maximize();

    }
}
