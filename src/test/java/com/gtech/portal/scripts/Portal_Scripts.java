package com.gtech.portal.scripts;

import java.net.MalformedURLException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Random;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.ImplicitlyWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Predicate;
import com.gtech.util.Asserting;
import com.gtech.util.DataSource;
import com.gtech.util.SelectingWebDriver;
import com.gtech.util.Util4Modules;

public class Portal_Scripts {

	WebDriver driver =SelectingWebDriver.getInstance();
	Util4Modules autoutil=Util4Modules.getInstance();
	DataSource dd= new DataSource();
	
	public String propFile(String propertiesName){
		return DataSource.map.get(propertiesName.trim());
	}

	public String dataSheet(LinkedHashMap<String, LinkedHashMap<String, String>> credentials,String parentKey,String chieldKey){
		return credentials.get(parentKey.trim()).get(chieldKey.trim());
	}
	
	public LinkedHashMap<String, String> dataSheet(LinkedHashMap<String, LinkedHashMap<String, String>> credentials,String parentKey){
		return credentials.get(parentKey.trim());
	}

	
	public void p_Combinations_step1_reg(
			LinkedHashMap<String, LinkedHashMap<String, String>> credentials) {

		autoutil.openBrowser(dataSheet(credentials,"url","url"));
		autoutil.waitTime(8000);
		autoutil.clickButton(dataSheet(credentials,"button","sign"),propFile("link"));
		autoutil.waitTime(3000);
		for(Entry<String, String> entry : dataSheet(credentials, "dropdown").entrySet())
		autoutil.dropDown(entry.getKey(), entry.getValue());
		for(Entry<String, String> entry : dataSheet(credentials, "date").entrySet())
		autoutil.selectDate(entry.getKey(), entry.getValue());
		for(Entry<String, String> entry : dataSheet(credentials, "field").entrySet())
		autoutil.verifyingLabelsAndTextTheFields(entry.getKey(), entry.getValue());
		for(Entry<String, String> entry : dataSheet(credentials, "checkbox").entrySet())
		autoutil.selectcheckBox(entry.getValue());
		autoutil.clickButton(dataSheet(credentials,"button","pla4Real"),propFile("link"));
		cashier();
	
		}

	
	
	

	public void cashier() {
		autoutil.waitTime(30000);
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.titleContains("Cashier"));
		System.out.println(" I am in Chasier page");
				
