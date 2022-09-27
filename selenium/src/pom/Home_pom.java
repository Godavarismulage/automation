package pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

public class Home_pom {


@Test

public void setup() throws InterruptedException{
	System.setProperty("webdriver.chrome.driver","C:/Users/godavari.sm/Downloads/chromedriver_win32/chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    
    Landingssh hom=new Landingssh(driver);
    hom.goTo();
    hom.Home();

 }
}