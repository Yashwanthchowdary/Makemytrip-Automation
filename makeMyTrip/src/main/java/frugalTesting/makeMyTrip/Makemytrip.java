package frugalTesting.makeMyTrip;


import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
public class Makemytrip {

	@SuppressWarnings("deprecation")
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		Logger l = Logger.getLogger("Makemytrip");

		WebDriver driver;
		driver = new ChromeDriver();
		driver.navigate().to("https://www.makemytrip.com/railways/");
		driver.manage().window().maximize();
		l.info("Chrome Maximized");
		String CurrentUrl = driver.getCurrentUrl();
		System.out.println(CurrentUrl);
		System.out.println(driver.getTitle());
		
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement fromCity = driver.findElement(By.xpath("//*[@id='fromCity']"));
		fromCity.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement enterCityName = driver.findElement(By.xpath("//*[@id=\"top-banner\"]/div[2]/div/div/div/div[2]/div/div[1]/div[1]/div/div/div/input"));
		enterCityName.sendKeys("Delhi");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[contains(text(),'New Delhi Railway Station')]")).click();
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		WebElement Tocity = driver.findElement(By.xpath("//input[@placeholder='To']"));
		Tocity.sendKeys("Lucknow");
		driver.findElement(By.xpath("//span[contains(text(),'Lucknow - All Stations')]")).click();
		
		
		driver.findElement(By.id("travelDate")).click();
		
		
		driver.findElement(By.xpath("//div[@aria-label='Tue Feb 20 2024']")).click();
		
		driver.findElement(By.xpath("//label[@for='travelClass']")).click();
		
		driver.findElement(By.xpath("//li[text()='Third AC']")).click();
		
		
		driver.findElement(By.xpath("//*[@id=\"top-banner\"]/div[2]/div/div/div/div[2]/p/a")).click();
		
		
		driver.close();
		


	}

}
