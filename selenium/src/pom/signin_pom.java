package pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class signin_pom {

	
 @AfterSuite
  public void Aftersuite()
  {
   System.out.println("Execution is completed.");
  }
 	
	
 @Test(dataProvider="Signin_pom1", groups={"group"})
  public void Signin(String user,String pass) throws InterruptedException
 {

   System.setProperty("webdriver.chrome.driver","C:/Users/godavari.sm/Downloads/chromedriver_win32/chromedriver.exe");
   WebDriver driver = new ChromeDriver();
   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
   
   Landingssh home=new Landingssh(driver);

   home.goTo();
   home.signin(user,pass);
}


@DataProvider

public Object[][] Signin_pom1()
{
Object[][] data = new Object[2][2];

data[0][0]="godavari";
data[0][1]="godu897";

data[1][0]="89765";
data[1][1]="@$%th";
return data;

}
}



