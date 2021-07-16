package org.Stepdefinition;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class Baseclass {
	public static AndroidDriver<MobileElement> driver;
	public void GudShologgedin() throws InterruptedException, MalformedURLException {
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", "Galaxy A70");
		caps.setCapability("platformName", "Android");
		caps.setCapability("platformVersion", "10");
		caps.setCapability("appPackage", "com.gudsho");
		caps.setCapability("appActivity", "com.gudsho.SplashActivity");
		driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), caps);
		Thread.sleep(3000);
		System.out.println("GudSho is getting launched.....");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		MobileElement MeBtn = (MobileElement) driver.findElementByXPath(
				"//android.widget.FrameLayout[@content-desc=\"Me\"]/android.view.ViewGroup/android.widget.TextView");
		MeBtn.click();
		MobileElement SignIn = (MobileElement) driver.findElementById("com.gudsho:id/tv_user_name");
		SignIn.click();
		MobileElement el8 = (MobileElement) driver.findElementById("com.gudsho:id/mail_otp_toggle");
		el8.click();
		MobileElement el9 = (MobileElement) driver.findElementById("com.gudsho:id/toggle_phone_email_parent_tv");
		el9.sendKeys("naveen.l@contus.in");
		MobileElement el10 = (MobileElement) driver.findElementById("com.gudsho:id/get_otp");
		el10.click();
		Thread.sleep(25000);
		MobileElement el11 = (MobileElement) driver.findElementById("com.gudsho:id/button_verify_otp");
		el11.click();
	}

	public void launchGudSho() throws MalformedURLException, InterruptedException {
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", "Galaxy A70");
		caps.setCapability("platformName", "Android");
		caps.setCapability("platformVersion", "11");
		caps.setCapability("appPackage", "com.gudsho");
		caps.setCapability("appActivity", "com.gudsho.SplashActivity");
		driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), caps);
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}	
	
	public void logindetails() throws InterruptedException {
		MobileElement usemail = (MobileElement) driver.findElementById("com.gudsho:id/mail_otp_toggle");
		usemail.click();
		MobileElement mailid = (MobileElement) driver.findElementById("com.gudsho:id/toggle_phone_email_parent_tv");
		mailid.sendKeys("naveen.l@contus.in");
		MobileElement getotp = (MobileElement) driver.findElementById("com.gudsho:id/get_otp");
		getotp.click();
		Thread.sleep(25000);
		MobileElement vfyotp = (MobileElement) driver.findElementById("com.gudsho:id/button_verify_otp");
		vfyotp.click();
	}
	
	public void scrolldown() {
		Dimension size = driver.manage().window().getSize();
		int Start_x = (int) (size.width * 0.5);
		int Start_y = (int) (size.width * 0.9);
		int end_x = (int) (size.width * 0.5);
		int end_y = (int) (size.width * 0.1);
		TouchAction touch = new TouchAction(driver);
		touch.press(PointOption.point(Start_x, Start_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
				.moveTo(PointOption.point(end_x, end_y)).release().perform();

	}
	public void Shocialpage() {
		MobileElement Shocial = (MobileElement) driver.findElementByXPath("//android.widget.FrameLayout[@content-desc="
				+ "\"SHOCIAL\"]/android.view.ViewGroup/android.widget.TextView");
		Shocial.click();
	}
	
	public void Mepage() {
		MobileElement el2 = (MobileElement) driver.findElementByXPath("//android.widget.FrameLayout"
				+ "[@content-desc=\"Me\"]/android.view.ViewGroup/android.widget.TextView");
		el2.click();
	}
	public void Studiopage() {
		MobileElement el7 = (MobileElement)  driver.findElementByXPath("android.widget.FrameLayout"
				+ "[@content-desc=\"Studios\"]/android.view.ViewGroup/android.widget.TextView");
		el7.click();
	}
    public void watchlist() {
    	MobileElement el2 = (MobileElement) driver.findElementById("com.gudsho:id/tv_my_watch_list");
    	el2.click();
	}
    public void implicit() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	}