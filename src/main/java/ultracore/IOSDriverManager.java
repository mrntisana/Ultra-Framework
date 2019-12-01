package ultracore;

import org.openqa.selenium.remote.DesiredCapabilities;

public class IOSDriverManager extends DriverManager {
    @Override
    protected void createWebDriver() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("PlatformName", "iOS");
//        this.driver = new IOSDriver(getRemoteURL(), capabilities);
    }
}
