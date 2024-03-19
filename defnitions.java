package StepDefnition;

import java.awt.Dimension;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;

import java.net.URL;
import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.remote.DesiredCapabilities;

import TestGroup.BaseClass;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.nativekey.PressesKey;
import io.appium.java_client.android.options.UiAutomator2Options;

import io.appium.java_client.service.local.AppiumDriverLocalService;

import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class defnitions extends BaseClass
{
	AppiumDriverLocalService service;
	//AndroidDriver driver;

	@Given("open the My airports app from the mobile device")
	public void open_the_my_airports_app_from_the_mobile_device() throws InterruptedException, MalformedURLException {
		
		/*
		 service = new AppiumServiceBuilder() .withAppiumJS(new File(
		 "C:\\Users\\shanmukha srinivas\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"
		 )) .withIPAddress("127.0.0.1").usingPort(4723).build();
		
		service.start();
		*/
		
		UiAutomator2Options options = new UiAutomator2Options();
		//options.setDeviceName("Andriod3");
		options.setDeviceName("Andriod Device");

		options.setApp("C:\\Users\\Bhavani\\Downloads\\TestArtifact-20231213T073543Z-001\\TestArtifact\\src\\test\\java\\resources\\3novuatmy.apk");
		
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
		Thread.sleep(20000);
		System.out.println("inside MobileApp");
	}	
	
	@Given("Click on the Guest button in splash screen")
	public void click_on_the_guest_button_in_splash_screen() throws InterruptedException
	{
		System.out.println("Click on Guest Button");
		
		//Thread.sleep(10000);
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"   GUEST\"]")).click();
		
		Thread.sleep(10000);
		driver.findElement(AppiumBy.xpath("//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_allow_foreground_only_button\"]")).click();
		System.out.println("click on the location access");
		
		  
 
 
		    Thread.sleep(5000);  // Adjust the sleep time as needed
 
		    driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView\r\n")).click();
	}
	@Given("User click on the User profile icon on the home screen")
	public void user_click_on_the_user_profile_icon_on_the_home_screen() throws InterruptedException {
		Thread.sleep(5000);
	driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[3]/android.widget.ImageView")).click();
		System.out.println("Click on the User profile picture");
 
	   	}
 
	@Given("User fill in the login details if entered as a guest")
	public void user_fill_in_the_login_details_if_entered_as_a_guest() throws InterruptedException {
		Thread.sleep(5000);
		System.out.println("enter the details");
 
		driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"Email ID\"]")).sendKeys("iotuatproject@gmail.com");
		driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"Enter Password\"]")).sendKeys("IOTuat@123");
		Thread.sleep(2000);
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"SUBMIT\"]")).click();
		Thread.sleep(20000);
	
 
	}
 
		@Given("click on the My profile button")
		public void click_on_the_my_profile_button() throws InterruptedException {
			Thread.sleep(3000);			
			driver.findElement(AppiumBy.xpath("	//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[3]/android.widget.ImageView")).click();
 
		}
	@Given("User click on the General icon in the My Profile page")
	public void user_click_on_the_general_icon_in_the_my_profile_page() throws InterruptedException {
		Thread.sleep(10000);
		driver.findElement(AppiumBy.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.widget.ImageView")).click();
       System.out.println("click on the General icon");
	}
	
	@Given("Click on Teams of Use option")
	public void click_on_teams_of_use_option() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(AppiumBy.xpath("	//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.widget.ImageView")).click();
	}
 
	@Given("User click on the back arrow in the Terms of Use page")
	public void user_click_on_the_back_arrow_in_the_terms_of_use_page() throws InterruptedException {
		
		
		Thread.sleep(5000);
		driver.findElement(AppiumBy.xpath("//android.widget.ImageView")).click();		
 
	}
	@Given("Click on the Login button in splash screen")
	public void click_on_the_login_button_in_splash_screen() throws InterruptedException {
		//android.widget.TextView[@text="LOGIN / SIGN UP | "]
		Thread.sleep(2000);
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"LOGIN / SIGN UP   | \"]")).click();
        
	}

	@Given("Enter the Email and Password in login page")
	public void enter_the_email_and_password_in_login_page() throws InterruptedException {
		System.out.println("enter the details");
		 Thread.sleep(10000);
		driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"Email ID\"]")).sendKeys("iotuatproject@gmail.com");
		driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"Enter Password\"]")).sendKeys("IOTuat@123");
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"SUBMIT\"]")).click();
	}

	@Given("Access the Location")
	public void access_the_location() throws InterruptedException {
		 
	    Thread.sleep(10000);  // Adjust the sleep time as needed
	 
		driver.findElement(AppiumBy.xpath("//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_allow_foreground_only_button\"]")).click();

	    System.out.println("click on the location access");
	}

	@Given("Click on the Flights Icon in the home page")
	public void click_on_the_flights_icon_in_the_home_page() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ScrollView/android.view.ViewGroup/android.widget.HorizontalScrollView[1]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.widget.ImageView")).click();
         
	}

	@Given("Verify the Functionality of the Flights Icon")
	public void verify_the_functionality_of_the_flights_icon() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup")).click();

	}
	
	@When("click on menu button it contains flight icon and it will leads to flights information page")
	public void click_on_menu_button_it_contains_flight_icon_and_it_will_leads_to_flights_information_page() throws InterruptedException {
		driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.Button[3]/android.view.ViewGroup/android.widget.ImageView[2]")).click();
		Thread.sleep(7000);
		driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ImageView")).click();

	    
	}

	@Then("click on back arrow it leads to home screen")
	public void click_on_back_arrow_it_leads_to_home_screen() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ImageView")).click();

	}
	@When("click on the Dropdown list in Flight Information page")
	public void click_on_the_dropdown_list_in_flight_information_page() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"\"]")).click();

	}

	@When("Select the terminal and verify the changes according to the terminal")
	public void select_the_terminal_and_verify_the_changes_according_to_the_terminal() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"KUL - KLIA Terminal 2\"]")).click();
	}
	/*@When("Click on search bar and search with ticket number")
	public void click_on_search_bar_and_search_with_ticket_number() throws InterruptedException {
		Thread.sleep(2000);
		WebElement search = driver.findElement(By.className("android.widget.EditText"));
        search.click();
        search.sendKeys("OD0572");
		//driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"Search Flights by Flight No / City / Airline Name\"]")).sendKeys("OD0572");
		Thread.sleep(5000);
		driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup[4]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup")).click();
		
	}*/
		@When("Click on search bar and search with city name")
		public void click_on_search_bar_and_search_city_name() throws InterruptedException{
			Thread.sleep(5000);
			//driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"Search Flights by Flight No / City / Airline Name\"]")).clear();
		driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"Search Flights by Flight No / City / Airline Name\"]")).click();

		driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"Search Flights by Flight No / City / Airline Name\"]")).sendKeys("delhi");
		Thread.sleep(10000);
		driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup[4]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup")).click();

		}
		@When("Click on search bar and search with airlines")
		public void click_on_search_bar_and_search_airlines() throws InterruptedException{
			Thread.sleep(5000);
			driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"Search Flights by Flight No / City / Airline Name\"]")).clear();

		driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"Search Flights by Flight No / City / Airline Name\"]")).click();

		driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"Search Flights by Flight No / City / Airline Name\"]")).sendKeys("air asia");
		Thread.sleep(10000);
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"AIR ASIA SDN. BHD\"]")).click();
		Thread.sleep(10000);
		driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"AIR ASIA SDN. BHD\"]")).clear();
		//driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup[4]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup")).click();
		//Thread.sleep(5000);
		//driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"Search Flights by Flight No / City / Airline Name\"]")).clear();

		}

