import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RecruitmentPage {
    WebDriver driver;
    public RecruitmentPage(WebDriver driver)
    {
        this.driver = driver;
    }

    private By addButton = By.xpath("//button[@class=\"oxd-button oxd-button--medium oxd-button--secondary\"]");

    private By eyeButton = By.xpath("//button[@class=\"oxd-icon-button oxd-table-cell-action-space\" and @type=\"button\"]");
    public AddCandidatePage clickAdd() {
        driver.findElement(addButton).click();
        return new AddCandidatePage(driver);
    }

    public EditCandidatePage clickEyeButton(){
        driver.findElement(eyeButton).click();
        return new EditCandidatePage(driver);

    }


}
