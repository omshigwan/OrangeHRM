import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EditCandidatePage {

    WebDriver driver;

    public EditCandidatePage(WebDriver driver) {
        this.driver = driver;
    }


    public void editCandidate(){
        By EditSwitch=By.xpath("//span[@class=\"oxd-switch-input oxd-switch-input--active --label-left\"]");
        driver.findElement(EditSwitch).click();


        By EditNotes = By.xpath("//textarea[@placeholder=\"Type here\"]");
        driver.findElement(EditNotes).sendKeys("Hola amigo");

        By clickSave = By.xpath("//button[@type=\"submit\"]");
        driver.findElement(clickSave).click();
    }
}