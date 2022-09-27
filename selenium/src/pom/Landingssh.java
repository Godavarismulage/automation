package pom;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;


public class Landingssh {

	 WebDriver driver;
	
	 //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	   public Landingssh(WebDriver driver) 
	   {
	       this.driver=driver;
	       PageFactory.initElements(driver, this);
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	   }


//sign up

@FindBy(css="button.btn.btn-warning.my-2.my-sm-0")
WebElement Signin;

@FindBy(linkText="Sign up")
WebElement Signup;

@FindBy(className="form-control") 
WebElement FirstName;
	   
@FindBy(xpath="//input[@placeholder='Last Name']")
WebElement  LastName;  
	
@FindBy(css="input[type='Email']") 
WebElement Emailid;
	   
@FindBy(xpath="//input[@placeholder='Password']")
WebElement passworde;
	   
@FindBy(css="input[type='date']")
WebElement calender;
	   
@FindBy(css="div[class='col-md-3'] input[name='gender']") 
WebElement gender;

@FindBy(css="input[placeholder='91XXXXXXXXXX']")
WebElement numberr;

@FindBy(xpath="//textarea[@placeholder='Short Bio']")
WebElement bio;

@FindBy(className="btn-info")
WebElement register;



//signin

@FindBy(className="my-sm-0")
WebElement signin;         

@FindBy(id="username")
WebElement username;

@FindBy(name="password")
WebElement password;

@FindBy(css="label.custom-control-label")
WebElement rememberme;

@FindBy(className="btn-primary")
WebElement login;



//home

@FindBy(id="home")
WebElement hom;

@FindBy(id="navbarDropdown")
WebElement latest;

@FindBy(linkText="Samsung")
WebElement samsung;

@FindBy(linkText="More Details")
WebElement more;

@FindBy(className="nav-link")
WebElement nav;

@FindBy(id="navbarDropdown")
WebElement bar;

@FindBy(linkText="Lenovo")
WebElement lenov;

@FindBy(id="navbarDropdown")
WebElement drop;

@FindBy(linkText="Apple")
WebElement applee;

@FindBy(className="nav-link")
WebElement linkk;

@FindBy(linkText="Support")
WebElement supportt ;

@FindBy(linkText="Order")
WebElement orderr;

@FindBy(xpath="//a[normalize-space()='Home']")
WebElement home;

@FindBy(id="home")
WebElement homee;

@FindBy(xpath="//a[@id='navbarDropdown'][contains(.,'Support')]")
WebElement supporttt;

@FindBy(linkText="Contact Us")
WebElement contactuss;

@FindBy(xpath="//footer//a[@href=\"index.html\"]")
WebElement homeee;



@FindBy(xpath="//footer//a[@href=\"order.html\"]")
WebElement ord;

@FindBy(linkText="Terms & Conditions")
WebElement terms;

@FindBy(linkText="Privacy Policy")
WebElement privacy;

@FindBy(linkText="Contact Us")
WebElement cont;

@FindBy(xpath="//footer//a[@href=\"sign.html\"]")
WebElement sign;




//signup

public void registerButton(String name,String lname,String email,String password,String date,String number,String text) throws InterruptedException 
{
  Signin.click();
  Signup.click();
  FirstName.sendKeys(name);
  LastName.sendKeys(lname); 
  Emailid.sendKeys(email);
  passworde.sendKeys(password);
  calender.sendKeys(date);
  gender.click();
  numberr.sendKeys(number);
  bio.sendKeys(text);
  Thread.sleep(2000);
  register.click();
  driver.switchTo().alert().accept();
  driver.quit();
  
}

//sign in
public void signin(String user,String pass) throws InterruptedException
{
signin.click();
username.sendKeys(user);
password.sendKeys(pass);
Thread.sleep(2000);
rememberme.click();
login.click();
Thread.sleep(1000);
String ActualTitle = driver.getTitle();
String ExpectedTitle = "Mobile";
Assert.assertEquals(ActualTitle, ExpectedTitle);
driver.quit();

}

//home
public void Home()
{
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	hom.click();
	latest.click();
	samsung.click();
	more.click();
	nav.click();
	bar.click();
	lenov.click();
	drop.click();
	applee.click();
	linkk.click();
	supportt.click();
    
    
	orderr.click();
	 home.click();
	homee.click();
	supporttt.click();
	contactuss.click();
	homeee.click();
	
	ord.click();
	terms.click();
	privacy.click();
	
	ord.click();
	terms.click();
	privacy.click();
	cont.click();
	sign.click();
	driver.quit();
}
	public void goTo()
	{
		driver.get("https://mobileworld.banyanpro.com/");
	}		

 }



