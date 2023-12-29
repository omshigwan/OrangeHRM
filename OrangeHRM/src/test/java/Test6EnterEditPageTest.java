import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test6EnterEditPageTest extends BaseTest{

    @Test
    public void clickEyeButton(){
        new LoginPage(driver)
                .performLogin("Admin","admin123")
                .clickRecruitmentButton().clickEyeButton();

        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div[1]/form")).isDisplayed());
    }

}