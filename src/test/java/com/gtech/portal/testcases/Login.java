/**
 * 
 */
package com.gtech.portal.testcases;

import java.lang.reflect.Method;
import java.util.LinkedHashMap;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.gtech.portal.scripts.Login_Implementation;
import com.gtech.util.DataSource;

/**
 * @author bhupesh.b
 *
 */

public class Login {
	//static Logger log =Util4Modules.log();
	Login_Implementation  login = null;
	DataSource dd = new DataSource();

	public void getInstance() {
		if(login==null)
			login = new Login_Implementation();
	}
	
	
	
	@BeforeClass()
	public void beforeClass(){
		login = new Login_Implementation();
	}
	
//data providers	
	@DataProvider(parallel=true)
	public Object[][] DataProvider(Method m){
		Object[][] object =null;
		object =dd.dataDrive(m.getName());
		return object;
	}
	
	
	
	@DataProvider
	public Object[][] DataProvider4Iterations(Method m){
		Object[][] object =null;
		object =dd.dataDrive(m.getName());
		return object;
	}
	

@Test(dataProvider="DataProvider",priority=1,groups = { "smokeTest" ,"Independent"})
	public void game_SignIn(
			LinkedHashMap<String, LinkedHashMap<String, String>> credentials) {
	getInstance();login.game_SignIn(credentials);
	}



@Test(dataProvider="DataProvider",priority=1,groups = { "Independent" ,"signIn"})
public void game_SignOut(
		LinkedHashMap<String, LinkedHashMap<String, String>> credentials) {
getInstance();login.game_SignOut(credentials);
}

@Test(dataProvider="DataProvider",priority=1,groups = { "smokeTest" ,"signIn"})
public void game_EditAccount(
		LinkedHashMap<String, LinkedHashMap<String, String>> credentials) {
getInstance();login.game_EditAccount(credentials);
}


@Test(dataProvider="DataProvider",priority=1,groups = { "Independent" ,"signIn"})
public void game_DepositAccount(
		LinkedHashMap<String, LinkedHashMap<String, String>> credentials) {
getInstance();login.game_DepositAccount(credentials);
}



@Test(dataProvider="DataProvider",priority=1,groups = { "Independent" ,"signIn"})
public void olg_Register(
		LinkedHashMap<String, LinkedHashMap<String, String>> credentials) {
getInstance();login.olg_Register(credentials);
}
}
