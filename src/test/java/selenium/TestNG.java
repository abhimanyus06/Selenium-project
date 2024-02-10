package selenium;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;

public class TestNG {

	WebDriver driver;

	@Test
	public void f() {

		driver.findElement(By.xpath("//*[contains(text(), 'Create new account')]")).click();
		driver.findElement(By.xpath("//*[@name='firstname']")).sendKeys("Abhimanyu");
		driver.findElement(By.xpath("//*[@name='lastname']")).sendKeys("saini");
		driver.findElement(By.xpath("//*[@name='reg_email__']")).sendKeys("abhimanyus036@gmail.com");
		driver.findElement(By.xpath("//*[@name='reg_email_confirmation__']")).sendKeys("abhimanyus036@gmail.com");
		driver.findElement(By.xpath("//*[@name='reg_passwd__']")).sendKeys("abcdefgh");

		WebElement d = driver.findElement(By.xpath("//*[@name='birthday_day']"));

		Select dropdown = new Select(d);
		// dropdown.selectByVisibleText("4");
		// dropdown.selectByIndex(6);
		dropdown.selectByValue("30");

		WebElement m = driver.findElement(By.xpath("//*[@name='birthday_month']"));

		Select dropdown2 = new Select(m);
		dropdown2.selectByValue("9");

		WebElement y = driver.findElement(By.xpath("//*[@name='birthday_year']"));

		Select dropdown3 = new Select(y);
		dropdown3.selectByValue("1996");

		driver.findElement(By.xpath("//*[contains(text(), 'Male')]")).click();
		driver.findElement(By.xpath("//*[@name='websubmit']")).click();

	}

	@BeforeMethod
	public void beforeMethod() {

		driver.get("https://www.google.com");

		driver.get("https://www.facebook.com");

		System.out.println("Current URL id -" + driver.getCurrentUrl());

	}

	@AfterMethod
	public void afterMethod() {

		System.out.println("The Current URL where the user is -" + driver.getCurrentUrl());

	}

	@BeforeClass
	public void browserTestSetup() {

		System.out.println("Opening the browser");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.manage().window().maximize();

	}

	@AfterClass
	public void afterClass() {

		driver.close();
	}

}
