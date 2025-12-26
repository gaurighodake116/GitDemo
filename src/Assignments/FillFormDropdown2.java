package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FillFormDropdown2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Gauri\\Documents\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		String name = "Rahul";
		String email = "rahul@gmail.com";
		String password = "rahul";

		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/");

		// --> Select name
		driver.findElement(By.cssSelector("input.form-control[name='name']")).sendKeys(name);
		// --> Select email
		driver.findElement(By.cssSelector("input.form-control[name='email']")).sendKeys(email);
		// --> Select password
		driver.findElement(By.id("exampleInputPassword1")).sendKeys(password);
		// --> Select checkbox
		driver.findElement(By.id("exampleCheck1")).click();
		// --> Select gender
		driver.findElement(By.xpath("//*[@id=\"exampleFormControlSelect1\"]/option[1]")).click();
//	    driver.findElement(By.cssSelector("//*[@id=\"exampleFormControlSelect1\"]/option[2]")).click(); //same as above but using cssSelector
		// --> Select checkbox for Employment Status
		driver.findElement(By.cssSelector("#inlineRadio2")).click();
		// --> Select date
//		driver.findElement(By.cssSelector("input[type='date']")).click();
		driver.findElement(By.name("bday")).sendKeys("16-06-2025");
		Thread.sleep(2000L);
		// --> Send value to Data Binding example
//		driver.findElement(By.xpath("//input[@class='ng-pristine ng-valid ng-touched']")).sendKeys(name);
//		driver.findElement(By.cssSelector("input[class='ng-pristine ng-valid ng-touched']")).sendKeys(name);
		// --> Click Submit
		driver.findElement(By.cssSelector("input[value='Submit']")).click();
		System.out.println(driver.findElement(By.xpath("//div[contains(@class,'alert-success')]")).getText());

	}
}
