package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Sign_up {

   public static void main(String[] args) throws InterruptedException {
       System.setProperty("webdriver.chrome.driver","C:\\Users\\godavari.sm\\Downloads\\chromedriver_win32\\chromedriver.exe");
       WebDriver driver=new ChromeDriver();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
       
       driver.get("https://mobileworld.banyanpro.com/");
       driver.findElement(By.className("btn-warning")).click();
       driver.findElement(By.linkText("Sign up")).click();
       
       driver.findElement(By.className("form-control")).sendKeys("Godavari");    
       driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Mulge");
       driver.findElement(By.cssSelector("input[placeholder='Enter Email']")).sendKeys("godavari@gmail.com");
       driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("godu789");
       driver.findElement(By.cssSelector("input[type='date']")).sendKeys("08/08/2000");
       driver.findElement(By.cssSelector("div[class='col-md-3'] input[name='gender']")).click();
       driver.findElement(By.cssSelector("input[placeholder='91XXXXXXXXXX']")).sendKeys("9620818621");
       driver.findElement(By.xpath("//textarea[@placeholder='Short Bio']")).sendKeys("Im Godavari S M");
       driver.findElement(By.className("btn-info")).click();               
       driver.switchTo().alert().accept();
       driver.quit();
    }

}
