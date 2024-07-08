package demo_package;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class makemytrip {
	WebDriver driver;
	@BeforeTest
	public void bt() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
	}
@Test
public void tc1(){
	driver.findElement(By.linkText("Hotels")).click();
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	WebElement place=driver.findElement(By.xpath("//input[@autocomplete=\"nope\"]"));
	Select sel=new Select(place);
	sel.selectByValue("Munnar");
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	//place.sendKeys("Munnar");
	
}






}


