/**
 * 
 */
package com.gtech.portal.scripts;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.gtech.util.DataSource;
import com.gtech.util.SelectingWebDriver;
import com.gtech.util.Util4Modules;



/**
 * @author bhupesh.b
 *
 */
public class Login_Implementation  {

	
	WebDriver driver =SelectingWebDriver.getInstance();
	Util4Modules autoutil=Util4Modules.getInstance();
	DataSource dd= new DataSource();
	
	
	// for testing 
	public void signIn(LinkedHashMap<String, LinkedHashMap<String, String>> credentials){}

	
	public String propFile(String propertiesName){
		return DataSource.map.get(propertiesName.trim());
	}

	public String dataSheet(LinkedHashMap<String, LinkedHashMap<String, String>> credentials,String parentKey,String chieldKey){
		return credentials.get(parentKey.trim()).get(chieldKey.trim());
	}
	
	public LinkedHashMap<String, String> dataSheet(LinkedHashMap<String, LinkedHashMap<String, String>> credentials,String parentKey){
		return credentials.get(parentKey.trim());
	}


	
	
	public void game_SignIn(
			LinkedHashMap<String, LinkedHashMap<String, String>> credentials) {
		autoutil.openBrowser(dataSheet(credentials,"url","url"));
		autoutil.waitTime(8000);
		autoutil.clickButton(dataSheet(credentials,"button","sign"),propFile("link"));
		for(Entry<String, String> entry : dataSheet(credentials, "field").entrySet())
		autoutil.verifyAndTextTheFields(entry.getKey(), entry.getValue());
		autoutil.clickButton("//button[@type='submit']");
		autoutil.waitTime(8000);
		autoutil.isMessageExists(propFile("message"),dataSheet(credentials,"label","message"));

	}


	
	
	
	public void game_SignUp(
			LinkedHashMap<String, LinkedHashMap<String, String>> credentials) {
		
		autoutil.waitTime(8000);
		autoutil.clickButton(dataSheet(credentials,"button","sign"),propFile("link"));
		for(Entry<String, String> entry : dataSheet(credentials, "dropdown").entrySet())
		autoutil.dropDown(entry.getKey(), entry.getValue());
		for(Entry<String, String> entry : dataSheet(credentials, "date").entrySet())
		autoutil.selectDate(entry.getKey(), entry.getValue());
		for(Entry<String, String> entry : dataSheet(credentials, "field").entrySet())
		autoutil.verifyingLabelsAndTextTheFields(entry.getKey(), entry.getValue());
		for(Entry<String, String> entry : dataSheet(credentials, "checkbox").entrySet())
		autoutil.selectcheckBox(entry.getValue());
		autoutil.clickButton("//a[contains(.,'Play for real')]");
		//autoutil.isTitleExist("Banking");
		autoutil.waitTime(10000);
		//for(Entry<String, String> entry : dataSheet(credentials, "toolbar").entrySet())
		//autoutil.isHeaderExists(propFile("header"), entry.getValue());
			autoutil.isHeaderExists(propFile("header"),dataSheet(credentials,"toolbar","header1"));

		
		
	}

	public void game_SignOut(
			LinkedHashMap<String, LinkedHashMap<String, String>> credentials) {
		
		autoutil.waitTime(8000);
		autoutil.clickButton(dataSheet(credentials,"hyperlink","home"),propFile("link2"));
		autoutil.waitTime(4000);
		autoutil.clickButton(dataSheet(credentials,"button","logout"),propFile("link"));
		autoutil.waitTime(4000);

		//autoutil.clickLink(propFile("link").replace("CONSTANT", dataSheet(credentials,"button","logout")));

	}
	
	public void game_EditAccount(
			LinkedHashMap<String, LinkedHashMap<String, String>> credentials) {
		
		autoutil.waitTime(4000);
		autoutil.clickButton(dataSheet(credentials,"button","account"),propFile("link"));
		autoutil.waitTime(6000);
		autoutil.clickButton(dataSheet(credentials,"button","editAccount"),propFile("span"));
		for(Entry<String, String> entry : dataSheet(credentials, "field").entrySet())
			autoutil.verifyingLabelsAndTextTheFields(entry.getKey(), entry.getValue());
/*		for(Entry<String, String> entry : dataSheet(credentials, "dropdown").entrySet())
			autoutil.dropDown(entry.getKey(), entry.getValue());
		for(Entry<String, String> entry : dataSheet(credentials, "date").entrySet())
			autoutil.selectDate(entry.getKey(), entry.getValue());*/
		
		
		
	}
	
	
	
