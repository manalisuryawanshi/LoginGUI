package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestTest {
	public String baseUrl="https://www.amazon.in/ ";
	String driverPath="C:\\Users\\91827\\eclipse-workspace\\MyFirstProject\\Driver\\chromedriver.exe ";
	public WebDriver driver;
	public String expected = null;
    public String actual = null;
    @BeforeTest
    public void launchBrowser() {
        System.out.println("launching chrome browser"); 
        System.setProperty("webdriver.chrome.driver", driverPath);
        driver= new  ChromeDriver();
        driver.get(baseUrl);
    }
    @Test(priority=0)
    public void register()
    {
    	Actions A = new Actions(driver);
    	A.moveToElement(driver.findElement(By.xpath("//*[@id='nav-link-accountList']"))).build().perform();;
    	driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
    	driver.findElement(By.id("ap_email")).sendKeys("manalisuryawanshi99@gmail.com");
    	driver.findElement(By.id("continue")).click();
    	driver.findElement(By.id("ap_password")).sendKeys("Manali@99");
    	driver.findElement(By.id("signInSubmit")).click();
    }
    
    @AfterTest
    public void terminateBrowser(){
        driver.close();
    }
}
