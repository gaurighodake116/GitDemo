package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutoSuggestiveDropdown8 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Gauri\\Documents\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// prefer running this, not selenium manager from above line
			
		driver.get("http://qaclickacademy.com/practice.php");
		
		// --> Go to search bar, send text ind
		driver.findElement(By.cssSelector("#autocomplete")).sendKeys("ind");
		Thread.sleep(2000L); 
		// --> Move mouse cursor to downwards 2 times
		driver.findElement(By.cssSelector("#autocomplete")).sendKeys(Keys.DOWN);
		driver.findElement(By.cssSelector("#autocomplete")).sendKeys(Keys.DOWN);
		// --> Get value appeared in search box
		System.out.println(driver.findElement(By.id("autocomplete")).getAttribute("value")); 

		

	}

}
