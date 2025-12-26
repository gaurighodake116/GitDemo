package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frames5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Gauri\\Documents\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// prefer running this, not selenium manager from above line
		driver.manage().window().maximize(); //run test in maximize mode
		driver.get("http://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Nested Frames")).click();
		// --> Get how many frames present
		System.out.println(driver.findElements(By.tagName("frame")).size());
		// --> Go to parent frame
		driver.switchTo().frame(driver.findElement(By.cssSelector("frame[name='frame-top']")));//switch by web element
		// --> Go to child frame
		driver.switchTo().frame(driver.findElement(By.cssSelector("frame[name='frame-middle']")));//switch by web element
		// --> Get text from to child frame
		System.out.println(driver.findElement(By.id("content")).getText());

	}
}
