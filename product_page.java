package pom_project1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class product_page {
	WebDriver driver;
	By cart=By.xpath("//*[@id=\"add-to-cart-button\"]");
	By click_cart=By.xpath("//*[@id=\"attach-sidesheet-view-cart-button\"]/span/input");
	public product_page(WebDriver driver)
	{
		this.driver=driver;
	}
	public void select() throws InterruptedException
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement ele=driver.findElement(cart);
		js.executeScript("arguments[0].scrollIntoView();", ele);
		driver.findElement(cart).click();
		Thread.sleep(5000);
		driver.findElement(click_cart).click();
	}
	
}
