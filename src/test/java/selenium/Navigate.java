package selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://google.com");
		System.out.println(driver.getTitle());
		Thread.sleep(1000);

		driver.get("https://facebook.com");
		System.out.println(driver.getTitle());
		Thread.sleep(1000);

		driver.get("https://github.com");
		System.out.println(driver.getTitle());
		Thread.sleep(1000);

		driver.get("https://twitter.com");
		System.out.println(driver.getTitle());
		Thread.sleep(1000);

		driver.navigate().back();

		Thread.sleep(1000);

		driver.navigate().back();

		Thread.sleep(1000);
		driver.navigate().forward();
		Thread.sleep(1000);

		driver.navigate().forward();
		driver.navigate().refresh();
		Thread.sleep(2000);

		driver.close();

	}

}
