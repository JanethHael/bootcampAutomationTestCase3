package util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class GetPropertiesYopmail {
     private static GetPropertiesYopmail getProperties= null;
     private String browser;
     private String host;
     private String user1;
     private String user2;

     private GetPropertiesYopmail(){
         Properties properties = new Properties();
         String nameFile="yopmail.properties";
         InputStream inputStream = getClass().getClassLoader().getResourceAsStream(nameFile);
         if(inputStream!= null){
             try {
                 properties.load(inputStream);
                 browser=properties.getProperty("browser");
                 host=properties.getProperty("host");
                 user1=properties.getProperty("user");
                 user2=properties.getProperty("user2");

             } catch (IOException e) {
                 throw new RuntimeException(e);
             }
         }
     }

     public static GetPropertiesYopmail getInstance(){
         if (getProperties == null)
             getProperties=new GetPropertiesYopmail();
         return getProperties;
     }

    public String getBrowser() {
        return browser;
    }

    public String getHost() {
        return host;
    }

    public String getUser1() {
        return user1;
    }

    public String getUser2() {
        return user2;
    }
}
