/**
 * 
 */
package com.gtech.portal.testcases;

import java.lang.reflect.Method;
import java.util.LinkedHashMap;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.gtech.portal.implementation.Login_Implementation;
import com.gtech.portal.implementation.PortalSignUP_Implementation;
import com.gtech.util.DataSource;

/**
 * @author bhupesh.b
 *
 */

public class PortalSignUP {
	//static Logger log =Util4Modules.log();
	PortalSignUP_Implementation  signUP_Implementation = null;
	DataSource dd = new DataSource();

	public void getInstance() {
		if(signUP_Implementation==null)
			signUP_Implementation = new PortalSignUP_Implementation();
	}
	
	
	
	@BeforeClass()
	public void beforeClass(){
		signUP_Implementation = new PortalSignUP_Implementation();
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
	


@Test(dataProvider="DataProvider4Iterations",priority=1,groups = { "smokeTest" ,"signIn2"})
public void game_SignUp(
		LinkedHashMap<String, LinkedHashMap<String, String>> credentials) {
getInstance();signUP_Implementation.game_SignUp(credentials);
}

@Test(dataProvider="DataProvider",priority=1,groups = { "smokeTest" ,"signIn2"})
public void game_SignOut(
		LinkedHashMap<String, LinkedHashMap<String, String>> credentials) {
getInstance();signUP_Implementation.game_SignOut(credentials);
}



}
