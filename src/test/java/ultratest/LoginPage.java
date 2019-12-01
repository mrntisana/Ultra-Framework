package ultratest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    private By usernameTextBox = By.id("username");
    private By passwordTextBox = By.id("password");
    private By loginButton = By.id("login");
    private By errorMessageLabel = By.id("error");

    public void login(String username, String password) {
        this.setUsername(username);
        this.setPassword(password);
        this.clickLogin();
    }

    public String getLoginErrorMessage() {
        return driver.findElement(errorMessageLabel).getText();
    }

    private void setUsername(String username) {
        driver.findElement(usernameTextBox).sendKeys(username);
    }

    public void setPassword(String password) {
        driver.findElement(passwordTextBox).sendKeys(password);
    }

    public void clickLogin() {
        driver.findElement(loginButton).click();
    }
}
