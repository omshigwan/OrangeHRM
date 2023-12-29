import org.testng.Assert;
import org.testng.annotations.Test;

public class Test1LoginTest extends BaseTest{

    @Test
    public void validLoginTest(){
        new LoginPage(driver).performLogin("Admin","admin123");
        Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"));
    }

    @Test
    public void invalidLoginTest(){
        new LoginPage(driver).performLogin("user","password");
        Assert.assertTrue(driver.findElement(LoginPage.error()).isDisplayed());
    }

}
