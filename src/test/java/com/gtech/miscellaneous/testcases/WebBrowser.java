/**
 * 
 */
package com.gtech.miscellaneous.testcases;

import java.lang.reflect.Method;
import java.util.LinkedHashMap;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.gtech.miscellaneous.implementation.WebBrowser_Implemenation;
import com.gtech.util.DataSource;

/**
 * @author bhupesh.b
 *
 */

public class WebBrowser {
	
		
	WebBrowser_Implemenation  browser_Implemenation = null;
	DataSource dd = new DataSource();

	public void getInstance() {
		if(browser_Implemenation==null)
			browser_Implemenation = new WebBrowser_Implemenation();
	}
	
	
	
	@BeforeClass()
	public void beforeClass(){
		browser_Implemenation = new WebBrowser_Implemenation();
	}
	
//data providers	
	@DataProvider(parallel=true)
	public Object[][] DataProvider(Method m){
		Object[][] object =null;
		object =dd.dataDrive(m.getName());
		return object;
	}
	
	
	
	
	//static Logger log =Util4Modules.log();
	

	@Test(dataProvider="DataProvider",groups={"openBrowser"})
	public void game_openBrowser(LinkedHashMap<String, LinkedHashMap<String, String>> credentials) {
		getInstance();browser_Implemenation.game_openBrowser(credentials);
	}
	
	@Test(groups={"closeBrowser"} ,alwaysRun=true)
	public void game_closeBrowser() {
		browser_Implemenation.game_closeBrowser();

	}

	
}
