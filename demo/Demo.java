package co.OESON.selenium.demo;

 import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Demo {

	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/niffy/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		
		
		driver.get("https://www.oeson.in/index.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.className("logo-img")).isDisplayed();
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("LEARN MORE")).click();
	
		Thread.sleep(2000);
		String at = driver.getTitle();
		String et = "Home | Oeson";
		if (at.equalsIgnoreCase(et))
		{
			System.out.println("Test Successful");
		}
		else
		{
			System.out.println("Test Failure");
		}
		
		
		driver.get("https://www.oeson.in/services.html");
		driver.findElement(By.className("display-3")).isDisplayed();
		Thread.sleep(1000);
		
		
		driver.get("https://www.oeson.in/career.html");
		Thread.sleep(2000);
		driver.findElement(By.className("col-6")).click();
		Thread.sleep(2000);
		
		
		driver.get("https://www.oeson.in/about.html");
		String ht = driver.getTitle();
		String ft = "About Us | Oeson";
		if (ht.equalsIgnoreCase(ft))
		{
			System.out.println("Name is correct");
		}
		else
		{
			System.out.println("Name is incorrect");
		}
		
	
		driver.get("https://www.oeson.in/contact.html");
		driver.findElement(By.name("firstname")).sendKeys("Oluwanifemi");
		driver.findElement(By.name("lastname")).sendKeys("Latunde");
		driver.findElement(By.name("email")).sendKeys("latunde.nifemi2016@gmail.com");
		driver.findElement(By.name("phone")).sendKeys("+2348028151195");
		driver.findElement(By.name("message")).sendKeys("Thank you Oeson for this wonderful opportunity. I have learnt so much this past weeks. Great work!!!");
//		Thread.sleep(2000);

		driver.findElement(By.linkText("Blog")).click();
//		Thread.sleep(2000);
		
		
		driver.close();
				
	}

}
