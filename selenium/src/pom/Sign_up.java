package pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class Sign_up {
	
 @BeforeTest
  public void beforeTest()
  {
   System.out.println("Signup is started");
  }
 
	
	
@Test(dataProvider="Sign_up1" ,groups={"group"})
 
 public void registerButton(String name,String lname,String email,String password,String date,String number,String text) throws InterruptedException            
{
	  
	        System.setProperty("webdriver.chrome.driver","C:/Users/godavari.sm/Downloads/chromedriver_win32/chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		        
		        
	        Landingssh register=new Landingssh(driver);
	        register.goTo();
	        register.registerButton(name,lname, email,password,date, number, text);
	        }

@DataProvider
public Object[][] Sign_up1()
{
	Object[][] data = new Object[2][7];
	
	data[0][0]="godavarii";
    data[0][1]="mulge";
	data[0][2]="godavari@gmail.com";
    data[0][3]="godu789";
    data[0][4]="08/08/2000";
    data[0][5]="9678986598";
    data[0][6]="hi hello";	
    
    data[1][0]="go";
    data[1][1]="mulge godavari sm  mulge";
    data[1][2]="godavari%@gmail.com";
    data[1][3]="g8";
    data[1][4]="08/08/2067";
    data[1][5]="96789";
    data[1][6]="hi hello";
    return data;  
}
}








    
    



















