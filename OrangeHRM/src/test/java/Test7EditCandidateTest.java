import org.testng.annotations.Test;

public class Test7EditCandidateTest extends BaseTest {

    @Test
    public void editCandidateDetails(){
        new LoginPage(driver)
                .performLogin("Admin","admin123")
                .clickRecruitmentButton().clickEyeButton().editCandidate();
        // here after the page remains same
        //only the color of edit button changes to grey from orange
        // will figure out how to assert css button

    }
}