		autoutil.waitTime(3000);
		driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
		if(autoutil.isExists("//a[contains(@title, 'Registrera Neteller-konto')]")){
			clickButton("//a[contains(@title, 'Registrera Neteller-konto')]");
		}else{
			clickButton("//a[contains(@title, 'Register Neteller')]");

		}
		
		
		List<WebElement> el =driver.findElements(By.xpath("//span[contains(.,'Bonus')]"));
		if(!el.isEmpty()){
		for (WebElement webElement : el) {
			webElement.click();
			System.out.println(webElement.getText());
			break;
			}
		}
		driver.switchTo().defaultContent();
		
	}

	
	public void clickButton(String path){
		
		List<WebElement> l1=driver.findElements(By.xpath(path));
		if(l1.size()!=0){
			for(WebElement el:l1){
				
				System.out.println(el.getText());

				if(el.isDisplayed())
				{
					el.click();
					break;
				}
			}
		}
		else{
			for(WebElement el:l1){
				
				
				System.out.println(el.getText());
							}
		}
	}
	
	
	@SuppressWarnings("static-access")
	public boolean waitUntillExist(String path){
		boolean test=false;
		for(int i=0;i<1000;i++){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(driver.findElement(By.xpath("//title")).getAttribute("innerHTML").trim().equals("Cashier")){
				System.out.println("i ma in cashier page");
				test=true;
				break;
			}
		
			
		}
		return test;	
	}
	public String randomString()
	{
		int length=9;
		Random rng = new Random();
		String characters="12345678901234567890";
		char[] text = new char[length];
		for (int i = 0; i < length; i++)
		{
			text[i] = characters.charAt(rng.nextInt(characters.length()));
		}
		return new String(text);
	}
	
	
	
	public void p_Reg_play_for_Free(
			LinkedHashMap<String, LinkedHashMap<String, String>> credentials) throws MalformedURLException {

		autoutil.openBrowser(dataSheet(credentials,"url","url"));
		autoutil.waitTime(8000);
		autoutil.clickButton(dataSheet(credentials,"button","sign"),propFile("link"));
		autoutil.waitTime(3000);
		for(Entry<String, String> entry : dataSheet(credentials, "dropdown").entrySet())
		autoutil.dropDown(entry.getKey(), entry.getValue());
		for(Entry<String, String> entry : dataSheet(credentials, "date").entrySet())
		autoutil.selectDate(entry.getKey(), entry.getValue());
		for(Entry<String, String> entry : dataSheet(credentials, "field").entrySet())
		autoutil.verifyingLabelsAndTextTheFields(entry.getKey(), entry.getValue());
		for(Entry<String, String> entry : dataSheet(credentials, "checkbox").entrySet())
		autoutil.selectcheckBox(entry.getValue());
		autoutil.clickButton(dataSheet(credentials,"button","pla4Real"),propFile("link"));
		cashier();
	
		}

	//p_Reg_play_Payments

	public void p_Reg_play_Payments(
			LinkedHashMap<String, LinkedHashMap<String, String>> credentials) {
		
		
		
		
		
		
		
	}
	
	
	
	public void p_Reg_play_for_Real(
			LinkedHashMap<String, LinkedHashMap<String, String>> credentials) {

		autoutil.openBrowser(dataSheet(credentials,"url","url"));
		autoutil.waitTime(8000);
		autoutil.clickButton(dataSheet(credentials,"button","sign"),propFile("link"));
		autoutil.waitTime(3000);
		for(Entry<String, String> entry : dataSheet(credentials, "dropdown").entrySet())
		autoutil.dropDown(entry.getKey(), entry.getValue());
		if(dataSheet(credentials, "date")!=null)
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
		for(Entry<String, String> entry : dataSheet(credentials, "label").entrySet()){
			if(!autoutil.doTheyExists(entry.getValue(),propFile("span"))){
				autoutil.isHeaderExists(dataSheet(credentials,"toolbar","header1"),propFile("header"));
			}
			//autoutil.closeBrowser();
		}

		//autoutil.doTheyExists(dataSheet(credentials,"label","header1"),propFile("span"));

		autoutil.closeBrowser();
	
		
	
		
	}

	
	public void p_All_fields_error_messages(
			LinkedHashMap<String, LinkedHashMap<String, String>> credentials) {


		autoutil.openBrowser(dataSheet(credentials,"url","url"));
		autoutil.waitTime(8000);
		autoutil.clickButton(dataSheet(credentials,"button","sign"),propFile("link"));
		autoutil.waitTime(3000);
		for(Entry<String, String> entry : dataSheet(credentials, "dropdown").entrySet())
		autoutil.dropDown(entry.getKey(), entry.getValue());
		if(dataSheet(credentials, "date")!=null)
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
		for(Entry<String, String> entry : dataSheet(credentials, "label").entrySet()){
			if(!autoutil.doTheyExists(entry.getValue(),propFile("span"))){
				autoutil.isHeaderExists(dataSheet(credentials,"toolbar","header1"),propFile("header"));
			}
			//autoutil.closeBrowser();
		}

		//autoutil.doTheyExists(dataSheet(credentials,"label","header1"),propFile("span"));

		autoutil.closeBrowser();
	
		
	
		
	}

	
	public void p_leap_year_validation(
			LinkedHashMap<String, LinkedHashMap<String, String>> credentials) {


		autoutil.openBrowser(dataSheet(credentials,"url","url"));
		autoutil.waitTime(8000);
		autoutil.clickButton(dataSheet(credentials,"button","sign"),propFile("link"));
		autoutil.waitTime(3000);
		for(Entry<String, String> entry : dataSheet(credentials, "dropdown").entrySet())
		autoutil.dropDown(entry.getKey(), entry.getValue());
		if(dataSheet(credentials, "date")!=null)
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
		for(Entry<String, String> entry : dataSheet(credentials, "label").entrySet()){
			if(!autoutil.doTheyExists(entry.getValue(),propFile("span"))){
				autoutil.isHeaderExists(dataSheet(credentials,"toolbar","header1"),propFile("header"));
			}
			//autoutil.closeBrowser();
		}

		//autoutil.doTheyExists(dataSheet(credentials,"label","header1"),propFile("span"));

	
		
	
		
	}

	
	public void p_Username_abusive_Playforreal(
			LinkedHashMap<String, LinkedHashMap<String, String>> credentials) {

	

		autoutil.openBrowser(dataSheet(credentials,"url","url"));
		autoutil.waitTime(8000);
		autoutil.clickButton(dataSheet(credentials,"button","sign"),propFile("link"));
		autoutil.waitTime(3000);
		for(Entry<String, String> entry : dataSheet(credentials, "dropdown").entrySet())
		autoutil.dropDown(entry.getKey(), entry.getValue());
		if(dataSheet(credentials, "date")!=null)
		for(Entry<String, String> entry : dataSheet(credentials, "date").entrySet())
		autoutil.selectDate(entry.getKey(), entry.getValue());
		for(Entry<String, String> entry : dataSheet(credentials, "field").entrySet())
		autoutil.verifyingLabelsAndTextTheFields(entry.getKey(), entry.getValue());
		
		for(Entry<String, String> entry : dataSheet(credentials, "field2").entrySet())
			autoutil.verifyingLabelsAndTextTheFields(entry.getKey(), autoutil.randomString1()+entry.getValue());
		autoutil.verifyingLabelsAndTextTheFields("Nickname","abused");

		for(Entry<String, String> entry : dataSheet(credentials, "checkbox").entrySet())
		autoutil.selectcheckBox(entry.getValue());
		autoutil.clickButton("//a[contains(.,'Play for real')]");
		//autoutil.isTitleExist("Banking");
		autoutil.waitTime(10000);
		//for(Entry<String, String> entry : dataSheet(credentials, "toolbar").entrySet())
		//autoutil.isHeaderExists(propFile("header"), entry.getValue());
		for(Entry<String, String> entry : dataSheet(credentials, "label").entrySet()){
			if(!autoutil.doTheyExists(entry.getValue(),propFile("span"))){
				autoutil.isHeaderExists(dataSheet(credentials,"toolbar","header1"),propFile("header"));
			}
			//autoutil.closeBrowser();
		}

		//autoutil.doTheyExists(dataSheet(credentials,"label","header1"),propFile("span"));

	
		
		
		
		
		
		
		
	
	}

	
	public void p_Username_abusive_Playforfun(
			LinkedHashMap<String, LinkedHashMap<String, String>> credentials) {


		

		autoutil.openBrowser(dataSheet(credentials,"url","url"));
		autoutil.waitTime(8000);
		autoutil.clickButton(dataSheet(credentials,"button","sign"),propFile("link"));
		autoutil.waitTime(3000);
		for(Entry<String, String> entry : dataSheet(credentials, "dropdown").entrySet())
		autoutil.dropDown(entry.getKey(), entry.getValue());
		if(dataSheet(credentials, "date")!=null)
		for(Entry<String, String> entry : dataSheet(credentials, "date").entrySet())
		autoutil.selectDate(entry.getKey(), entry.getValue());
		for(Entry<String, String> entry : dataSheet(credentials, "field").entrySet())
		autoutil.verifyingLabelsAndTextTheFields(entry.getKey(), entry.getValue());
		
		for(Entry<String, String> entry : dataSheet(credentials, "field2").entrySet())
			autoutil.verifyingLabelsAndTextTheFields(entry.getKey(), autoutil.randomString1()+entry.getValue());
		autoutil.verifyingLabelsAndTextTheFields("Nickname","abused");

		for(Entry<String, String> entry : dataSheet(credentials, "checkbox").entrySet())
		autoutil.selectcheckBox(entry.getValue());
		autoutil.clickButton("//a[contains(.,'Play for real')]");
		//autoutil.isTitleExist("Banking");
		autoutil.waitTime(10000);
		//for(Entry<String, String> entry : dataSheet(credentials, "toolbar").entrySet())
		//autoutil.isHeaderExists(propFile("header"), entry.getValue());
		for(Entry<String, String> entry : dataSheet(credentials, "label").entrySet()){
			if(!autoutil.doTheyExists(entry.getValue(),propFile("span"))){
				autoutil.isHeaderExists(dataSheet(credentials,"toolbar","header1"),propFile("header"));
			}
			//autoutil.closeBrowser();
		}

		//autoutil.doTheyExists(dataSheet(credentials,"label","header1"),propFile("span"));

		
	}

	
	public void p_Nickname_abusive_Playforreal(
			LinkedHashMap<String, LinkedHashMap<String, String>> credentials) {



		

		autoutil.openBrowser(dataSheet(credentials,"url","url"));
		autoutil.waitTime(8000);
		autoutil.clickButton(dataSheet(credentials,"button","sign"),propFile("link"));
		autoutil.waitTime(3000);
		for(Entry<String, String> entry : dataSheet(credentials, "dropdown").entrySet())
		autoutil.dropDown(entry.getKey(), entry.getValue());
		if(dataSheet(credentials, "date")!=null)
		for(Entry<String, String> entry : dataSheet(credentials, "date").entrySet())
		autoutil.selectDate(entry.getKey(), entry.getValue());
		for(Entry<String, String> entry : dataSheet(credentials, "field").entrySet())
		autoutil.verifyingLabelsAndTextTheFields(entry.getKey(), entry.getValue());
		
		for(Entry<String, String> entry : dataSheet(credentials, "field2").entrySet())
			autoutil.verifyingLabelsAndTextTheFields(entry.getKey(), autoutil.randomString1()+entry.getValue());
		autoutil.verifyingLabelsAndTextTheFields("Nickname","abused");

		for(Entry<String, String> entry : dataSheet(credentials, "checkbox").entrySet())
		autoutil.selectcheckBox(entry.getValue());
		autoutil.clickButton("//a[contains(.,'Play for real')]");
		//autoutil.isTitleExist("Banking");
		autoutil.waitTime(10000);
		//for(Entry<String, String> entry : dataSheet(credentials, "toolbar").entrySet())
		//autoutil.isHeaderExists(propFile("header"), entry.getValue());
		for(Entry<String, String> entry : dataSheet(credentials, "label").entrySet()){
			if(!autoutil.doTheyExists(entry.getValue(),propFile("span"))){
				autoutil.isHeaderExists(dataSheet(credentials,"toolbar","header1"),propFile("header"));
			}
			//autoutil.closeBrowser();
		}

		//autoutil.doTheyExists(dataSheet(credentials,"label","header1"),propFile("span"));

		
	
		
		
	}

	
	public void p_Nickname_abusive_Playforfun(
			LinkedHashMap<String, LinkedHashMap<String, String>> credentials) {



		

		autoutil.openBrowser(dataSheet(credentials,"url","url"));
		autoutil.waitTime(8000);
		autoutil.clickButton(dataSheet(credentials,"button","sign"),propFile("link"));
		autoutil.waitTime(3000);
		for(Entry<String, String> entry : dataSheet(credentials, "dropdown").entrySet())
		autoutil.dropDown(entry.getKey(), entry.getValue());
		if(dataSheet(credentials, "date")!=null)
		for(Entry<String, String> entry : dataSheet(credentials, "date").entrySet())
		autoutil.selectDate(entry.getKey(), entry.getValue());
		for(Entry<String, String> entry : dataSheet(credentials, "field").entrySet())
		autoutil.verifyingLabelsAndTextTheFields(entry.getKey(), entry.getValue());
		
		for(Entry<String, String> entry : dataSheet(credentials, "field2").entrySet())
			autoutil.verifyingLabelsAndTextTheFields(entry.getKey(), autoutil.randomString1()+entry.getValue());
		autoutil.verifyingLabelsAndTextTheFields("Nickname","abused");

		for(Entry<String, String> entry : dataSheet(credentials, "checkbox").entrySet())
		autoutil.selectcheckBox(entry.getValue());
		autoutil.clickButton("//a[contains(.,'Play for real')]");
		//autoutil.isTitleExist("Banking");
		autoutil.waitTime(10000);
		//for(Entry<String, String> entry : dataSheet(credentials, "toolbar").entrySet())
		//autoutil.isHeaderExists(propFile("header"), entry.getValue());
		for(Entry<String, String> entry : dataSheet(credentials, "label").entrySet()){
			if(!autoutil.doTheyExists(entry.getValue(),propFile("span"))){
				autoutil.isHeaderExists(dataSheet(credentials,"toolbar","header1"),propFile("header"));
			}
			//autoutil.closeBrowser();
		}

		//autoutil.doTheyExists(dataSheet(credentials,"label","header1"),propFile("span"));

		
	
		
	}

	
	public void p_Verify_mandatory_fields(
			LinkedHashMap<String, LinkedHashMap<String, String>> credentials) {
		
	}

	
	public void p_years_validation(
			LinkedHashMap<String, LinkedHashMap<String, String>> credentials) {
		
	}

	
	public void p_Login_Verify_Mandatory_fields(
			LinkedHashMap<String, LinkedHashMap<String, String>> credentials) {
		
	}

	
	public void p_Login_Username_Validations(
			LinkedHashMap<String, LinkedHashMap<String, String>> credentials) {
		
	}

	
	public void p_Login_Password_Validations(
			LinkedHashMap<String, LinkedHashMap<String, String>> credentials) {
		
	}

	
	public void p_Login_Login_with_valid_User_name_and_password(
			LinkedHashMap<String, LinkedHashMap<String, String>> credentials) {
		
	}

	
	public void p_Login_Failed_login(
			LinkedHashMap<String, LinkedHashMap<String, String>> credentials) {
		
	}

	
	public void p_Checking_forgot_username_link(
			LinkedHashMap<String, LinkedHashMap<String, String>> credentials) {
		
	}

	
	public void p_Firstname_edit(
			LinkedHashMap<String, LinkedHashMap<String, String>> credentials) {
		
	}

	
	public void p_Last_Name_edit(
			LinkedHashMap<String, LinkedHashMap<String, String>> credentials) {
		
	}

	
	public void p_DOB_edit(
			LinkedHashMap<String, LinkedHashMap<String, String>> credentials) {
		
	}

	
	public void p_Gender_edit(
			LinkedHashMap<String, LinkedHashMap<String, String>> credentials) {
		
	}

	
	public void p_Country_edit(
			LinkedHashMap<String, LinkedHashMap<String, String>> credentials) {
		
	}

	
	public void p_Email_edit(
			LinkedHashMap<String, LinkedHashMap<String, String>> credentials) {
		
	}

	
	public void p_Mobile_phone_number_edit(
			LinkedHashMap<String, LinkedHashMap<String, String>> credentials) {
		
	}

	
	public void p_keep_me_updated_news_edit(
			LinkedHashMap<String, LinkedHashMap<String, String>> credentials) {
		
	}

	
	public void p_Edit_act_L2_user(
			LinkedHashMap<String, LinkedHashMap<String, String>> credentials) {
		
	}

	
	public void p_Chg_pwd__negative(
			LinkedHashMap<String, LinkedHashMap<String, String>> credentials) {
		
	}

	
	public void p_Chg_pwd_validations(
			LinkedHashMap<String, LinkedHashMap<String, String>> credentials) {
		
	}

	
	public void p_Chg_pwd_Positive(
			LinkedHashMap<String, LinkedHashMap<String, String>> credentials) {
		
	}

	
	public void p_Act_Navigation_Bar_Logged_out(
			LinkedHashMap<String, LinkedHashMap<String, String>> credentials) {
		
	}

	
	public void p_Act_Navigation_Bar_L1_user(
			LinkedHashMap<String, LinkedHashMap<String, String>> credentials) {
		
	}

	
	public void p_Act_Navigation_Bar_L2_user(
			LinkedHashMap<String, LinkedHashMap<String, String>> credentials) {
		
	}

	
	public void p_Navigation_Bar_Logged_out(
			LinkedHashMap<String, LinkedHashMap<String, String>> credentials) {
		
	}

	
	public void p_Navigation_Bar_L1_user(
			LinkedHashMap<String, LinkedHashMap<String, String>> credentials) {
		
	}

	
	public void p_Navigation_Bar_L2_user(
			LinkedHashMap<String, LinkedHashMap<String, String>> credentials) {
		
	}

	
	public void p_Sticky_Tab_logged_out(
			LinkedHashMap<String, LinkedHashMap<String, String>> credentials) {
		
	}

	
	public void p_Sticky_Tab_Login_L1_user(
			LinkedHashMap<String, LinkedHashMap<String, String>> credentials) {
		
	}

	
	public void p_Sticky_Tab_Login_L2_user(
			LinkedHashMap<String, LinkedHashMap<String, String>> credentials) {
		
	}

	
	public void p_Setdepositlimits_Fields_validation(
			LinkedHashMap<String, LinkedHashMap<String, String>> credentials) {
		
	}

	
	public void p_Setdepositlimits_daily(
			LinkedHashMap<String, LinkedHashMap<String, String>> credentials) {
		
	}

	
	public void p_Self_Exclustion(
			LinkedHashMap<String, LinkedHashMap<String, String>> credentials) {
		
	}

	
	public void p_Firsttime_visitor_dropdownbutton(
			LinkedHashMap<String, LinkedHashMap<String, String>> credentials) {
		
	}

	
	public void p_Returnplayer_dropdownbutton(
			LinkedHashMap<String, LinkedHashMap<String, String>> credentials) {
		
	}

	
	public void p_Logged_in_player_dropdownbutton(
			LinkedHashMap<String, LinkedHashMap<String, String>> credentials) {
		
	}

	
	public void p_Logged_in_player_delete_cookies_dropdown(
			LinkedHashMap<String, LinkedHashMap<String, String>> credentials) {
		
	}

	
	public void p_New_player_firsttime_visitor_call_to_action(
			LinkedHashMap<String, LinkedHashMap<String, String>> credentials) {
		
	}

	
	public void p_Returnplayer_call_to_action(
			LinkedHashMap<String, LinkedHashMap<String, String>> credentials) {
		
	}

	
	public void p_Loggedinplayer_call_to_action(
			LinkedHashMap<String, LinkedHashMap<String, String>> credentials) {
		
	}

	
	public void p_Loggedinplayer_cookiesdelete_Call_to_action(
			LinkedHashMap<String, LinkedHashMap<String, String>> credentials) {
		
	}

	
	public void p_Logged_in_livehelp(
			LinkedHashMap<String, LinkedHashMap<String, String>> credentials) {
		
	}

	
	public void p_Non_logged_livehelp(
			LinkedHashMap<String, LinkedHashMap<String, String>> credentials) {
		
	}

	
	public void p_Bingo_Lobby_Logged_out_New_visitor(
			LinkedHashMap<String, LinkedHashMap<String, String>> credentials) {
		
	}

	
	public void p_Bingo_Lobby_Logged_out_return_player(
			LinkedHashMap<String, LinkedHashMap<String, String>> credentials) {
		
	}

	
	public void p_Bingo_lobby_Logged_out_cookies_clear(
			LinkedHashMap<String, LinkedHashMap<String, String>> credentials) {
		
	}

	
	public void p_Bingo_lobby_L1_user(
			LinkedHashMap<String, LinkedHashMap<String, String>> credentials) {
		
	}

	
	public void p_Bingo_lobby_L2_user(
			LinkedHashMap<String, LinkedHashMap<String, String>> credentials) {
		
	}

	
	public void p_Logged_out_New_visitor_bingolauncher(
			LinkedHashMap<String, LinkedHashMap<String, String>> credentials) {
		
	}

	
	public void p_Logged_out_return_player_bingolauncher(
			LinkedHashMap<String, LinkedHashMap<String, String>> credentials) {
		
	}

	
	public void p_Logged_out_cookies_clear_bingolauncher(
			LinkedHashMap<String, LinkedHashMap<String, String>> credentials) {
		
	}

	
	public void p_L1_user_bingolauncher(
			LinkedHashMap<String, LinkedHashMap<String, String>> credentials) {
		
	}

	
	public void p_L2_user_bingolauncher(
			LinkedHashMap<String, LinkedHashMap<String, String>> credentials) {
		
	}

	
	public void p_Logged_out_New_visitor_casinolauncher(
			LinkedHashMap<String, LinkedHashMap<String, String>> credentials) {
		
	}

	
	public void p_Logged_out_return_player_casinolauncher(
			LinkedHashMap<String, LinkedHashMap<String, String>> credentials) {
		
	}

	
	public void p_Logged_out_cookies_clear_casinolauncher(
			LinkedHashMap<String, LinkedHashMap<String, String>> credentials) {
		
	}

	
	public void p_L1_user_casinolauncher(
			LinkedHashMap<String, LinkedHashMap<String, String>> credentials) {
		
	}

	
	public void p_L2_user_casinolauncher(
			LinkedHashMap<String, LinkedHashMap<String, String>> credentials) {
		
	}

	
	public void p_Logged_out_carouselcomponent(
			LinkedHashMap<String, LinkedHashMap<String, String>> credentials) {
		
	}

	
	public void p_L2_account_carouselcomponent(
			LinkedHashMap<String, LinkedHashMap<String, String>> credentials) {
		
	}

	
	public void p_L1_Account_carouselcomponent(
			LinkedHashMap<String, LinkedHashMap<String, String>> credentials) {
		
	}

	
	public void p_logout_articlecomponent(
			LinkedHashMap<String, LinkedHashMap<String, String>> credentials) {
		
	}

	
	public void p_L2_Account_articlecomponent(
			LinkedHashMap<String, LinkedHashMap<String, String>> credentials) {
		
	}

	
	public void p_L1_Account_articlecomponent(
			LinkedHashMap<String, LinkedHashMap<String, String>> credentials) {
		
	}

	
	public void p_Article_lobby_Logout(
			LinkedHashMap<String, LinkedHashMap<String, String>> credentials) {
		
	}

	
	public void p_Article_lobby_L2(
			LinkedHashMap<String, LinkedHashMap<String, String>> credentials) {
		
	}

	
	public void p_Article_lobby_L1(
			LinkedHashMap<String, LinkedHashMap<String, String>> credentials) {
		
	}

	
	public void p_logout_articlealert(
			LinkedHashMap<String, LinkedHashMap<String, String>> credentials) {
		
	}

	
	public void p_L1_Player_articlealert(
			LinkedHashMap<String, LinkedHashMap<String, String>> credentials) {
		
	}

	
	public void p_L2_Player_articlealert(
			LinkedHashMap<String, LinkedHashMap<String, String>> credentials) {
		
	}

	
	public void p_Logged_out_New_visitor_casinolobby(
			LinkedHashMap<String, LinkedHashMap<String, String>> credentials) {
		
	}

	
	public void p_Logged_out_return_player_casinolobby(
			LinkedHashMap<String, LinkedHashMap<String, String>> credentials) {
		
	}

	
	public void p_Logged_out_cookies_clear_casinolobby(
			LinkedHashMap<String, LinkedHashMap<String, String>> credentials) {
		
	}

	
	public void p_L1_user_casinolobby(
			LinkedHashMap<String, LinkedHashMap<String, String>> credentials) {
		
	}

	
	public void p_L2_user_casinolobby(
			LinkedHashMap<String, LinkedHashMap<String, String>> credentials) {
		
	}

	
	public void p_L1_Account_Deposit_history(
			LinkedHashMap<String, LinkedHashMap<String, String>> credentials) {
		
	}

	
	public void p_L2_Account_Deposit_history(
			LinkedHashMap<String, LinkedHashMap<String, String>> credentials) {
		
	}

	
	public void p_L1_Account_withdrawal_history(
			LinkedHashMap<String, LinkedHashMap<String, String>> credentials) {
		
	}

	
	public void p_L2_Account_withdrawal_history(
			LinkedHashMap<String, LinkedHashMap<String, String>> credentials) {
		
	}

	
	public void p_L1_Account_Transaction_history(
			LinkedHashMap<String, LinkedHashMap<String, String>> credentials) {
		
	}

	
	public void p_L2_Account_Transaction_history(
			LinkedHashMap<String, LinkedHashMap<String, String>> credentials) {
		
	}

	
	public void p_L1_Account_Bonus_History(
			LinkedHashMap<String, LinkedHashMap<String, String>> credentials) {
		
	}

	
	public void p_L2_Account_Bonus_History(
			LinkedHashMap<String, LinkedHashMap<String, String>> credentials) {
		
	}

	
	public void p_Loggedout_uploaddocuments(
			LinkedHashMap<String, LinkedHashMap<String, String>> credentials) {
		
	}

	
	public void p_L1_user_uploaddocuments(
			LinkedHashMap<String, LinkedHashMap<String, String>> credentials) {
		
	}

	
	public void p_L2_user_uploaddocuments(
			LinkedHashMap<String, LinkedHashMap<String, String>> credentials) {
		
	}


	public void p_scripts_Verify_Mandatory_fields(
			LinkedHashMap<String, LinkedHashMap<String, String>> credentials) {
		// TODO Auto-generated method stub
		
	}

}
