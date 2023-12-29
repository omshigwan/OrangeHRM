import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test5SearchTest extends BaseTest{

    @Test
    public void SearchCandidate(){
        new LoginPage(driver)
                .performLogin("Admin","admin123")
                .clickRecruitmentButton().clickAdd()
                .EnterCandidateDetails("Om","Om",
                        "Om","Om@gmail.com","1234567890").searchCandidate();
        Assert.assertTrue(driver.findElement
                (By.xpath("//span[text()=\"(1) Record Found\"]"))
                .isDisplayed());

        // This Test fails as there is bug in the site
        // when we enter expected candidate name and press search button
        // site shows that it is invalid

    }
}