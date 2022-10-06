package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    public static Properties properties;

    static {
        String filePath="src/configuration.properties";
        try {
            FileInputStream fis=new FileInputStream(filePath);
            properties=new Properties();
            properties.load(fis);


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

      public static String getProperty(String key){

          return properties.getProperty(key);
      }
}