@When("Click on the Track my Flight Icon in the flight details page")
public void click_on_the_track_my_flight_icon_in_the_flight_details_page() throws InterruptedException {
   Thread.sleep(5000);
   driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"TRACK MY FLIGHT\"]")).click();
}

@Then("Now click on the {string} Button in the Pop up")
public void now_click_on_the_button_in_the_pop_up(String string) throws InterruptedException {
	Thread.sleep(5000);
	   driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"DONE\"]")).click();
}
		
		@When("Click on the Arrival in Toggle bar user can see accordingly")
		public void click_on_the_arrival_in_toggle_bar_user_can_see_accordingly() throws InterruptedException {
		   Thread.sleep(5000);
		 //android.widget.FrameLayout[@resource-id="android:id/content"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup[1]/android.view.ViewGroup[2]
			driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Arrival\"]")).click();

		}
		@When("click on the flight info page in arrival")
		public void click_on_the_flight_info_page_in_arrival() throws InterruptedException {
			Thread.sleep(5000);
			driver.findElement(AppiumBy.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup")).click();
		}

		@When("Click on the Depature in Toggle bar user can see accordingly")
		public void click_on_the_depature_in_toggle_bar_user_can_see_accordingly() throws InterruptedException {
			   Thread.sleep(2000);
				driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Departure\"]")).click();

		}
		@When("Click on the Get previous Flight button User can see accordingly")
		public void click_on_the_get_previous_flight_button_user_can_see_accordingly() throws InterruptedException {
			Thread.sleep(5000);
			driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Get Previous Flights\"]")).click();

		}
		@Then("User should be landed in the flight details when clicked on any flight in FIDS page")
		public void user_should_be_landed_in_the_flight_details_when_clicked_on_any_flight_in_fids_page() throws InterruptedException {
		   Thread.sleep(10000);
			driver.findElement(AppiumBy.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup")).click();

		}
		@Then("click on the back arrow in the Flight details page")
		public void click_on_the_back_arrow_in_the_flight_details_page() throws InterruptedException {
			Thread.sleep(5000);
			driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ImageView")).click();
 
		}
		@Then("click on the Track my flight icon in the flight information page")
		public void click_on_the_track_my_flight_icon_in_the_flight_information_page() throws InterruptedException 
		{
			        Thread.sleep(2000);
			
					driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"TRACK MY FLIGHT\"]")).click();

		      
		

		}

		@When("Click on the Essential&Services")
		public void click_on_the_essential_services() throws InterruptedException {
			Thread.sleep(2000);
			driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ScrollView/android.view.ViewGroup/android.widget.HorizontalScrollView[1]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[3]/android.widget.ImageView")).click();

		}
		@Then("click on the Add to Favourites button and verify its functionality in  Essentials & servicespage")
		public void click_on_the_add_to_favourites_button_and_verify_its_functionality_in_essentials_servicespage() throws InterruptedException {
			Thread.sleep(5000);
			driver.findElement(AppiumBy.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ImageView")).click();
		}

		@Then("click on the rating button and verify its functionality in Essentials & servicespage")
		public void click_on_the_rating_button_and_verify_its_functionality_in_essentials_servicespage() throws InterruptedException {
			Thread.sleep(5000);
			driver.findElement(AppiumBy.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[11]/android.view.ViewGroup[5]/android.widget.ImageView")).click();

		}

		@Then("Verify the Back arrow functionality in Essentials & servicespage")
		public void verify_the_back_arrow_functionality_in_essentials_servicespage() throws InterruptedException {
			Thread.sleep(5000);
			driver.findElement(AppiumBy.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ImageView")).click();

		}


@Then("Click on the Back Arrow button in Essentials & servicespage")
public void click_on_the_back_arrow_button_in_essentials_servicespage() throws InterruptedException {
			Thread.sleep(5000);
			driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ImageView")).click();
		
}
		
		
		@When("Click on the dropdown")
		public void click_on_the_dropdown() throws InterruptedException {
			Thread.sleep(5000);
			driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"\"]")).click();

		}

		@Then("Change the terminal in the drop down of Essentials & servicespage")
		public void change_the_terminal_in_the_drop_down_of_essentials_servicespage() throws InterruptedException {
			Thread.sleep(2000);
			driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"KUL Terminal 2\"]")).click();

		}

		@Then("Click on the Search bar")
		public void click_on_the_search_bar() throws InterruptedException {
		   Thread.sleep(5000);
		 //android.widget.EditText[@text="Search for Essential & Services"]
			driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"Search for Essential & Services\"]")).sendKeys("celcom");

		}

		@When("click on any POI in the Essentials & servicespage")
		public void click_on_any_poi_in_the_essentials_servicespage() throws InterruptedException {
			Thread.sleep(5000);
			driver.findElement(AppiumBy.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup")).click();

		}
		@Then("click on the Share button and verify its functionality in Essentials & servicespage")
		public void click_on_the_share_button_and_verify_its_functionality_in_essentials_servicespage() throws InterruptedException {
			//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.ImageView
			Thread.sleep(5000);
			driver.findElement(AppiumBy.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.ImageView")).click();
			Thread.sleep(10000);
			driver.findElement(AppiumBy.xpath("//android.widget.ScrollView[@resource-id=\"android:id/contentPanel\"]")).click();
		}

		
		@Then("Click on the Stores Icon in the home page")
		public void click_on_the_stores_icon_in_the_home_page() throws InterruptedException {
			Thread.sleep(2000);
			driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ScrollView/android.view.ViewGroup/android.widget.HorizontalScrollView[1]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.widget.ImageView")).click();

		}
		
		@Then("change the terminal and Verify the changes")
		public void change_the_terminal_and_verify_the_changes() throws InterruptedException {
			Thread.sleep(3000);
			driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"KUL Terminal 2\"]")).click();

		}
		@Then("Click on the Search bar in the Stores page")
		public void click_on_the_search_bar_in_the_stores_page() throws InterruptedException {
			Thread.sleep(2000);
			driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"Search for Stores\"]")).sendKeys("airside shoppe");

		    
		}
		
		@Then("click on any POI in the Stores page")
		public void click_on_any_poi_in_the_stores_page() throws InterruptedException {
			Thread.sleep(7000);
			driver.findElement(AppiumBy.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup")).click();

		}
		@Then("click on the Add to Favourites button and verify its functionality in store page")
		public void click_on_the_add_to_favourites_button_and_verify_its_functionality_in_store_page() throws InterruptedException {
			Thread.sleep(2000);
			driver.findElement(AppiumBy.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ImageView")).click();

		}

		@Then("click on the Share button and verify its functionality in store page")
		public void click_on_the_share_button_and_verify_its_functionality_in_store_page() throws InterruptedException {
		    Thread.sleep(2000);
		    driver.findElement(AppiumBy.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]")).click();
		    Thread.sleep(5000);
			driver.findElement(AppiumBy.xpath("//android.widget.ScrollView[@resource-id=\"android:id/contentPanel\"]")).click();
		}

		@Then("click on the rating button and verify its functionality in store page")
		public void click_on_the_rating_button_and_verify_its_functionality_in_store_page() throws InterruptedException {
		    Thread.sleep(2000);
		    WebElement five =  driver.findElement(AppiumBy.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[11]/android.view.ViewGroup[5]/android.widget.ImageView"));
		    WebElement four = driver.findElement(AppiumBy.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[11]/android.view.ViewGroup[4]/android.widget.ImageView"));
		    WebElement three = driver.findElement(AppiumBy.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[11]/android.view.ViewGroup[3]/android.widget.ImageView"));
		    WebElement Two = driver.findElement(AppiumBy.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[11]/android.view.ViewGroup[2]/android.widget.ImageView"));
		    WebElement one = driver.findElement(AppiumBy.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[11]/android.view.ViewGroup[1]/android.widget.ImageView"));


		    /*if(five.isSelected()||four.isSelected() )
		    {
		    	//five.click();
		    	Thread.sleep(2000);
		    	four.click();
		    	Thread.sleep(2000);
		    }
		    else if(three.isSelected() || Two.isSelected() || one.isSelected())
		    {
		    	three.click();
		    	driver.findElement(AppiumBy.xpath("//android.widget.EditText")).sendKeys("Improve");
		    	driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"SUBMIT\"]")).click();
		    	Thread.sleep(2000);
		    	Two.click();
		    	driver.findElement(AppiumBy.xpath("//android.widget.EditText")).sendKeys("Bad");
		    	driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"SUBMIT\"]")).click();
		    	Thread.sleep(2000);
		    	driver.findElement(AppiumBy.xpath("//android.widget.EditText")).sendKeys("worst");
		    	driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"SUBMIT\"]")).click();
		    }
		    WebElement submitButton = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"SUBMIT\"]"));*/
		    // Identify the selected star
		    WebElement selectedStar = null;
		    if (five.isSelected()) {
		        selectedStar = five;
		    } else if (four.isSelected()) {
		        selectedStar = four;
		    } else if (three.isSelected()) {
		        selectedStar = three;
		    } else if (Two.isSelected()) {
		        selectedStar = Two;
		    } else if (one.isSelected()) {
		        selectedStar = one;
		    }
		
		    if (selectedStar != null) {
		        if (selectedStar.equals(five)&&selectedStar.equals(four)) {
		            selectedStar.click();
		            selectedStar.click();		          
		        } 
		        else if (selectedStar.equals(three)&&selectedStar.equals(Two) && selectedStar.equals(one)) {
		            // Handle actions for 3*
		            // Assuming there is a pop-up block
		            driver.findElement(AppiumBy.xpath("//android.widget.EditText")).sendKeys("Disadvantage 1, Disadvantage 2");
		            driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"SUBMIT\"]")).click();
		        }
		    }
		 
		}
		@Then("Verify the Back arrow functionality in store page")
		public void verify_the_back_arrow_functionality_in_store_page() throws InterruptedException {
			Thread.sleep(5000);
			driver.findElement(AppiumBy.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ImageView")).click();
			
			

		}

		@Then("Click on the Back Arrow button to navigate home screen from store")
		public void click_on_the_back_arrow_button_to_navigate_home_screen_from_store() throws InterruptedException {
			Thread.sleep(5000);
			driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ImageView")).click();
		}
		@Then("Click on the Back Arrow button in Dining page")
		public void click_on_the_back_arrow_button_in_dining_page() throws InterruptedException {
			Thread.sleep(5000);
			driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ImageView")).click();

		}
		@Then("Click on the Dining icon")
		public void click_on_the_dining_icon() throws InterruptedException {
			Thread.sleep(5000);
			driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Dining\"]")).click();
		}
		@Then("Click on the Search bar in Dining icon")
		public void click_on_the_search_bar_in_dining_icon() throws InterruptedException {
			Thread.sleep(5000);
			driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"Search for Dining\"]")).sendKeys("ahh yum");
		}
		
		@Then("click on any POI in the dining page")
		public void click_on_any_poi_in_the_dining_page() throws InterruptedException {
			Thread.sleep(3000);
			driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"AHH YUM\"]")).click();
			Thread.sleep(3000);

		}
		
