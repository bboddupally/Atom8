package com.gtech.portal.scripts;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.gtech.util.DataSource;
import com.gtech.util.SelectingWebDriver;
import com.gtech.util.Util4Modules;

public class DPortal_Scripts {

	
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
			autoutil.verifyingLabelsAndTextTheFields(entry.getKey(), "cat_"+autoutil.randomString1()+entry.getValue());
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

		//autoutil.closeBrowser();
	}

	
}
