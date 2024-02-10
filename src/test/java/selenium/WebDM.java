package selenium;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.chrome.ChromeOptions;

import org.openqa.selenium.WebDriver;

public class WebDM {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeOptions option = new ChromeOptions();
		ChromeDriver driver = new ChromeDriver(option);

		driver.get("https://www.facebook.com");
	}

}
