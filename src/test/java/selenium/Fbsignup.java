package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Fbsignup {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//*[contains(text(), 'Create new account')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@name='firstname']")).sendKeys("Abhimanyu");
		driver.findElement(By.xpath("//*[@name='lastname']")).sendKeys("saini");
		driver.findElement(By.xpath("//*[@name='reg_email__']")).sendKeys("abhimanyus036@gmail.com");
		driver.findElement(By.xpath("//*[@name='reg_email_confirmation__']")).sendKeys("abhimanyus036@gmail.com");
		driver.findElement(By.xpath("//*[@name='reg_passwd__']")).sendKeys("abcdefgh");

		WebElement w = driver.findElement(By.xpath("//*[@name='birthday_day']"));

		Select dropdown = new Select(w);
		// dropdown.selectByVisibleText("4");
		// dropdown.selectByIndex(6);
		dropdown.selectByValue("31");

	}

}
