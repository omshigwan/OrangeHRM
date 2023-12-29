import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test4AddCandidateTest extends BaseTest {

    @Test
    public void candidateSavedSuccessfully(){
        new LoginPage(driver)
                .performLogin("Admin","admin123")
                .clickRecruitmentButton().clickAdd()
                .EnterCandidateDetails("Om","Om", "Om","om@gmail.com","1234567890");
        Assert.assertTrue(driver.findElement(By.xpath("//h6[text()=\"Application Stage\"]")).isDisplayed());

    }

}