//By backArrowLocator = By.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ImageView");
		public void scrollDown1() {
		    int startX = driver.manage().window().getSize().width / 2;
		    int startY = driver.manage().window().getSize().height / 4;
		    int endY = driver.manage().window().getSize().height * 3 / 4;

		    TouchAction touchAction = new TouchAction((PerformsTouchActions) driver);
		    touchAction.press(PointOption.point(startX, startY))
		            .moveTo(PointOption.point(startX, endY))
		            .release()
		            .perform();
		}

		@Then("Verify the Scroll Down functionality in Dining page")
		public void verifyScrollDownFunctionalityInDiningPage() throws InterruptedException {
		    By targetElementLocator = By.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ImageView");

		    // Check if scrolling is needed
		    if (isScrollable(targetElementLocator)) {
		        // Scroll down
		        scrollDown1();

		        // Wait for a moment to ensure the scroll completes
		        // You may replace this with a more robust wait strategy
		        try {
		            Thread.sleep(10000);
		        } catch (InterruptedException e) {
		            e.printStackTrace();
		        }
		    }
		    }
		public boolean isScrollable(By by) {
		    try {
		        // Check if the element is displayed
		        if (driver.findElement(by).isDisplayed()) {
		            return false;  // No need to scroll, the element is already visible
		        }
		    } catch (org.openqa.selenium.NoSuchElementException e) {
		        // Element is not present, indicating the need to scroll
		        return true;
		    }
		    return true;
		}
		  

			    

		@Then("click on the Add to Favourites button and verify its functionality")
		public void click_on_the_add_to_favourites_button_and_verify_its_functionality() throws InterruptedException {
			driver.findElement(AppiumBy.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ImageView")).click();


		}
		@Then("click on the Share button and verify its functionality")
		public void click_on_the_share_button_and_verify_its_functionality() throws InterruptedException {
			Thread.sleep(5000);
			driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Share']")).click();
            Thread.sleep(5000);
            driver.findElement(AppiumBy.xpath("//android.widget.ScrollView[@resource-id=\"android:id/contentPanel\"]")).click();
		}
		
		
		
		/*@Then("click on the rating button and verify its functionality")
		public void click_on_the_rating_button_and_verify_its_functionality() throws InterruptedException 
		{
			Thread.sleep(2000);
		    driver.findElement(By.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[11]/android.view.ViewGroup[5]/android.widget.ImageView")).click();
		    Thread.sleep(3000);
		}*/
 
		
		@Then("click on the rating button and verify its functionality for the Dining page")
		public void click_on_the_rating_button_and_verify_its_functionality_for_the_dining_page() throws InterruptedException {
			boolean isRatingVisible = isElementPresent(By.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[10]/android.view.ViewGroup[5]/android.widget.ImageView"));
			   if (!isRatingVisible) {
			        scrollDown1();
			    }
			    Thread.sleep(5000);

			    driver.findElement(By.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[11]/android.view.ViewGroup[5]")).click();
			    }
		
		public boolean isElementPresent(By by) {
		    try {
		        driver.findElement(by);
		        return true;
		    } catch (org.openqa.selenium.NoSuchElementException e) {
		        return false;
		    }
		}
		@Then("Verify the Back arrow functionality in Dining page")
		public void verify_the_back_arrow_functionality_in_dining_page() throws InterruptedException {
		    Thread.sleep(5000);
		    driver.findElement(AppiumBy.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ImageView")).click();
		}
		
		@When("Click on the righ arrow in the home page")
		public void click_on_the_righ_arrow_in_the_home_page() throws InterruptedException {
		   Thread.sleep(5000);
			driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ImageView")).click();

		}

		@Then("Click on the Transport Icon")
		public void click_on_the_transport_icon() throws InterruptedException {
		   Thread.sleep(2000);
			driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Transport\"]")).click();

		}
		@Then("Verify that Guides, E-hailing, own car, bus and train icons should be present in transportation page")
		public void verify_that_guides_e_hailing_own_car_bus_and_train_icons_should_be_present_in_transportation_page() throws InterruptedException {
		    Thread.sleep(5000);
		    WebElement guides = driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[6]/android.view.ViewGroup[1]/android.widget.ImageView"));
		    WebElement ehailing = driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[6]/android.view.ViewGroup[1]/android.widget.ImageView"));
		    WebElement owncar = driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[6]/android.view.ViewGroup[3]/android.widget.ImageView"));
		    WebElement busandtrain = driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[6]/android.view.ViewGroup[4]/android.widget.ImageView"));
		   if(guides.isDisplayed()&& ehailing.isDisplayed()&& owncar.isDisplayed()&&busandtrain.isDisplayed())
		   {
			   System.out.println("All the Icons are displayed");
		   }
		   else
		   {
			   System.out.println("All the Icons are not Displayed");
		   }
		}		
		//android.widget.FrameLayout[@resource-id="android:id/content"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[6]/android.view.ViewGroup[1]/android.widget.ImageView
		//android.widget.TextView[@text="E-hailing"]
		
		@Then("Click on the Guides icon")
		public void click_on_the_guides_icon() throws InterruptedException {
			Thread.sleep(2000);
			driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[6]/android.view.ViewGroup[1]/android.widget.ImageView")).click();

		}

		@Then("Verify that E-hailing text should present in Guides page")
		public void verify_that_e_hailing_text_should_present_in_guides_page() throws InterruptedException {
			Thread.sleep(2000);
			WebElement text = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"E-hailing\"]"));
			if(text.isDisplayed())
			{
				System.out.println("E-hailing text is diplayed in the guides page");
			}
			else 
			{
				System.out.println("E-hailing text is not displayed in the guides page");
			}

		}
		@Then("Verify the presence of Note in Arrival flight details page")
		public void verify_the_presence_of_note_in_arrival_flight_details_page() throws InterruptedException {
			Thread.sleep(2000);
		    WebElement note = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Note: Please verify the tag number on your luggage before retrieving them\"]"));
		    if(note.isDisplayed())
		    {
		    	System.out.println("Note is visible ");
		    }
		    else
		    {
		    	System.out.println("Note is Not Visible");
		    }
		}
		@Then("Verify that presence of no flight information available")
		public void verify_that_presence_of_no_flight_information_available() throws InterruptedException {
			Thread.sleep(10000);
		    WebElement flightinfo = driver.findElement(AppiumBy.xpath("(//android.widget.TextView[@text=\"FLIGHT DEPART\"])[1]"));
		    WebElement flightinfo2 = driver.findElement(AppiumBy.xpath("(//android.widget.TextView[@text=\"LAST BAG\"])[1]"));
		    WebElement flightinfo3 = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=/\"FLIGHT DEPART/\"])[1]"));

		    if(flightinfo.isDisplayed()|| flightinfo2.isDisplayed() || flightinfo3.isDisplayed())
		    {
		    	System.out.println("Flight Info is available  ");
		    }
		    else
		    {
		    	System.out.println("No Flight info is Not Available");
		    }
		}
		@Then("Click on the Back arrow in the transport Information page")
		public void click_on_the_back_arrow_in_the_transport_information_page() throws InterruptedException {
			Thread.sleep(2000);
		    driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ImageView")).click();

		}
		@Then("Enter the Destination")
		public void enter_the_destination() throws InterruptedException {
			Thread.sleep(5000);
			driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"ORIGIN\"]")).click();
            Thread.sleep(2000);
		 
			
			driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"Search\"]")).sendKeys("Kangar");
			driver.findElement(AppiumBy.xpath("//android.widget.EditText[@hint=\"Search\"]")).click();
			Thread.sleep(2000);
			driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Kangar, Perlis, Malaysia\"]")).click();
			Thread.sleep(2000);
			
			//driver.findElement(AppiumBy.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.HorizontalScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup")).click();

			//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.HorizontalScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup

		}

