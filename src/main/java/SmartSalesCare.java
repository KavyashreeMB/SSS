import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class SmartSalesCare {

	static AppiumDriver<MobileElement> driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			OpenSmartSalesCare();
		} 
		catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getCause());
			System.out.println(e.getMessage());
			System.out.println(e.getStackTrace());
		}

	}

	public static void OpenSmartSalesCare() throws Exception{
		
			
			DesiredCapabilities cap = new DesiredCapabilities();
			cap.setCapability("deviceName", "Mi A3");
			cap.setCapability("udid", "1e598a5063ff");
			cap.setCapability("platformName", "Android");
			cap.setCapability("platformVersion", "12");
		

           cap.setCapability("appPackage", "com.hyundai.teli.smartsales"); 
           cap.setCapability("appActivity", "com.hyundai.teli.smartsales.activities.Splash"); 
           // //Open the application and give permission access // 
           cap.setCapability("autoGrantPermissions","true"); 
           URL url= new URL("http://127.0.0.1:4723/wd/hub"); 

           driver = new AppiumDriver<MobileElement>(url,cap); 
           System.out.println("Application Started.....");  
           Thread.sleep(10000); 
           MobileElement Mobnum= driver.findElement(By.xpath("//*[contains(@text,'SC Mobile No')]")); 
           Thread.sleep(5000);
           Mobnum.click();  
           Mobnum.sendKeys("8073451242");  
            
           MobileElement UsrID= driver.findElement(By.id("com.hyundai.teli.smartsales:id/user_id_et")); 
           Thread.sleep(5000);
           UsrID.click(); 
           UsrID.sendKeys("KHDSR837");  
           MobileElement PwdID= driver.findElement(By.id("com.hyundai.teli.smartsales:id/password_et")); 
           Thread.sleep(5000);
           PwdID.click();  
           PwdID.sendKeys("Hyundai@20");  
           MobileElement Logbtn= driver.findElement(By.id("com.hyundai.teli.smartsales:id/login_btn")); 
           Logbtn.click(); 
           Thread.sleep(5000);
           //Landing screen 
           driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
           MobileElement Brandstry=driver.findElement(By.id( "com.hyundai.teli.smartsales:id/brand_story")); 
           Brandstry.click(); 
           Thread.sleep(5000);
           MobileElement Videobtn= driver.findElement(By.id("com.hyundai.teli.smartsales:id/image_button")); 
           Videobtn.click();  
           Thread.sleep(5000);
           driver.navigate().back(); 
           driver.navigate().back(); 
           
           MobileElement Consultationbtn=driver.findElement(By.id( "com.hyundai.teli.smartsales:id/consultation")); 
           Consultationbtn.click();
           MobileElement Prombtn=driver.findElement(By.id( "com.hyundai.teli.smartsales:id/scheme_layout")); 
           Prombtn.click();
           driver.navigate().back(); 
           
           
			
	}
}
