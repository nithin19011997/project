package pom_project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class amazon_login {
	WebDriver driver;
	By signin=By.xpath("//*[@id=\"nav-link-accountList\"]");
	By mail=By.name("email");
	By mailclick=By.id("continue");
	By pass=By.name("password");
	By log=By.id("signInSubmit");
	
	public amazon_login(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void sign()
	{
		driver.findElement(signin).click();
	}
	public void login(String mail1,String pass1)
	{
		driver.findElement(mail).sendKeys(mail1);
		driver.findElement(mailclick).click();
		driver.findElement(pass).sendKeys(pass1);
		driver.findElement(log).click();
	}
	

}
