package TrainingQA.DemoMavenEclipseProject;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class Project1 {
	WebDriver driver;
  @Test
  public void f() {
	  System.out.println("This is maven test project");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\sravs\\Downloads\\chromedriver_win32\\chromedriver.exe");
	 driver=new ChromeDriver();
	  driver.get("http://newtours.demoaut.com/");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("Browser open sucessfully");
	  driver.close();
  }

}
