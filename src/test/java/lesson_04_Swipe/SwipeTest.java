package lesson_04_Swipe;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import basePackage.BaseTest;
import io.appium.java_client.AppiumBy;

public class SwipeTest extends BaseTest{
  @Test
  public void checkswipe() {
	  
	  driver.findElement(AppiumBy.accessibilityId("Views")).click();
	  driver.findElement(AppiumBy.accessibilityId("Gallery")).click();
	  driver.findElement(AppiumBy.accessibilityId("1. Photos")).click();
	  WebElement firstPhoto = driver.findElement(By.xpath("(//android.widget.ImageView)[1]"));
	  
	 Swipe(firstPhoto, "left");
	  
	  
  }
}
