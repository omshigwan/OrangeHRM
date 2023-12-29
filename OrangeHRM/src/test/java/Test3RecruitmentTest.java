import org.testng.Assert;
import org.testng.annotations.Test;

public class Test3RecruitmentTest extends BaseTest{

    @Test
    public void clickRecruitment(){
        new LoginPage(driver).performLogin("Admin","admin123")
                .clickRecruitmentButton().clickAdd();
        Assert.assertTrue(driver.getCurrentUrl().contains("addCandidate"));
    }
}
