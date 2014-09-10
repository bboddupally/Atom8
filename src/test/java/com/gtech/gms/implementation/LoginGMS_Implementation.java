/**
 * 
 */
package com.gtech.gms.implementation;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.gtech.util.DataSource;
import com.gtech.util.SelectingWebDriver;
import com.gtech.util.Util4Modules;



/**
 * @author bhupesh.b
 *
 */
public class LoginGMS_Implementation  {

	
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


	
	public void gms_SignIn(
			LinkedHashMap<String, LinkedHashMap<String, String>> credentials) throws InterruptedException {
		autoutil.openBrowser(dataSheet(credentials, "url", "url"));
		autoutil.waitTime(4000);
		for(Entry<String, String> entry : dataSheet(credentials, "field").entrySet())
		autoutil.verifyingLabelsAndTextTheFields(entry.getKey(), entry.getValue());
		autoutil.clickButton(dataSheet(credentials, "button", "signIN"),propFile("gmsButton"));
		autoutil.waitTime(6000);
	// to verify the exact values use below api and disable all below click buttons
		/*autoutil.verifyandSelectbrand_partner(credentials);*/
		autoutil.clickButton(dataSheet(credentials, "select","admin"),propFile("span"));
		autoutil.clickButton(dataSheet(credentials, "tabs","tab1"),propFile("link"));
		autoutil.clickButton(propFile("gmsSpecialxpath2searchBrand"));
		autoutil.clickButton(dataSheet(credentials, "label","brand"),propFile("gmsSpecialxpath2findBrand"));
		autoutil.clickButton(propFile("gmsSpecialxpath2searchpartner"));
		autoutil.clickButton(dataSheet(credentials, "label","partner"),propFile("gmsSpecialxpath2findpartner"));
		autoutil.clickButton(dataSheet(credentials, "button","selectChange"),propFile("button"));
		
	
		
		
		
		
		
		
	}



	public void gms_SignOut(
			LinkedHashMap<String, LinkedHashMap<String, String>> credentials) {
		autoutil.isExists("//title[contains(.,'GMS Governance')]");
		autoutil.isDisplayed("//title[contains(.,'GMS Governance')]");
		autoutil.clickButton(dataSheet(credentials, "select","admin"),propFile("span"));
		autoutil.clickButton(dataSheet(credentials, "button","logout"),propFile("link"));

		
		//logout
	/*	autoutil.waitTime(8000);
		autoutil.clickButton(dataSheet(credentials,"hyperlink","home"),propFile("link2"));
		autoutil.waitTime(4000);
		autoutil.clickButton(dataSheet(credentials,"button","logout"),propFile("link"));
		autoutil.clickLink(propFile("link").replace("CONSTANT", dataSheet(credentials,"button","logout")));*/

	}
	
	
	public void gms_Creationofplayervalidationinportal(
			LinkedHashMap<String, LinkedHashMap<String, String>> credentials){
		
	}
	public void gms_Editplayerdetails(
			LinkedHashMap<String, LinkedHashMap<String, String>> credentials){
		
	}
	public void gms_Searchaplayerusingfilters(
			LinkedHashMap<String, LinkedHashMap<String, String>> credentials){
		
	}
	public void gms_Brandsandpartnerconfigurations(
			LinkedHashMap<String, LinkedHashMap<String, String>> credentials){
		
	}
	public void gms_ResponsibleGamingAutoexclusionlimitsetup(
			LinkedHashMap<String, LinkedHashMap<String, String>> credentials){
		
	}
	public void gms_Reports(
			LinkedHashMap<String, LinkedHashMap<String, String>> credentials){
		
	}
	public void gms_EmailNotifications(
			LinkedHashMap<String, LinkedHashMap<String, String>> credentials){
		
	}
	public void gms_BonusBagcreationforaplayer(
			LinkedHashMap<String, LinkedHashMap<String, String>> credentials){
		
	}
	public void gms_CloseandSuspendaccount(
			LinkedHashMap<String, LinkedHashMap<String, String>> credentials){
		
	}
	public void gms_PlayerGrouping(
			LinkedHashMap<String, LinkedHashMap<String, String>> credentials){
		
	}

	public void gms_addAbuseNickName(
			LinkedHashMap<String, LinkedHashMap<String, String>> credentials){
	
		autoutil.clickButton("//span[contains(.,'Admin')]");
		autoutil.clickButton("//span[contains(.,'Gaming')]");
		//autoutil.clickButton("//ul/li/a[contains(.,'Accounting')]");

		
		
		Actions mouseActions = new Actions(driver);
		mouseActions.moveToElement(driver.findElement(By.xpath("//ul/li/a[contains(.,'Management')]"))).build().perform();
		mouseActions.moveToElement(driver.findElement(By.xpath("//ul/li/a[contains(.,'Nickname Management')]"))).build().perform();
		
		mouseActions.moveToElement(driver.findElement(By.xpath("//ul/li/a[contains(.,'Blacklist (Platform Nickname)')]"))).click().build().perform();

		
		autoutil.clickButton("//label[contains(.,'Game Platform *')]/following-sibling::*/div");


		
		for (WebElement element : driver.findElements(By.xpath("//div[@class='select2-result-label']"))) {
			System.out.println(element.getText());
			if(element.getText().equals("PORTAL")){
				element.click();
				break;
				
			}
		}
		
		autoutil.clickButton("//button[contains(.,'Add')]");
	
		autoutil.verifyingLabelsAndTextTheFields("NickName", "abused");
		autoutil.clickButton("//a[contains(.,'Save')]");
		autoutil.waitTime(4000);
		if(autoutil.isExists("//a[contains(.,'Cancel')]") && autoutil.isDisplayed("//a[contains(.,'Cancel')]"))
		autoutil.clickButton("//a[contains(.,'Cancel')]");
		autoutil.waitTime(9000);

		
		
		
		
		
	}
	
}
