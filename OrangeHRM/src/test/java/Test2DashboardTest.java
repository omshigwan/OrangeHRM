import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test2DashboardTest extends BaseTest {

    @Test
    public void clickRecruitment(){
        new LoginPage(driver).performLogin("Admin","admin123").clickRecruitmentButton();
        Assert.assertTrue(driver.findElement(By.xpath("//h6[text()=\"Recruitment\"]")).isDisplayed());
    }
}