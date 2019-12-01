package ultracore;

public class DriverManagerFactory {

    public static DriverManager getDriverManager(DriverType type) {
        DriverManager driverManager;

        switch (type) {
            case CHROME:
                driverManager = new ChromeDriverManager();
                break;
            case EDGE:
                driverManager = new EdgeDriverManager();
                break;
            case FIREFOX:
                driverManager = new FirefoxDriverManager();
                break;
            case SAFARI:
                driverManager = new SafariDriverManager();
                break;
            case IE:
            default:
                driverManager = new InternetExplorerDriverManager();
        }
        return driverManager;
    }
}
