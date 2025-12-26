package Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table7 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://qaclickacademy.com/practice.php");
		// --> Call JavascriptExecutor method
		JavascriptExecutor js = (JavascriptExecutor)driver; //
		// --> Java script to scroll through webpage
		js.executeScript("window.scrollBy(0, 500)"); 
		Thread.sleep(3000);
						
		// 1. No of rows
		List<WebElement> values = driver.findElements(By.cssSelector(".table-display tr"));
		System.out.println(values.size());
		// OR
		WebElement table=driver.findElement(By.cssSelector(".table-display"));
		System.out.println(table.findElements(By.tagName("tr")).size());
		
		// 2. No of columns
		System.out.println(table.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th")).size());	
		
		// 3. Content of 2nd row
		List<WebElement> secondRow = table.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));
		for (int i=0; i<secondRow.size();i++) 
		{
			System.out.println(secondRow.get(i).getText());
		}

	}

}
