package automationFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * 
 *
 * @author Piterion GmbH
 */
public class FirstTestCase {

  /**
   * @param args
   * @throws InterruptedException
   */
  public static void main(String[] args) throws InterruptedException {

    // Create a new instance of the Chrome driver
    //		File file = new File("C:\\Program Files\\selenium-java-3.4.0\\chromedriver.exe");
    //		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
    //    WebDriver driver = new ChromeDriver();
    //    WebDriver driver = new FirefoxDriver();

    // Create a new instance of the IE driver
    //		File file = new File("C:\\Program Files\\selenium-java-3.4.0\\IEDriverServer.exe");
    //		System.setProperty("webdriver.ie.driver", file.getAbsolutePath());
    DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
    caps.setCapability("ignoreZoomSetting", true);
    WebDriver driver = new InternetExplorerDriver(caps);

    //Launch the Online Store Website
    driver.get("http://www.store.demoqa.com");

    // Print a Log In message to the screen
    System.out.println("Successfully opened the website www.Store.Demoqa.com");

    //Wait for 5 Sec
    Thread.sleep(5000);

    // Close the driver
    driver.quit();
  }
}