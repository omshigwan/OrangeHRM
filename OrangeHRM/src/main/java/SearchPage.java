import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPage {

    WebDriver driver;

    public SearchPage(WebDriver driver) {
        this.driver = driver;
    }

    public void searchCandidate(){
        By recruitmentButton = By.xpath("//span[text()='Recruitment']");
        driver.findElement(recruitmentButton).click();

        By EnterCandidateName = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/div/div[1]/div/div[2]/div/div/input");
        driver.findElement(EnterCandidateName).sendKeys("Om Om Om");

        By clickSearchButton = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[4]/button[2]");
        driver.findElement(clickSearchButton).click();

    }

}