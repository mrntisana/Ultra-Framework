package ultracore;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeDriverManager extends DriverManager{

    @Override
    protected void createWebDriver() {
        ChromeOptions options = new ChromeOptions();
        // set your browser-specific options here
        this.driver = new ChromeDriver(options);
    }

}
