package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orangehrm3 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@type='submit']")).click();

		Thread.sleep(2000);

		// driver.findElement(By.xpath("//*[contains(text(), 'Admin')]")).click();

		driver.findElement(
				By.xpath("//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name' and text()='Admin']"))
				.click();

		Thread.sleep(2000);

		// driver.findElement(By.xpath("//*[contains(text(), 'PIM')]")).click();

		driver.findElement(
				By.xpath("//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name' and text()='PIM']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[contains(text(), 'Paul Collings')]")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[contains(text(), 'Logout')]")).click();

		Thread.sleep(2000);

		driver.quit();

	}

}
