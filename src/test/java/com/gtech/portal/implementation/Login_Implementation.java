/**
 * 
 */
package com.gtech.portal.implementation;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

import org.openqa.selenium.WebDriver;
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
		autoutil.closeBrowser();
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
		
		autoutil.waitTime(6000);
		autoutil.clickButton(dataSheet(credentials,"button","editAccount"),propFile("span"));
		for(Entry<String, String> entry : dataSheet(credentials, "field").entrySet())
			autoutil.verifyingLabelsAndTextTheFields(entry.getKey(), entry.getValue());
/*		for(Entry<String, String> entry : dataSheet(credentials, "dropdown").entrySet())
			autoutil.dropDown(entry.getKey(), entry.getValue());
		for(Entry<String, String> entry : dataSheet(credentials, "date").entrySet())
			autoutil.selectDate(entry.getKey(), entry.getValue());*/
		
		
		
	}
	
	
	
	
	
	
	
	
	
}
