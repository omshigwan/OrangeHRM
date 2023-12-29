import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.time.Duration;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver)
    {
        this.driver = driver;
    }
    By usernameField = By.xpath("//*[@placeholder='Username']");
    By passwordField = By.xpath("//*[@placeholder='Password']");
    By loginButton = By.xpath("//button[@class= 'oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']");

    public DashboardPage performLogin(String username, String password){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(usernameField).sendKeys(username);
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(loginButton) .click();
        return new DashboardPage(driver);
    }

    public static By error()
    {
        return By.xpath("//p[text()=\"Invalid credentials\"]");
    }



}