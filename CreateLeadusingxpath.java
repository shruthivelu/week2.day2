package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLeadusingxpath {

	public static void main(String[] args) {
		
		//setup the chrome Driver
		WebDriverManager.chromedriver().setup();
		
		//Launch the Chrome Driver
		ChromeDriver driver = new ChromeDriver(); // static method call
		
		//Load the URL (method -->get--> "URL")
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		//maximize browser
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoSalesManager");
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("UST Global");
		
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Shruthi");
		
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Muthiah");		
				
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
					
		//Get the title
		String title = driver.getTitle();
		System.out.println(title);
		
		

	}

}