	public void game_DepositAccount(
			LinkedHashMap<String, LinkedHashMap<String, String>> credentials) {
		
		autoutil.waitTime(4000);
		autoutil.clickButton(dataSheet(credentials,"hyperlink","home"),propFile("link2"));
		autoutil.waitTime(4000);

		autoutil.clickButton(dataSheet(credentials,"button","account"),propFile("link"));

		//autoutil.clickButton(dataSheet(credentials,"button","account"),propFile("link"));
		autoutil.waitTime(6000);
		autoutil.clickButton(dataSheet(credentials,"button","DAccount"),propFile("span"));
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.titleContains("Cashier"));
		//autoutil.waitTime(30000);
		
		//autoutil.isTitleExist("Banking");
		
		//WebDriverWait wait = new WebDriverWait(driver, 180);
		//wait.until(ExpectedConditions.titleContains("Cashier"));
		System.out.println(" I am in Chasier page");
		autoutil.waitTime(3000);
		driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
		autoutil.waitTime(3000);
		autoutil.clickButton("//a[contains(@title, 'Register Neteller')]");
		System.out.println("I clicked for register");
		System.out.println("dsfkh");
			autoutil.verifyingLabelsAndTextTheFields("Account number", "450124021795");
			autoutil.clickButton("Deposit", propFile("link"));
			
