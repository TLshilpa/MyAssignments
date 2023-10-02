package HomeAssignments2;

import java.time.Duration;

import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FbRegistration {
	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("shilpa");
		driver.findElement(By.name("lastname")).sendKeys("kothapalli");
		driver.findElement(By.name("reg_email__")).sendKeys("kshilpaj4@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("kshilpaj4@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("202023");
		
		WebElement DobDateDd = driver.findElement(By.name("birthday_day"));
		Select Date = new Select(DobDateDd);
		Date.selectByIndex(3);
		
		WebElement DobMonthDd = driver.findElement(By.name("birthday_month"));
		Select Month = new Select(DobMonthDd);
		Month.selectByIndex(5);
		
		WebElement DobYearDd = driver.findElement(By.name("birthday_year"));
		Select Year = new Select(DobYearDd);
		Year.selectByValue("1985");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.name("websubmit")).click();
	
	}
}
