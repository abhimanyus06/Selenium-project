package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orangehrm2 {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));

		// Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		// Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='oxd-userdropdown-tab']/p[@class='oxd-userdropdown-name']")).click();
		// Thread.sleep(2000);
		driver.findElement(By.xpath("//*[contains(text(), 'Logout')]")).click();

		driver.quit();

	}

}
