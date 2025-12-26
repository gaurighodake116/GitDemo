package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assign6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://qaclickacademy.com/practice.php");
		
		// 1. Select any checkbox, option and Grab its text, put it into another variable
		driver.findElement(By.id("checkBoxOption1")).click();
		String Option = driver.findElement(By.xpath("//label[@for='bmw']")).getText();
		
		// 2. Select same text from another dropdown by using extracted text not manually
		WebElement staticDropdown = driver.findElement(By.cssSelector("#dropdown-class-example"));
		Select dropdown = new Select(staticDropdown);
		dropdown.selectByVisibleText(Option);
		System.out.println(dropdown.getFirstSelectedOption().getText());

		// 3. Enter same text in editbox, click on alert
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys(Option);
		driver.findElement(By.cssSelector("#alertbtn")).click();
		
		// 4. Check if alert text contains  text grabbed at step 1
		System.out.println(driver.switchTo().alert().getText().contains(Option));
		// OR
		if (driver.switchTo().alert().getText().contains(Option)) 
		{
			System.out.println("Alert message success");
		}
		else 
		{
			System.out.println("Something wrong with execution");
		}
		
	
	}
}
