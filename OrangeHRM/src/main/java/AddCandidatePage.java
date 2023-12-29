import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddCandidatePage {

    WebDriver driver;

    public AddCandidatePage(WebDriver driver) {
        this.driver = driver;
    }


    public SearchPage EnterCandidateDetails(String firstName, String middleName , String lastName, String email, String contact) {
        By EnterFirstName = By.xpath("//input[@name=\"firstName\"]");
        driver.findElement(EnterFirstName).sendKeys(firstName);

        By EnterMiddleName = By.xpath("//input[@name=\"middleName\"]");
        driver.findElement(EnterMiddleName).sendKeys(middleName);

        By EnterLastName = By.xpath("//input[@name=\"lastName\"]");
        driver.findElement(EnterLastName).sendKeys(lastName);

        By EnterEmail = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div[1]/div/div[2]/input");
        driver.findElement(EnterEmail).sendKeys(email);

        By EnterContactNo = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div[2]/div/div[2]/input");
        driver.findElement(EnterContactNo).sendKeys(contact);

        By saveClick = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[8]/button[2]");
        driver.findElement(saveClick).click();

        return new SearchPage(driver);

    }

}