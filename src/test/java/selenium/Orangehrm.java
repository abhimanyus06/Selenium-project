package selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orangehrm {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		Thread.sleep(2000);

		driver.manage().window().setSize(new Dimension(500, 600));
		Thread.sleep(2000);
		driver.manage().window().fullscreen();
		Thread.sleep(2000);

		driver.quit();

	}

}
