import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {
    WebDriver driver;

    public DashboardPage(WebDriver driver) {
        this.driver = driver;
    }

    By recruitmentButton = By.xpath("//span[text()='Recruitment']");

    public RecruitmentPage clickRecruitmentButton(){

        driver.findElement(recruitmentButton).click();
        return new RecruitmentPage(driver);
    }


}