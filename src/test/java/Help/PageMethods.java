package Help;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class PageMethods {
    public WebDriver driver;

    public PageMethods(WebDriver driver) {this.driver=driver;}

    public void ValidateTitlePage (String ExpectedValue){
        String ActualWebPGTitle = driver.getTitle();
        Assert.assertEquals("Invalid title name", ExpectedValue, ActualWebPGTitle);

    }
}
