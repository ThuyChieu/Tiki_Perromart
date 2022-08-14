package Config;

import Common.Reader;
import Managers.DriverName;

import java.util.Properties;

public final class Config {
    // Make class static
    private Config() {}

    public static String pageUrl;
    public static DriverName driverName;

    public static void setup() throws Exception {
        Properties properties = Reader.readPropertyFile("config.properties");
        pageUrl = properties.getProperty("PAGE_URL");

        String driverNameStr = properties.getProperty("DRIVER_NAME");
        switch (driverNameStr) {
            case "Edge":
                driverName = DriverName.EDGE;
                break;
            case "Chrome":
                driverName = DriverName.CHROME;
                break;
            case "Firefox":
                driverName = DriverName.FIREFOX;
                break;
            case "Safari":
                driverName = DriverName.SAFARI;
                break;
            default:
                throw new Exception("Wrong DriverName");
        }
    }
}
