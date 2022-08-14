package Common;

import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

public final class Reader {

    // Make class to static
    private Reader() {}

    public static Properties readPropertyFile(String propertiesFileName) throws Exception {
        Properties properties = new Properties();

        // Compiled "properties" file in the root of "classes" folder
        InputStream inputStream = Reader.class.getResourceAsStream("/" + propertiesFileName);

        properties.load(inputStream);
        return properties;
    }
}
