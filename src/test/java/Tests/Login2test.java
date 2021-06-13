package Tests;

import Base.BaseTest;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Login2test extends BaseTest {

    @Test

    public void Login2(){
        //test will validate correct email address and incorrect password will not be accepted and user will be prompted
        WebElement AcceptCookies = driver.findElement(By.cssSelector("#onetrust-accept-btn-handler"));
        AcceptCookies.click();
        WebElement InsertEmail = driver.findElement(By.id("ul-email"));
        InsertEmail.sendKeys("andinrsk@gmail.com");
        WebElement InsertPass = driver.findElement(By.id("ul-password"));
        InsertPass.sendKeys("TestNetguru1");
        WebElement Login = driver.findElement(By.id("ul-login"));
        Login.click();

    }
}
