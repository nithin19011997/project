package pom_project1;




import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class product_search {
	WebDriver driver;
	
	By ele=By.xpath("//*[@id=\"nav-xshop\"]/a[7]");
	By thin=By.xpath("//*[@id=\"nav-flyout-aj:https://images-eu.ssl-images-amazon.com/images/G/31/img18/Electronics/Megamenu/megamenumar18f.json:subnav-sl-megamenu-2:0\"]/div[2]/div/div[1]/h3[1]/a");
	By lap=By.xpath("//*[@id=\"nav-subnav\"]/a[3]/span[1]");
	By checkclick=By.xpath("//*[@id=\"s-refinements\"]/div[3]/ul/li[1]/span/a/div/label/i");
	By oglap=By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[5]/div/div/div/div/div[2]/div[1]/h2/a/span");
	
	
	By menu=By.id("nav-hamburger-menu");
	By mob_lap=By.xpath("//*[@id=\"hmenu-content\"]/ul[1]/li[16]");
	
	
	
	public product_search(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void select() throws InterruptedException 
	{
		
		
		Actions act=new Actions(driver);
		driver.findElement(ele).click();
		WebElement abc=driver.findElement(lap);
		act.moveToElement(abc).perform();
		Thread.sleep(3000);
		driver.findElement(thin).click();
		Thread.sleep(5000);
		WebElement abc1=driver.findElement(checkclick);
		abc1.click();		
		driver.findElement(oglap).click();
		//driver.findElement(mob_lap).click();
		
		//driver.findElement(lap).click();
//		
//		act.moveToElement((WebElement) ele);
//		act.perform();
	}
}
