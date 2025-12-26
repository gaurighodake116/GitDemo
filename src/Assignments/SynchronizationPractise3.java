package Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SynchronizationPractise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Gauri\\Documents\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// prefer running this, not selenium manager from above line
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); // --> Implicit Wait: Applied Globally
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5)); // --> Explicit wait
		
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		String name = "rahulshettyacademy";
		String passWord = "learning";
		
		// --> Select name
		driver.findElement(By.cssSelector("input[name=\"username\"]")).sendKeys(name);
		// --> Select password
		driver.findElement(By.cssSelector("input[name=\"password\"]")).sendKeys("learning");
		driver.findElement(By.xpath("//label[2]/span[2]")).click();
		// --> Click on Okay button from popup
		//Explicitly wait until pop is visible
		w.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
		driver.findElement(By.id("okayBtn")).click();	
//		driver.findElement(By.xpath("//button[contains (text(),'Okay')]")).click();
//		driver.findElement(By.xpath("//button[@id='okayBtn']")).click();
//		driver.findElement(By.cssSelector("#okayBtn")).click();
		driver.findElement(By.cssSelector("option[value='teach']")).click();
		driver.findElement(By.cssSelector("input[id='terms']")).click();
		driver.findElement(By.xpath("//input[contains(@type,'submit')]")).click();
		


	}

}
