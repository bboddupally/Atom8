/**
 * 
 */
package com.gtech.gms.testcases;

import java.lang.reflect.Method;
import java.util.LinkedHashMap;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.gtech.gms.implementation.LoginGMS_Implementation;
import com.gtech.util.DataSource;

/**
 * @author bhupesh.b
 *
 */

public class LoginGMS {
	//static Logger log =Util4Modules.log();
	LoginGMS_Implementation  login = null;
	DataSource dd = new DataSource();

	public void getInstance() {
		if(login==null)
			login = new LoginGMS_Implementation();
	}
	
	
	
	@BeforeClass()
	public void beforeClass(){
		login = new LoginGMS_Implementation();
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
		object =dd.dataDrive4Iteration(m.getName());
		return object;
	}
	

@Test(dataProvider="DataProvider",priority=1,groups = { "gmssignIn"})
	public void gms_SignIn (
			LinkedHashMap<String, LinkedHashMap<String, String>> credentials) throws InterruptedException {
	getInstance();login.gms_SignIn(credentials);
	}

@Test(dataProvider="DataProvider",priority=1,groups = { "gmssmokeTest" ,"abuseNik"})

public void gms_addAbuseNickName(
		LinkedHashMap<String, LinkedHashMap<String, String>> credentials){
	getInstance();login.gms_addAbuseNickName(credentials);

}


@Test(dataProvider="DataProvider",priority=1,groups = { "abuseNik"})
public void gms_SignOut(
		LinkedHashMap<String, LinkedHashMap<String, String>> credentials) {
getInstance();login.gms_SignOut(credentials);
}




@Test(dataProvider="DataProvider",priority=1,groups = { "gmssmokeTest" })

public void gms_Creationofplayervalidationinportal(
		LinkedHashMap<String, LinkedHashMap<String, String>> credentials){
	getInstance();login.gms_Creationofplayervalidationinportal(credentials);

}
@Test(dataProvider="DataProvider",priority=1,groups = { "gmssmokeTest" })
public void gms_Editplayerdetails(
		LinkedHashMap<String, LinkedHashMap<String, String>> credentials){
	getInstance();login.gms_Editplayerdetails(credentials);

}
@Test(dataProvider="DataProvider",priority=1,groups = { "gmssmokeTest" })

public void gms_Searchaplayerusingfilters(
		LinkedHashMap<String, LinkedHashMap<String, String>> credentials){
	getInstance();login.gms_Searchaplayerusingfilters(credentials);

}
@Test(dataProvider="DataProvider",priority=1,groups = { "gmssmokeTest" })

public void gms_Brandsandpartnerconfigurations(
		LinkedHashMap<String, LinkedHashMap<String, String>> credentials){
	getInstance();login.gms_Brandsandpartnerconfigurations(credentials);

}
@Test(dataProvider="DataProvider",priority=1,groups = { "gmssmokeTest" })

public void gms_ResponsibleGamingAutoexclusionlimitsetup(
		LinkedHashMap<String, LinkedHashMap<String, String>> credentials){
	getInstance();login.gms_ResponsibleGamingAutoexclusionlimitsetup(credentials);

}
@Test(dataProvider="DataProvider",priority=1,groups = { "gmssmokeTest" })

public void gms_Reports(
		LinkedHashMap<String, LinkedHashMap<String, String>> credentials){
	getInstance();login.gms_Reports(credentials);

}
@Test(dataProvider="DataProvider",priority=1,groups = { "gmssmokeTest" })

public void gms_EmailNotifications(
		LinkedHashMap<String, LinkedHashMap<String, String>> credentials){
	getInstance();login.gms_EmailNotifications(credentials);

}
@Test(dataProvider="DataProvider",priority=1,groups = { "gmssmokeTest" })

public void gms_BonusBagcreationforaplayer(
		LinkedHashMap<String, LinkedHashMap<String, String>> credentials){
	getInstance();login.gms_BonusBagcreationforaplayer(credentials);

}
@Test(dataProvider="DataProvider",priority=1,groups = { "gmssmokeTest" })

public void gms_CloseandSuspendaccount(
		LinkedHashMap<String, LinkedHashMap<String, String>> credentials){
	getInstance();login.gms_CloseandSuspendaccount(credentials);

}
@Test(dataProvider="DataProvider",priority=1,groups = { "gmssmokeTest" })

public void gms_PlayerGrouping(
		LinkedHashMap<String, LinkedHashMap<String, String>> credentials){
	getInstance();login.gms_PlayerGrouping(credentials);

}




















}