@Then("Click on the Toggle button in the Transport page")
public void click_on_the_toggle_button_in_the_transport_page() throws InterruptedException {
    Thread.sleep(2000);
	driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.ImageView")).click();

}
@Then("Click on the Bus and Train Button in the Transport page")
public void click_on_the_bus_and_train_button_in_the_transport_page() throws InterruptedException {
    Thread.sleep(2000);
    driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[6]/android.view.ViewGroup[4]/android.widget.ImageView")).click();
}
@Then("Click on the OWN car button")
public void click_on_the_own_car_button() throws InterruptedException {
	Thread.sleep(2000);
	driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[6]/android.view.ViewGroup[3]/android.widget.ImageView")).click();

	
}
@Then("Click on the e-hailing button")
public void click_on_the_e_hailing_button() throws InterruptedException {
	Thread.sleep(2000);
	driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[6]/android.view.ViewGroup[2]/android.widget.ImageView")).click();
}
@Then("Click on the Guide Icon Button")
public void click_on_the_guide_icon_button() throws InterruptedException {
	Thread.sleep(2000);
	driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[6]/android.view.ViewGroup[1]/android.widget.ImageView")).click();
}
@When("Click on the right and left arrows in the home page")
public void click_on_the_right_and_left_arrows_in_the_home_page() throws InterruptedException {
	Thread.sleep(5000);
	WebElement flight = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Flights\"]"));
	WebElement dining = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Flights\"]"));
	WebElement EssentialService = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Essential & Services\"]"));
	WebElement KULTerminal = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"KUL Terminal 1 Shuttle Bus\"]"));
	WebElement stores = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Stores\"]"));
	WebElement CustomerFeedback = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Stores\"]"));
	if(flight.isDisplayed()&& dining.isDisplayed() && EssentialService.isDisplayed() && KULTerminal.isDisplayed() && stores.isDisplayed() && CustomerFeedback.isDisplayed() )
	{
		System.out.println("Flights icon is Displayed");
		System.out.println("dining icon is Displayed");
		System.out.println("EssentialService icon is Displayed ");
		System.out.println("KUL terminals icon is Displayed");
		System.out.println("Stored icon is Displayed");
		System.out.println("CustomerFeedBack is Displayed");
		
	}
	Thread.sleep(5000);
	driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ImageView")).click();
	Thread.sleep(2000);
	WebElement shopping = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Online Shopping\"]"));
	WebElement transport = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Transport\"]"));
	WebElement lounge = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Lounge\"]"));
	WebElement bookingservice = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Booking Services\"]"));
	WebElement hotels= driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Hotels\"]"));
	WebElement bureaudechange= driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Bureau de Change\"]"));
	if(shopping.isDisplayed()&& transport.isDisplayed() && lounge.isDisplayed() && bookingservice.isDisplayed() && hotels.isDisplayed() && bureaudechange.isDisplayed() )
	{
		Thread.sleep(2000);
		System.out.println("shopping icon is Displayed");
		System.out.println("transport icon is Displayed");
		System.out.println("lounge icon is Displayed ");
		System.out.println("bookingservice icon is Displayed");
		System.out.println("hotels icon is Displayed");
		System.out.println("bureaudechange is Displayed");
		
	}
	Thread.sleep(5000);
	driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.ImageView")).click();
	Thread.sleep(2000);
	WebElement clinic = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Clinic\"]"));
	WebElement transfer= driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Transfer Counter\"]"));
	WebElement airlineticket = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Airline Ticketing Centre\"]"));
	WebElement reclaim= driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Baggage Reclaim\"]"));
	WebElement locker= driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Baggage Locker\"]"));
	WebElement informationcenter= driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Information Centre\"]"));
	if(clinic.isDisplayed()&& transfer.isDisplayed() && airlineticket.isDisplayed() && reclaim.isDisplayed() && locker.isDisplayed() && informationcenter.isDisplayed() )
	{
		Thread.sleep(2000);
		System.out.println("clinic icon is Displayed");
		System.out.println("transfer icon is Displayed");
		System.out.println("airlineticket icon is Displayed ");
		System.out.println("reclaim icon is Displayed");
		System.out.println("locker icon is Displayed");
		System.out.println("informationcenter is Displayed");
		
	}
	Thread.sleep(2000);
	driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ImageView")).click();
	Thread.sleep(2000);
	driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ImageView")).click();
	Thread.sleep(2000);
	
	
}
@When("Scroll the Right in home Screen")
public void scroll_the_right_in_home_screen() throws Exception {
        scrollRight();
	    Thread.sleep(5000);  // Adjust the sleep time as needed
	}


