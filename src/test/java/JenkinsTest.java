import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JenkinsTest {
    private final Logger LOGGER = LogManager.getLogger(this.getClass());

    @Test
    public void SomeJenkinsTest(){
        System.out.println("Jenkins test");
        LOGGER.info("Hi, I`m logger");

        System.setProperty("webdriver.gecko.driver", "/home/raimonds/IdeaProjects/cucumberBonshine/src/test/resources/drivers/seleniumdrivers/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().setSize(new Dimension(1400, 960));

        driver.get("http://delfi.lv");
        System.out.println(driver.getTitle());
    }
}
