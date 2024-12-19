package lesson_01_OpenApp;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;


import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class OpenAppProgramatically {
  @Test
  public void launchApp() throws MalformedURLException {
	  
	  AppiumDriverLocalService service =  new AppiumServiceBuilder().withAppiumJS(new File("C:\\Users\\HP\\AppData\\Roaming\\npm\\node_modules\\appium\\lib\\main.js"))
	  .withIPAddress("127.0.0.1").usingPort(4723).build();
	  service.start();
	  
	  UiAutomator2Options option = new UiAutomator2Options();
	  option.setDeviceName("samsung SM-M127G");
	  option.setApp("C:\\Users\\HP\\Downloads\\app-debug-1.apk");	  
	  
	  AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), option);
	  
	  driver.quit();
	  service.stop();
	  
  }
}
