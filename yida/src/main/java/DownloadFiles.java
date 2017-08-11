import org.openqa.selenium.*;  
import org.openqa.selenium.firefox.FirefoxDriver;  
import org.openqa.selenium.firefox.FirefoxProfile;  
import org.testng.annotations.Test;  
import org.testng.annotations.BeforeMethod;  
import org.testng.annotations.AfterMethod;  
  
public class DownloadFiles {  
    public static String DownloadFilepath = "D:\\DownloadFiles";  
    WebDriver driver;  
    String url;  
    JavascriptExecutor js;  
  @Test  
  public void test() throws Exception  
  {  
      driver = new FirefoxDriver(FilefoxDriverProfile());  
      driver.get(url);
      driver.findElement(By.id("username")).sendKeys("dlsp");
      driver.findElement(By.id("password")).sendKeys("dlsp123456");
      driver.findElement(By.id("login_btn")).click();
      Thread.sleep(10000);
      driver.switchTo().frame("contentFrame");
      driver.findElement(By.id("export")).click();  
        
      try   
      {  
          Thread.sleep(3000);  
      }catch(Exception e){  
          e.printStackTrace();  
      }  
  }  
    
  @BeforeMethod  
  public void beforeMethod()   
  {  
      url="http://unified.xanewtouch.cn/park/login.html";  
  }  
  
  @AfterMethod  
  public void afterMethod() throws InterruptedException   
  {  
	  Thread.sleep(5000);
      driver.quit();  
  }  
    
  public static FirefoxProfile FilefoxDriverProfile () throws Exception  
  {  
      //声明一个profile对象  
      FirefoxProfile profile = new FirefoxProfile();  
      profile.setPreference("browser.download.folderList",2);  
      profile.setPreference("browser.download.manager.showWhenStarting", false);  
      profile.setPreference("browser.download.dir", DownloadFilepath);  
      profile.setPreference("browser.helperApps.neverAsk.openFile",  
              "application/xhtml+xml,application/xml,application/x-msdownload,application/octet/octet-stream,application/exe,txt/csv,application/pdf,application/x-msexcl,application/x-excel,application/excel,image/png,image/jpeg,text/html,text/plain,text/x-c");  
      profile.setPreference("browser.helperApps.neverAsk.saveToDisk",  
              "application/xhtml+xml,application/xml,application/x-msdownload,application/octet/octet-stream,application/exe,txt/csv,application/pdf,application/x-msexcl,application/x-excel,application/excel,image/png,image/jpeg,text/html,text/plain,text/x-c");  
      //不会打开未知MIMe类型  
      profile.setPreference("browser.helperApps.alwaysAsk.force", false);  
      //不会弹出警告框  
      profile.setPreference("browser.download.manager.alertOnEXEopen", false);  
      profile.setPreference("browser.download.manager.focusWhenStarting", false);  
      profile.setPreference("browser.download.manager.useWindow", false);  
      profile.setPreference("browser.download.manager.showAlertOnComplete", false);  
      profile.setPreference("browser.download.manager.closewhenDone", false);  
      return profile;  
  }  
}   