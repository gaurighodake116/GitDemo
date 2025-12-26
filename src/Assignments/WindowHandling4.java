package Assignments;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WindowHandling4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Gauri\\Documents\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// prefer running this, not selenium manager from above line

		driver.get("http://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Multiple Windows")).click();
		driver.findElement(By.cssSelector("a[href='/windows/new']")).click();

		// --> Get ids of all opened windows 
		Set<String> windows = driver.getWindowHandles();	//[parentid, childid]
		// --> iterate over all window handle ids 
		Iterator<String>it = windows.iterator();
		String parentId = it.next();// --> get parentId 
		String childId = it.next(); // --> get childId 
		// --> switch to child window
		driver.switchTo().window(childId); 
		// --> get text
		System.out.println(driver.findElement(By.xpath("//div//h3")).getText());
		// --> switch back to parent window
		driver.switchTo().window(parentId); 
		// --> get text
		System.out.println(driver.findElement(By.xpath("//div//h3")).getText());
		


	}
}
