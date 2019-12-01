package ultratest;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import ultracore.DriverManager;
import ultracore.DriverManagerFactory;
import ultracore.DriverType;

public class LoginPageTest {

    DriverManager driverManager;
    WebDriver driver;
    LoginPage loginPage;

    @BeforeClass
    public void setup() {
        driverManager = DriverManagerFactory.getDriverManager(DriverType.CHROME);
        driver = driverManager.getWebDriver();
        driver.get("https://www.login.example.com");
    }

    @Test
    public void loginTest() {
        loginPage = new LoginPage(driver);
        loginPage.login("admin", "invalid");
        Assert.assertEquals(loginPage.getLoginErrorMessage(), "Invalid username or password");
    }
}