public void scrollRight() {
	/* // Perform a scroll action to scroll right
    int startY = driver.manage().window().getSize().getHeight() / 2;
    int startX = driver.manage().window().getSize().getWidth() * 3 / 4;
    int endX = driver.manage().window().getSize().getWidth() / 4;

    TouchAction touchAction = new TouchAction((PerformsTouchActions) driver);
    touchAction.longPress(PointOption.point(startX, startY))
               .moveTo(PointOption.point(endX, startY))
               .release()
               .perform();*/
	//new TouchAction(driver).longPress(250, 1200).moveTo(900, 1200).release().perform();
}

@Then("Verify the Presence Flights Tracking  Carousel Card in the home Screen")
public void verify_the_presence_flights_tracking_carousel_card_in_the_home_screen() {
   WebElement flighttrackcard = driver.findElement(By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ScrollView/android.view.ViewGroup/android.widget.HorizontalScrollView[2]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView"));
   
 if(flighttrackcard.isDisplayed())
 {
	 System.out.println("Flight Card is displayed in the home screen");
 }
 else
 {
	 System.out.println("Flight track card is not visible ");
 }
}
		

@Then("close the mobile app")
	public void close_the_mobile_app() throws InterruptedException {
       Thread.sleep(2000);
		driver.quit();
		//service.stop();
 
	}
@Given("Verify the menu button is visible")
public void verify_the_menu_button_is_visible() throws InterruptedException {
    Thread.sleep(5000);
	WebElement menu = driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.Button[3]/android.view.ViewGroup/android.widget.ImageView[1]"));
    if(menu.isDisplayed())
    {
    	System.out.println("Menu is Visible ");
    }
    else
    {
    	System.out.println("Menu is Not Visible");
    }
}

@When("Click on the Menu Button")
public void click_on_the_menu_button() throws InterruptedException {
	Thread.sleep(10000);
	driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.Button[3]/android.view.ViewGroup/android.widget.ImageView[1]")).click();
	
}

@Then("menu should be displayed when user clicked on the menu button")
public void menu_should_be_displayed_when_user_clicked_on_the_menu_button() throws InterruptedException {
	Thread.sleep(5000);
	WebElement menuButton = driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup"));
    if(menuButton.isDisplayed())
    {
    	System.out.println("Menu information is Displayed");
    }
    else 
    {
    	System.out.println("Menu information is Not Displayed");

    }
}

@Then("click on the Special assistance button in the Menu and Verify the Button Fnctionality")
public void click_on_the_special_assistance_button_in_the_menu_and_verify_the_button_fnctionality() throws InterruptedException {
	Thread.sleep(10000);
	driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]")).click();

}
@Then("Click on the Flights Button in the Menu and Verify its Functionality")
public void click_on_the_flights_button_in_the_menu_and_verify_its_functionality() throws InterruptedException {
	Thread.sleep(10000);
	driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='FLIGHTS']")).click();

}

@When("click on the Promotions button in the Menu and Verify the Button Fnctionality")
public void click_on_the_promotions_button_in_the_menu_and_verify_the_button_fnctionality() throws InterruptedException {
	Thread.sleep(10000);
	driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='PROMOTIONS']")).click();

}

@When("Click on back arrow button to get menu button")
public void click_on_back_arrow_button_to_get_menu_button() throws InterruptedException {
	Thread.sleep(10000);
	driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ImageView")).click();

}
@Then("Verify the Screen is visible")
public void verify_the_screen_is_visible() throws InterruptedException {
    Thread.sleep(10000);
    WebElement screen = driver.findElement(AppiumBy.xpath("//android.webkit.WebView"));
    if(screen.isDisplayed())
    {
    	System.out.println("Screen Visible");
    }
}


@Then("click on the Shopping button in the Menu and Verify the Button Fnctionality")
public void click_on_the_shopping_button_in_the_menu_and_verify_the_button_fnctionality() throws InterruptedException {
	Thread.sleep(10000);
	driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='ONLINE SHOPPING']")).click();

}

