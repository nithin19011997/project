package pom_project1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class amazon_test {
WebDriver driver;
@BeforeTest
public void setup()
{
	ChromeOptions options=new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");		
	driver=new ChromeDriver(options);
	
}
@BeforeMethod
public void url()
{
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
}
@Test
public void test() throws InterruptedException 
{
	//amazon_login ob=new amazon_login(driver);
	//ob.sign();
	//ob.login("nithincherian97@gmail.com","unni@123");
	product_search ob1=new product_search(driver);
	ob1.select();
	product_page ob2=new product_page(driver);
	ob2.select();
}
}
