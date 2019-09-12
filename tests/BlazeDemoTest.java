import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BlazeDemoTest {

	WebDriver driver;
	@Before
	public void setUp() throws Exception {
		System.out.println("Hello World");
		System.setProperty("webdriver.chrome.driver","Macintosh HD⁩/⁨Users⁩/⁨macstudent⁩/⁨Desktop/chromedriver⁩");
		WebDriver driver = new ChromeDriver();
		driver.get("http://blazedemo.com/");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