@Then("click on the General button in the Menu and Verify the Button Fnctionality")
public void click_on_the_general_button_in_the_menu_and_verify_the_button_fnctionality() throws InterruptedException {
	Thread.sleep(5000);
	driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='GENERAL']")).click();
	Thread.sleep(5000);
	driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ImageView")).click();


}

@Then("click on the My Profile button in the Menu and Verify the Button Fnctionality")
public void click_on_the_my_profile_button_in_the_menu_and_verify_the_button_fnctionality() throws InterruptedException {
	Thread.sleep(10000);
	driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='MY PROFILE']")).click();

}

@When("Verify that keyinfo button should be present in Menu page")
public void verify_that_keyinfo_button_should_be_present_in_menu_page() throws InterruptedException {
	Thread.sleep(5000);
	WebElement keyInfo = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='KEY INFO']"));
	if(keyInfo.isDisplayed())
	{
		System.out.println("KeyInfo button is visible");
	}
	else
	{
		System.out.println("KeyInfo button is not visible");

	}

}

@Then("click the Key info Icon in the Menu")
public void click_the_key_info_icon_in_the_menu() throws InterruptedException {
	Thread.sleep(5000);
	driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='KEY INFO']")).click();
}

@Then("Verify that Back arrow should be present in Keyinfo landing page")
public void verify_that_back_arrow_should_be_present_in_keyinfo_landing_page() throws InterruptedException {
    Thread.sleep(5000);
    driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.widget.ImageView")).click();
    
}

@Then("Click the Back arrow in the Key info page and Verify the Back arrow Functionality")
public void click_the_back_arrow_in_the_key_info_page_and_verify_the_back_arrow_functionality() throws InterruptedException {
    Thread.sleep(5000);
    driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.widget.ImageView")).click();
}

@When("Click on the terminal and change the terminal to Klia2")
public void click_on_the_terminal_and_change_the_terminal_to_klia2() throws InterruptedException {
    Thread.sleep(5000);
    driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"\"]")).click();
    Thread.sleep(5000);
    driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"KUL Terminal 2\"]")).click();
}

@Then("Click on  the FAQ in the Key info landing page")
public void click_on_the_faq_in_the_key_info_landing_page() throws InterruptedException {
 Thread.sleep(5000);
 driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"FAQ\"]")).click();
}
@Then("Click on  the Transportation   icon in the Key info landing page")
public void click_on_the_transportation_icon_in_the_key_info_landing_page() throws InterruptedException {
    Thread.sleep(5000);
    driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Transportation\"]")).click();
    Thread.sleep(5000);
    driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.widget.ImageView")).click();
}

@Then("Click on the Facilities icon in the Key info landing page")
public void click_on_the_facilities_icon_in_the_key_info_landing_page() throws InterruptedException {
   Thread.sleep(5000);
   driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Facilities\"]")).click();
   Thread.sleep(5000);
   driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.widget.ImageView")).click();
}

@When("Click on Butterfly effect icon in the Key info landing page")
public void click_on_butterfly_effect_icon_in_the_key_info_landing_page() throws InterruptedException {
   Thread.sleep(5000);
   driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Facilities\"]")).click();
   Thread.sleep(5000);
   driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.widget.ImageView")).click();
}

@When("Click on Regulations icon in the Key info landing page")
public void click_on_regulations_icon_in_the_key_info_landing_page() throws InterruptedException {
    Thread.sleep(5000);
    driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Regulations\"]")).click();
    Thread.sleep(5000);
    driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.widget.ImageView")).click();
}
@When("Verify that search bar should be present in keyinfo landing page")
public void verify_that_search_bar_should_be_present_in_keyinfo_landing_page() throws InterruptedException {
   Thread.sleep(5000);
   driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"Ask a Question\"]")).click();
}

@Then("Verify that user Click on the search bar  and type the any keyword in searchbar,and able to see the keyword in QA")
public void verify_that_user_click_on_the_search_bar_and_type_the_any_keyword_in_searchbar_and_able_to_see_the_keyword_in_qa() throws InterruptedException {
	Thread.sleep(5000);
	   driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"Ask a Question\"]")).sendKeys("wifi");
	   Thread.sleep(5000);
	   driver.findElement(AppiumBy.xpath("//android.widget.ScrollView"));
}

@When("Click the Home Icon in the Navigation Bar and Verify the Button Functionality")
public void click_the_home_icon_in_the_navigation_bar_and_verify_the_button_functionality() throws InterruptedException {
    Thread.sleep(5000);
    driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"HOME\"]")).click();
}




@When("Click the keyinfo icon on the navigation bar and verify the functionality")
public void click_the_keyinfo_icon_on_the_navigation_bar_and_verify_the_functionality() throws InterruptedException {
    Thread.sleep(5000);
    driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"KEY INFO\"]")).click();
}

@When("Click the EZPaz Button in the Navigation Bar and Verify the Button Functionality")
public void click_the_ez_paz_button_in_the_navigation_bar_and_verify_the_button_functionality() throws InterruptedException {
   Thread.sleep(5000);
   driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"EZPaz\"]")).click();
   //Thread.sleep(5000);
   //driver.findElement(AppiumBy.xpath("//android.widget.Button[@resource-id=\"klia.mahb.ios:id/dismiss\"]")).click();

}

@When("click the Maps Button in the Navigation Bar and Verify the Button Functionality")
public void click_the_maps_button_in_the_navigation_bar_and_verify_the_button_functionality() throws InterruptedException {
    Thread.sleep(5000);
    driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"MAPS\"]")).click();

}
@When("Click on the POI in the dining page")
public void click_on_the_poi_in_the_dining_page() throws InterruptedException {
    Thread.sleep(5000);
    driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"4FINGERS CRISPY CHICKEN\"]")).click();
}

@When("Verify that Take Me Theres button is present in Poi details page")
public void verify_that_take_me_theres_button_is_present_in_poi_details_page() throws InterruptedException {
    Thread.sleep(5000);
    driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Take Me There\"]")).click();
}
//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]
//android.widget.Button[@resource-id="android:id/button1"]
//android.widget.Button[@resource-id="klia.mahb.ios:id/level1"]
@When("User Clicked on the Way finding button in the Maps Page then User should be Navigated to the page where user can able to Setup the Route Map")
public void user_clicked_on_the_way_finding_button_in_the_maps_page_then_user_should_be_navigated_to_the_page_where_user_can_able_to_setup_the_route_map() throws InterruptedException {
   Thread.sleep(5000);
   driver.findElement(AppiumBy.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]")).click();
   Thread.sleep(5000);
   driver.findElement(AppiumBy.xpath("//android.widget.Button[@resource-id=\"android:id/button1\"]")).click();
}

@Then("Verify that User should be Able to enter the Required starting and Ending points to see the Indoor route map")
public void verify_that_user_should_be_able_to_enter_the_required_starting_and_ending_points_to_see_the_indoor_route_map() throws InterruptedException {
    Thread.sleep(15000);
    driver.findElement(AppiumBy.xpath("//android.widget.Button[@resource-id=\"klia.mahb.ios:id/level1\"]")).click();
}
@Then("Verify the Presence of EZPaz Button card on the Home Screen")
public void verify_the_presence_of_ez_paz_button_carousel_card_on_the_home_screen() throws InterruptedException {
	Thread.sleep(5000);
    WebElement ezpaz = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"EZPaz\"]"));
    if(ezpaz.isDisplayed())
    {
    	System.out.println("Ezpaz is displayed");
    }
}

