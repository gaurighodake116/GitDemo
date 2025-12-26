

package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckBox1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Gauri\\Documents\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// prefer running this, not selenium manager from above line
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");	
		
		// select checkbox
		driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).click();
		//check if checkbox is selected or not
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).isSelected()); // using assertTrue
		System.out.println("selected ? "+driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).isSelected()); //using system print
		Thread.sleep(2000L);
		// Unselect checkbox
		driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).click();
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).isSelected());
		System.out.println("selected ? "+driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).isSelected());
		
		//get the Count of number of check boxes present in the page
		//input[@type='checkbox']
		System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
		System.out.println("I did some changes.");
		System.out.println("git should recognize them now.");
		System.out.println("this was for git practice.");

		System.out.println("2nd commit: this was for git practice.");


	}
	@Test
	public void checkGit()
	{
		System.out.println("Branching check: created develop branch.");
	}

}
