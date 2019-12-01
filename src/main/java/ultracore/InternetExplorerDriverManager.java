package ultracore;

import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;

public class InternetExplorerDriverManager extends DriverManager {
    @Override
    protected void createWebDriver() {
        InternetExplorerOptions options = new InternetExplorerOptions();

        this.driver = new InternetExplorerDriver(options);
    }
}