			/*autoutil.verifyingLabelsAndTextTheFields("Security number", "315204");
			autoutil.verifyingLabelsAndTextTheFields("Deposit amount", "10");
			autoutil.clickButton("Deposit", propFile("link"));
			autoutil.waitTime(30000);*/
			driver.switchTo().defaultContent();
		/*
		autoutil.clickButton("//a[contains(@title, 'Register Neteller')]");
	System.out.println("I clicked for register");
		autoutil.verifyingLabelsAndTextTheFields("Account number", "458591047553");
		autoutil.clickButton("Deposit", propFile("link"));
		
		autoutil.verifyingLabelsAndTextTheFields("Security number", "411392");
		autoutil.verifyingLabelsAndTextTheFields("Deposit amount", "100");
		autoutil.clickButton("Deposit", propFile("link"));
		autoutil.waitTime(30000);
//-------------------------------------------------------------ViSA		
		
		autoutil.clickButton("//a[contains(@title, 'Register Card')]");
		autoutil.waitTime(3000);

		autoutil.verifyingLabelsAndTextTheFields("Cardholder name", "tester");
		autoutil.verifyingLabelsAndTextTheFields("Card number", "4357540001005426");
		autoutil.verifyingLabelsAndTextTheFields("Security number", "150");
	    new Select(driver.findElement(By.xpath("//select[contains(@name, 'ExpMonth')]"))).selectByVisibleText("Dec");
	    new Select(driver.findElement(By.xpath("//select[contains(@name, 'ExpYear')]"))).selectByVisibleText("2026");		
		autoutil.clickButton("Submit",propFile("button"));
		
		autoutil.waitTime(3000);
		WebDriverWait wait = new WebDriverWait(driver, 180);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h2[contains(.,'Select deposit method')]")));
		//h2[contains(.,'Select deposit method')]
		autoutil.clickButton("//tr[td/img[contains(@alt,'Visa')]]/td/a[contains(.,'Deposit')]");
		
		autoutil.waitTime(3000);
		WebDriverWait wait2 = new WebDriverWait(driver, 180);
		wait2.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h2[contains(.,'Make a deposit')]")));
		
		autoutil.verifyingLabelsAndTextTheFields("Security number", "150");
		autoutil.verifyingLabelsAndTextTheFields("Deposit amount", "100");
		
		autoutil.clickButton("Deposit", propFile("link"));
		driver.switchTo().defaultContent();
		autoutil.waitTime(3000);
		
		//-------------------------------------------------------------ViSA	END---------------
		//WebDriverWait wait3 = new WebDriverWait(driver, 180);
		//wait3.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='alert alert-success' and contains(.,'Your Deposit transaction has been successful.')]")));
		
		
	//	autoutil.isDisplayed("//div[@class='alert alert-success' and contains(.,'Your Deposit transaction has been successful.')]");
		
		
		
		
	//	Security number
		
				for(Entry<String, String> entry : dataSheet(credentials, "dropdown").entrySet())
			autoutil.dropDown(entry.getKey(), entry.getValue());
		for(Entry<String, String> entry : dataSheet(credentials, "date").entrySet())
			autoutil.selectDate(entry.getKey(), entry.getValue());
		
		
		
		
		
		
	 * 
	 * <--------------------------------------------------------master------------------------------------
	 * 
	 * autoutil.clickButton("//a[contains(@title, 'Register Card')]");
		autoutil.waitTime(3000);

		autoutil.verifyingLabelsAndTextTheFields("Cardholder name", "tester");
		autoutil.verifyingLabelsAndTextTheFields("Card number", "5301207010000012");
		autoutil.verifyingLabelsAndTextTheFields("Security number", "150");
	    new Select(driver.findElement(By.xpath("//select[contains(@name, 'ExpMonth')]"))).selectByVisibleText("Dec");
	    new Select(driver.findElement(By.xpath("//select[contains(@name, 'ExpYear')]"))).selectByVisibleText("2026");		
		autoutil.clickButton("Submit",propFile("link"));
		
		autoutil.waitTime(3000);
		WebDriverWait wait = new WebDriverWait(driver, 180);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h2[contains(.,'Select deposit method')]")));
		//h2[contains(.,'Select deposit method')]
		autoutil.waitTime(3000);
		autoutil.clickButton("//tr[td/img[contains(@alt,'Mastercard')]]/td/a[contains(.,'Deposit')]");
		
		autoutil.waitTime(3000);
		WebDriverWait wait2 = new WebDriverWait(driver, 180);
		wait2.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h2[contains(.,'Make a deposit')]")));
		autoutil.waitTime(3000);
		autoutil.verifyingLabelsAndTextTheFields("Security number", "150");
		autoutil.verifyingLabelsAndTextTheFields("Deposit amount", "100");
		
		autoutil.clickButton("Deposit", propFile("link"));
		driver.switchTo().defaultContent();
		autoutil.waitTime(3000);
		driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
		 
		List<WebElement> l1=driver.findElements(By.xpath("//iframe"));
		for (WebElement webElement : l1) {
			System.out.println(webElement.getText());
		}
		
		autoutil.waitTime(3000);
		WebDriverWait wait3 = new WebDriverWait(driver, 180);
		wait3.until(ExpectedConditions.presenceOfElementLocated(By.name("Password")));
		//  driver.findElement(By.name("Password")).clear();
		    driver.findElement(By.name("Password")).sendKeys("12343");
		    driver.findElement(By.cssSelector("a[name=\"a1\"] > img")).click();
		    
		    autoutil.waitTime(3000);
		System.out.println(autoutil.isExists("//h1[contains(.,'Cashier')]"));
		autoutil.waitTime(3000);
		System.out.println(autoutil.isExists("//div[@class='alert alert-success' and contains(.,'Your Deposit transaction has been successful.')]"));
		
		
		
		<---------------------------------------------------master End-------------------------------------->
		
		
		
		autoutil.clickButton("//a[contains(@title, 'Paypal Deposit')]");
		
		autoutil.verifyingLabelsAndTextTheFields("Deposit amount", "100");
		autoutil.clickButton("Deposit",propFile("link"));
		autoutil.waitTime(3000);
		
		
		  driver.findElement(By.id("deposit-amount")).clear();
		    driver.findElement(By.id("deposit-amount")).sendKeys("100");
		    driver.findElement(By.linkText("Deposit")).click();
		    
		    
		    //parentWindowHandle = WebDriverInitialize.getDriver().getWindowHandle(); // save the current window handle.
	        WebDriver popup = null;
	        Set<String> windowIterator = driver.getWindowHandles();
	        System.err.println("No of windows :  " + windowIterator.size());
	        for (String s : windowIterator) {
	          String windowHandle = s; 
	          System.out.println(windowHandle);
	          popup = driver.switchTo().window(windowHandle);
	          System.out.println("Window Title : " + popup.getTitle());
	          System.out.println("Window Url : " + popup.getCurrentUrl());
	        
	              System.out.println("Selected Window Title : " + popup.getTitle());
	       

	      
	                System.out.println("Window Title :" + popup.getTitle());
	                System.out.println();
	                if(popup.getTitle().equals("Pay with a PayPal account")){
	                	 driver.findElement(By.id("login_email")).clear();
	 	    		    driver.findElement(By.id("login_email")).sendKeys("");
	 	    		    driver.findElement(By.id("login_email")).clear();
	 	    		    driver.findElement(By.id("login_email")).sendKeys("ibnplayer3@gmail.com");
	 	    		    driver.findElement(By.id("login_password")).clear();
	 	    		    driver.findElement(By.id("login_password")).sendKeys("Password1");
	 	    		    driver.findElement(By.id("submitLogin")).click();
	 	    		    driver.findElement(By.id("continue_abovefold")).click();
	 	    		    driver.findElement(By.linkText("Close")).click();
	                }
	                
	                
	               
	                
	        
		    // ERROR: Caught exception [ERROR: Unsupported command [waitForPopUp | popupWindow | 30000]]
		    // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | name=popupWindow | ]]
		    driver.findElement(By.id("login_email")).clear();
		    driver.findElement(By.id("login_email")).sendKeys("");
		    driver.findElement(By.id("login_email")).clear();
		    driver.findElement(By.id("login_email")).sendKeys("ibnplayer3@gmail.com");
		    driver.findElement(By.id("login_password")).clear();
		    driver.findElement(By.id("login_password")).sendKeys("Password1");
		    driver.findElement(By.id("submitLogin")).click();
		    driver.findElement(By.id("continue_abovefold")).click();
		    driver.findElement(By.linkText("Close")).click();*/
		  
		
		
	}
	
	//5301207010000012
	
	
	public void olg_Register(
			LinkedHashMap<String, LinkedHashMap<String, String>> credentials){
		
		autoutil.openBrowser(dataSheet(credentials,"url","url"));
		autoutil.waitTime(8000);
		//autoutil.clickButton(dataSheet(credentials,"button","sign"),propFile("link"));
		
		for(Entry<String, String> entry : dataSheet(credentials, "field").entrySet())
autoutil.verifyingLabelsAndTextTheFields(entry.getKey(), entry.getValue());
		
		 driver.findElement(By.id("olgregistration_0_dateofbirth_day")).click();
		    new Select(driver.findElement(By.id("olgregistration_0_dateofbirth_day"))).selectByVisibleText("04");
		    driver.findElement(By.cssSelector("option[value=\"04\"]")).click();
		    driver.findElement(By.xpath("//form[@id='olgregistration_0step1']/div/div/div/div[6]/fieldset/div[2]")).click();
		    driver.findElement(By.id("olgregistration_0_dateofbirth_month")).click();
		    new Select(driver.findElement(By.id("olgregistration_0_dateofbirth_month"))).selectByVisibleText("May");
		    driver.findElement(By.cssSelector("option[value=\"5\"]")).click();
		    driver.findElement(By.id("olgregistration_0_dateofbirth_year")).click();
		    new Select(driver.findElement(By.id("olgregistration_0_dateofbirth_year"))).selectByVisibleText("1992");
		    driver.findElement(By.cssSelector("option[value=\"1992\"]")).click();
		
		    driver.findElement(By.id("olgregistration_0_postalcode_1")).clear();
		    driver.findElement(By.id("olgregistration_0_postalcode_1")).sendKeys("V3h");
		    driver.findElement(By.id("olgregistration_0_postalcode_2")).clear();
		    driver.findElement(By.id("olgregistration_0_postalcode_2")).sendKeys("1Z7");
		    
		    driver.findElement(By.id("olgregistration_0_phone_area")).clear();
		    driver.findElement(By.id("olgregistration_0_phone_area")).sendKeys("345");

		    driver.findElement(By.id("olgregistration_0_phone_exchange")).clear();
		    driver.findElement(By.id("olgregistration_0_phone_exchange")).sendKeys("345");
		    
		    driver.findElement(By.id("olgregistration_0_phone_number")).clear();
		    driver.findElement(By.id("olgregistration_0_phone_number")).sendKeys("3457");
	driver.findElement(By.xpath("//input[(@value='Next')]"));
		    
		  //  olgregistration_0_phone_area
	
	}
	
	
	
	
}
