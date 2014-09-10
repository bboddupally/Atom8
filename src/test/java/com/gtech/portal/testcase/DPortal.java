package com.gtech.portal.testcase;

import java.lang.reflect.Method;
import java.util.LinkedHashMap;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.gtech.portal.scripts.DPortal_Scripts;
import com.gtech.portal.scripts.Portal_Scripts;
import com.gtech.util.DataSource;

public class DPortal {
	
// all 96 test cases of portal
	
	
	DPortal_Scripts scripts   = null;
	DataSource dd = new DataSource();

	public void getInstance() {
		if(scripts==null)
			scripts = new DPortal_Scripts();
	}
	
	
	
	@BeforeClass()
	public void beforeClass(){
		scripts = new DPortal_Scripts();
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
	
	

	

	@Test(dataProvider="DataProvider4Iterations" ,groups = { "smokeTest" ,"Independent"})
	public void p_Combinations_step1_reg(
			LinkedHashMap<String, LinkedHashMap<String, String>> Credentials) {
getInstance();scripts.p_Combinations_step1_reg(  Credentials);
		
	}



}
