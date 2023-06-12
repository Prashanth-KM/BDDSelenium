package TestComponents;

import com.web.driver.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks extends DriverManager{


    public byte[] getScreenshot() {
        return ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
    }

    @After
    public void afterScenario(Scenario scenario) throws InterruptedException {
        System.out.println("FAILED LISTENERS");
        if (scenario.isFailed()) {
            scenario.attach(getScreenshot(),"image/png", scenario.getName());
        }
        Thread.sleep(3000);
       tearDown();
    }

    @Before
    public void beforeTestCases(){
        System.out.println("TEST CASE START -> " );
    }

}