@Then("Once Entered into the Home Screen Click the EZpaz Button and Verify the Functionality")
public void once_entered_into_the_home_screen_click_the_e_zpaz_button_and_verify_the_functionality() throws InterruptedException {
   Thread.sleep(5000);
   driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"EZPaz\"]")).click();
}

@Then("Verify the presence of back arrow in EZPaz landing page")
public void verify_the_presence_of_back_arrow_in_ez_paz_landing_page() throws InterruptedException {
	Thread.sleep(5000);
    driver.findElement(AppiumBy.xpath("//android.widget.Button[@resource-id=\"klia.mahb.ios:id/dismiss\"]")).click();
	Thread.sleep(5000);
    /*WebElement backarrow = driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.TextView"));
    if(backarrow.isDisplayed())
    {
       System.out.println("Back Arrow is Visible");
    }*/
    
}

@Then("Verify that if user click on back arrow it should navigate to Home screen")
public void verify_that_if_user_click_on_back_arrow_it_should_navigate_to_home_screen() throws InterruptedException {
    Thread.sleep(5000);
    driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.TextView")).click();
    Thread.sleep(5000);
    driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.TextView")).click();
    
}
@Then("Verify that User should be Navigated to the EZPaz Suggestions page")
public void verify_that_user_should_be_navigated_to_the_ez_paz_suggestions_page() throws InterruptedException {
    Thread.sleep(5000);
    driver.findElement(AppiumBy.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup")).click();
}
@Then("Verify that Note should be Present In EZPaz enrolment page")
public void verify_that_note_should_be_present_in_ez_paz_enrolment_page() throws InterruptedException {
    Thread.sleep(5000);
    WebElement note = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Note : \"]"));
    if(note.isDisplayed())
    {
    	System.out.println("Note is Visible");
    }
    else
    {
    	System.out.println("Not Visible ");
    }
}

@Then("Verify that user should be landed in the Selfie page when continue Button is clicked in the EZPaz suggestions page")
public void verify_that_user_should_be_landed_in_the_selfie_page_when_continue_button_is_clicked_in_the_ez_paz_suggestions_page() throws InterruptedException {
   Thread.sleep(5000);
   driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"CONTINUE\"]")).click();
   Thread.sleep(5000);
   WebElement selfiePage =  driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup"));
   if(selfiePage.isDisplayed())
   {
	   System.out.println("Selfie page is Visible");
   }
   else
   {
	   System.out.println("Not visible");
   }
   Thread.sleep(5000);
   driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ImageView")).click();
   Thread.sleep(5000);
   driver.findElement(AppiumBy.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ImageView")).click();
}

@Then("click the Get Started button on the EZpaz landing Page and Verify the Functionality")
public void click_the_get_started_button_on_the_e_zpaz_landing_page_and_verify_the_functionality() throws InterruptedException {
    Thread.sleep(5000);
    driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"GET STARTED\"]")).click();
}
@Then("Click on Logout")
public void click_on_logout() throws InterruptedException 
	{
		Thread.sleep(5000);
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Logout\"]")).click();
		Thread.sleep(5000);
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Yes\"]")).click();
	}
@When("Click on UserProfile")
public void click_on_user_profile() throws InterruptedException {
   Thread.sleep(5000);
   driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Automation\"]")).click();
}

@When("Verify the functionality of Pop on the EZpaz Landing Page")
public void verify_the_functionality_of_pop_on_the_e_zpaz_landing_page() throws InterruptedException {
   Thread.sleep(5000);
   
   WebElement popup = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@resource-id=\"text1\"]"));
   if (popup.isDisplayed()) {
	System.out.println("POP up is visible");
}
}

@Then("Verify the Functionality of the MY Status button on the main page if no Enrolments Started")
public void verify_the_functionality_of_the_my_status_button_on_the_main_page_if_no_enrolments_started() throws InterruptedException {
    Thread.sleep(5000);
    driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"MY STATUS\"]")).click();
    Thread.sleep(5000);
    driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.TextView")).click();
}
//android.widget.TextView[@text="Note : "]

@Then("Click the New EZPaz button and Verify the Functionality")
public void click_the_new_ez_paz_button_and_verify_the_functionality() throws InterruptedException {
	 Thread.sleep(5000);
	    driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"NEW TOKEN\"]")).click();
	    Thread.sleep(5000);
	    driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"Enter Your Preferred Name\"]")).sendKeys("IOT");
}

@Then("Click the Submit button in the Pop and Verify the Functionality")
public void click_the_submit_button_in_the_pop_and_verify_the_functionality() throws InterruptedException {
	 Thread.sleep(5000);
	    driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"SUBMIT\"]")).click();
}

@Given("Move the Finger in the Center of the Home Screen from Right to Left to See the Other Icons")
public void move_the_finger_in_the_center_of_the_home_screen_from_right_to_left_to_see_the_other_icons() throws InterruptedException {
	Thread.sleep(5000);
	WebElement elementToDrag = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Dining\"]")) ;
	int startX = elementToDrag.getLocation().getX();
    int startY = elementToDrag.getLocation().getY();

    // Calculate the ending coordinates for the drag (in this example, dragging to the left)
    int endX = startX - (int) (elementToDrag.getSize().getWidth() * 6.0); // You can adjust the factor based on your requirement
    int endY = startY;

    // Use TouchAction to perform the drag
    TouchAction touchAction = new TouchAction(driver);
    LongPressOptions longPressOptions = new LongPressOptions()
            .withPosition(PointOption.point(startX, startY))
            .withDuration(Duration.ofMillis(1000)); // You can adjust the duration as needed

    touchAction.longPress(longPressOptions).moveTo(PointOption.point(endX, endY)).release().perform();
}


