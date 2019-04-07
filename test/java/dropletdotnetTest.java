import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.System.out;
import static java.lang.System.setProperty;
import static org.junit.jupiter.api.Assertions.*;

class dropletdotnetTest {

    WebDriver driver =null;

    @BeforeEach
    void setUp() {
        setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        //driver.get("http://104.248.249.47/Student/Get");
        driver.get("http://104.248.249.47");

    }

    @AfterEach
    void tearDown() {
        System.out.println("After the test");
        driver.quit();
    }

    @Test
    void firstTest()
    {

        driver.get("http://104.248.249.47");

        out.println("Page title is: " + driver.getTitle());
    }

    @Test
    void secondTest()
    {
        int[] arr = {1,2,3,4};

        dropletdotnet a = new dropletdotnet(1, "Adam",23,arr );
        assertEquals(1, a.id);

    }
}