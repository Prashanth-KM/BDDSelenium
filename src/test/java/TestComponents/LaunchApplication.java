package TestComponents;

import com.web.driver.DriverManager;
import com.web.utils.PropertyUtils;

public class LaunchApplication extends DriverManager {

    public void launchApplication(){
       driver = initializeDriver();
       setURL();
    }

    public static void setURL(){
        driver.get(PropertyUtils.getPropertyValue("url"));
    }


}