@Given("Click the Flights Tracking Carousel Card in the Home Screen and Verify its Functionality")
public void click_the_flights_tracking_carousel_card_in_the_home_screen_and_verify_its_functionality() throws InterruptedException {
  //Thread.sleep(10000);
  driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ScrollView/android.view.ViewGroup/android.widget.HorizontalScrollView[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView")).click();
}

private AndroidDriver driver;
@Then("drag the Carousel Card")
public void drag_the_carousel_card() throws InterruptedException {
   Thread.sleep(5000);
    WebElement elementToDrag = driver.findElement(By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ScrollView/android.view.ViewGroup/android.widget.HorizontalScrollView[2]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView"));
    int startX = elementToDrag.getLocation().getX();
    int startY = elementToDrag.getLocation().getY();

    // Calculate the ending coordinates for the drag (in this example, dragging to the left)
    int endX = startX - (int) (elementToDrag.getSize().getWidth() * 0.8); // You can adjust the factor based on your requirement
    int endY = startY;

    // Use TouchAction to perform the drag
    TouchAction touchAction = new TouchAction(driver);
    LongPressOptions longPressOptions = new LongPressOptions()
            .withPosition(PointOption.point(startX, startY))
            .withDuration(Duration.ofMillis(1000)); // You can adjust the duration as needed

    touchAction.longPress(longPressOptions).moveTo(PointOption.point(endX, endY)).release().perform();
}
@Then("drag the Carousel Card for the promotions")
public void drag_the_carousel_card_for_the_promotions() throws InterruptedException {
	//Thread.sleep(5000);
    WebElement elementToDrag = driver.findElement(By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ScrollView/android.view.ViewGroup/android.widget.HorizontalScrollView[2]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView"));
    int startX = elementToDrag.getLocation().getX();
    int startY = elementToDrag.getLocation().getY();

    // Calculate the ending coordinates for the drag (in this example, dragging to the left)
    int endX = startX - (int) (elementToDrag.getSize().getWidth() * 0.8); // You can adjust the factor based on your requirement
    int endY = startY;

    // Use TouchAction to perform the drag
    TouchAction touchAction = new TouchAction(driver);
    LongPressOptions longPressOptions = new LongPressOptions()
            .withPosition(PointOption.point(startX, startY))
            .withDuration(Duration.ofMillis(1000)); // You can adjust the duration as needed

    touchAction.longPress(longPressOptions).moveTo(PointOption.point(endX, endY)).release().perform();
    
}

@Then("Click on the Promotions banner in the home screen and verify the functionality")
public void click_on_the_promotions_banner_in_the_home_screen_and_verify_the_functionality() throws InterruptedException {
    Thread.sleep(5000);
    driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ScrollView/android.view.ViewGroup/android.widget.HorizontalScrollView[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView")).click();
}
@Then("Verify that back arrow should be present in Promotions page")
public void verify_that_back_arrow_should_be_present_in_promotions_page() throws InterruptedException {
    Thread.sleep(5000);
    WebElement back = driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.ImageView"));
    if(back.isDisplayed())
    {
    	System.out.println("Back arrow is Visible");
    }
    
}

@Then("Now click on the back arrow and verify the Arrow functionality")
public void now_click_on_the_back_arrow_and_verify_the_arrow_functionality() throws InterruptedException {
    Thread.sleep(5000);
    driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.ImageView")).click();
}

@Then("Verify that search bar should be present in promotions page")
public void verify_that_search_bar_should_be_present_in_promotions_page() throws InterruptedException {
	Thread.sleep(5000);
    WebElement search = driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"Search for Promotions\"]"));
    if(search.isDisplayed())
    {
    	System.out.println("Search is Visible");
    }
    
}

@Then("Verify the functionality of the Search bar")
public void verify_the_functionality_of_the_search_bar() throws InterruptedException {
	Thread.sleep(5000);
    driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"Search for Promotions\"]")).sendKeys("food");
}

@When("Verify that Drop down should be present in promotions page")
public void verify_that_drop_down_should_be_present_in_promotions_page() throws InterruptedException {
Thread.sleep(5000);
    WebElement dropdown = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"\"]"));
    if(dropdown.isDisplayed())
    {
    	System.out.println("dropDown is visible");
    }
    Thread.sleep(5000);
    driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"\"]")).click();
}

@When("Change the terminal name in the drop down and Verify its Functionality")
public void change_the_terminal_name_in_the_drop_down_and_verify_its_functionality() throws InterruptedException {
	Thread.sleep(5000);
   driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"KUL Terminal 2\"]")).click();;
}

@Then("drag the Carousel Card for the Butterfly Effect")
public void drag_the_carousel_card_for_the_butterfly_effect() throws InterruptedException {
	Thread.sleep(5000);
	WebElement elementToDrag = driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ScrollView/android.view.ViewGroup/android.widget.HorizontalScrollView[2]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView"));
	int startX = elementToDrag.getLocation().getX();
    int startY = elementToDrag.getLocation().getY();

    // Calculate the ending coordinates for the drag (in this example, dragging to the left)
    int endX = startX - (int) (elementToDrag.getSize().getWidth() * 0.8); // You can adjust the factor based on your requirement
    int endY = startY;

    // Use TouchAction to perform the drag
    TouchAction touchAction = new TouchAction(driver);
    LongPressOptions longPressOptions = new LongPressOptions()
            .withPosition(PointOption.point(startX, startY))
            .withDuration(Duration.ofMillis(1000)); // You can adjust the duration as needed

    touchAction.longPress(longPressOptions).moveTo(PointOption.point(endX, endY)).release().perform();

}

@Then("Verify the Butterfly effect Carousel card in the Home screen")
public void verify_the_butterfly_effect_carousel_card_in_the_home_screen() throws InterruptedException {
	Thread.sleep(5000);
    WebElement ButterflyEffect = driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ScrollView/android.view.ViewGroup/android.widget.HorizontalScrollView[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView"));
    if (ButterflyEffect.isDisplayed()) {
    	System.out.println("The Butterfly effect is Visible ");
		
	}
}

@Then("Verify that User should landed in Butterfly effect page when Butterfly Effect Carousel card is clicked")
public void verify_that_user_should_landed_in_butterfly_effect_page_when_butterfly_effect_carousel_card_is_clicked() throws InterruptedException {
	Thread.sleep(5000);
      driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ScrollView/android.view.ViewGroup/android.widget.HorizontalScrollView[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView")).click();
   
}

@Then("Verify that Back arrow should present in Butterlfy effect landing page")
public void verify_that_back_arrow_should_present_in_butterlfy_effect_landing_page() throws InterruptedException {
	Thread.sleep(5000);
    WebElement backArrow = driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView"));
   if (backArrow.isDisplayed()) {
	   System.out.println("backArrow is Visible ");
	
}
}

@When("Verify that User Should navigate to Home screen when back arrow is clicked in Butterfly effect page")
public void verify_that_user_should_navigate_to_home_screen_when_back_arrow_is_clicked_in_butterfly_effect_page() throws InterruptedException {
   Thread.sleep(5000);
   driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView")).click();
}

@Then("Verify that User should landed in Form page when User clicks on Click here to register")
public void verify_that_user_should_landed_in_form_page_when_user_clicks_on_click_here_to_register() throws InterruptedException {
	Thread.sleep(5000);
    driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Click here to register.\"]")).click();
}


@When("Click the EZPaz Button in the Navigation Bar in menu")
public void click_the_ez_paz_button_in_the_navigation_bar_in_menu() throws InterruptedException {
	Thread.sleep(5000);
	   driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"EZPaz\"]")).click();

	Thread.sleep(5000);
	driver.findElement(AppiumBy.xpath("//android.widget.Button[@resource-id=\"klia.mahb.ios:id/dismiss\"]")).click();
}

@When("Click on Flight info page in arrival and Click on track button")
public void click_on_flight_info_page_in_arrival_and_click_on_track_button() throws InterruptedException {
   Thread.sleep(2000);
   driver.findElement(AppiumBy.xpath("")).click();
}


}





