package project;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
public class SeleniumTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91827\\eclipse-workspace\\MyFirstProject\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.moneycontrol.com/");
		System.out.println(driver.getTitle());
		WebElement tools = driver.findElement(By.xpath("/html/body/header/div[1]/div[3]/nav/div/ul/li[8]/a"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",tools);
		WebElement home = driver.findElement(By.xpath("/html/body/header/div[1]/div[3]/nav/div/ul/li[8]/div/div[1]/ul/li[2]/ul[3]/li[4]/a"));
		js.executeScript("arguments[0].click();", home);
		Actions actions= new Actions(driver);
		actions.moveToElement(tools);
		actions.moveToElement(home);
		actions.click().build().perform();
		driver.findElement(By.xpath("/html/body/div[13]/section[1]/div/div/div[1]/div[1]/div/div[2]/div/div[2]/div[1]/div[2]")).sendKeys("3000000");
		WebElement Element = driver.findElement(By.xpath("/html/body/div[13]/section[1]/div/div/div[1]/div[1]/div/div[2]/div/div[5]/a[1]"));
		js.executeScript("arguments[0].click();", Element);
		//WebDriver driver = new ChromeDriver();
		//driver.get("https://www.moneycontrol.com/");
		//System.out.println(driver.getTitle());
	   // Thread.sleep(5000);
		/*System.out.println(driver.getTitle());//validate title is correct or not
		System.out.println(driver.getCurrentUrl());//validate if you are landed on correct url
		
		driver.findElement(By.id("firstName")).sendKeys("Manali");
		driver.findElement(By.id("lastName")).sendKeys("Suryawanshi");
		driver.findElement(By.id("userEmail")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("userNumber")).sendKeys("8567334567");;
		//driver.findElement(By.id("subjectsContainer")).sendKeys("Maths");
		//driver.close();
		driver.findElement(By.id("currentAddress")).sendKeys("abcdef");
		//driver.findElement(By.id("currentAddress")).sendKeys(Keys.TAB);
		WebElement upload = driver.findElement(By.id("uploadPicture"));
		upload.sendKeys("C:\\Users\\91827\\Desktop\\mindtree-logo.jpg");
		WebElement gender = driver.findElement(By.xpath("//input[@value='Female']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",gender);
		WebElement hobbies = driver.findElement(By.xpath("//input[@value='2']"));
		js.executeScript("arguments[0].click();", hobbies);
		WebElement Element = driver.findElement(By.xpath("//*[@id='submit']"));
		js.executeScript("arguments[0].click();", Element);
		Select s = new Select(driver.findElement(By.id("state")));
		s.selectByVisibleText("NCR");
		Select s1 = new Select(driver.findElement(By.id("city")));
		s1.selectByVisibleText("Delhi");
		
		/*WebElement upload = driver.findElement(By.id("uploadPicture"));
		upload.sendKeys("C:\\Users\\sdetmindc163\\Desktop\\mindtree-logo.jpg");
	    WebElement Element=driver.findElement(By.xpath("//*[@id='submit']"));
		WebElement  gender = driver.findElement(By.xpath("//input[@value='Female']"));
		WebElement hobbies =driver.findElement(By.xpath("//input[@value='2']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", gender);
		js.executeScript("arguments[0].click();",Element);
		js.executeAsyncScript("arguments[0].click();",hobbies);
		Select s = new Select(driver.findElement(By.id("state")));
	    s.selectByVisibleText("NCR");
	    Select s1 = new Select(driver.findElement(By.id("city")));
	    s1.selectByVisibleText("Delhi");*/
		 //Thread.sleep(5000);*/
		
	}

}
