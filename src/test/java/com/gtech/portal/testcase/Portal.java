package com.gtech.portal.testcase;

import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.util.LinkedHashMap;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.gtech.portal.scripts.Portal_Scripts;
import com.gtech.util.DataSource;

public class Portal {
	
// all 96 test cases of portal
	
	
	Portal_Scripts scripts   = null;
	DataSource dd = new DataSource();

	public void getInstance() {
		if(scripts==null)
			scripts = new Portal_Scripts();
	}
	
	
	
	@BeforeClass()
	public void beforeClass(){
		scripts = new Portal_Scripts();
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

	@Test(dataProvider="DataProvider4Iterations")
	public void p_Reg_play_for_Free(
			LinkedHashMap<String, LinkedHashMap<String, String>> Credentials) throws MalformedURLException {
getInstance();scripts.p_Reg_play_for_Free(Credentials);
		
	}

	@Test(dataProvider="DataProvider")
	public void p_Reg_play_for_Real(
			LinkedHashMap<String, LinkedHashMap<String, String>> Credentials) {
getInstance();scripts.p_Reg_play_for_Real(Credentials);
		
	}

	@Test(dataProvider="DataProvider")
	public void p_All_fields_error_messages(
			LinkedHashMap<String, LinkedHashMap<String, String>> Credentials) {
getInstance();scripts.p_All_fields_error_messages(Credentials);
		
	}

	@Test(dataProvider="DataProvider")
	public void p_leap_year_validation(
			LinkedHashMap<String, LinkedHashMap<String, String>> Credentials) {
getInstance();scripts.p_leap_year_validation(Credentials);
		
	}

	@Test(dataProvider="DataProvider" ,groups = { "smokeTest" ,"Independent"})
	public void p_Username_abusive_Playforreal(
			LinkedHashMap<String, LinkedHashMap<String, String>> Credentials) {
getInstance();scripts.p_Username_abusive_Playforreal(Credentials);
		
	}

	@Test(dataProvider="DataProvider")
	public void p_Username_abusive_Playforfun(
			LinkedHashMap<String, LinkedHashMap<String, String>> Credentials) {
getInstance();scripts.p_Username_abusive_Playforfun(Credentials);
		
	}

	@Test(dataProvider="DataProvider")
	public void p_Nickname_abusive_Playforreal(
			LinkedHashMap<String, LinkedHashMap<String, String>> Credentials) {
getInstance();scripts.p_Nickname_abusive_Playforreal(Credentials);
		
	}

	@Test(dataProvider="DataProvider")
	public void p_Nickname_abusive_Playforfun(
			LinkedHashMap<String, LinkedHashMap<String, String>> Credentials) {
getInstance();scripts.p_Nickname_abusive_Playforfun(Credentials);
		
	}

	@Test(dataProvider="DataProvider")
	public void p_Verify_mandatory_fields(
			LinkedHashMap<String, LinkedHashMap<String, String>> Credentials) {
getInstance();scripts.p_Verify_mandatory_fields(Credentials);
		
	}

	@Test(dataProvider="DataProvider")
	public void p_years_validation(
			LinkedHashMap<String, LinkedHashMap<String, String>> Credentials) {
getInstance();scripts.p_years_validation(Credentials);
		
	}

	@Test(dataProvider="DataProvider")
	public void p_Login_Verify_Mandatory_fields(
			LinkedHashMap<String, LinkedHashMap<String, String>> Credentials) {
getInstance();scripts.p_Login_Verify_Mandatory_fields(Credentials);
		
	}

	@Test(dataProvider="DataProvider")
	public void p_Login_Username_Validations(
			LinkedHashMap<String, LinkedHashMap<String, String>> Credentials) {
getInstance();scripts.p_Login_Username_Validations(Credentials);
		
	}

	@Test(dataProvider="DataProvider")
	public void p_Login_Password_Validations(
			LinkedHashMap<String, LinkedHashMap<String, String>> Credentials) {
getInstance();scripts.p_Login_Password_Validations(Credentials);
		
	}

	@Test(dataProvider="DataProvider")
	public void p_Login_Login_with_valid_User_name_and_password(
			LinkedHashMap<String, LinkedHashMap<String, String>> Credentials) {
getInstance();scripts.p_Login_Login_with_valid_User_name_and_password(Credentials);
		
	}

	@Test(dataProvider="DataProvider")
	public void p_Login_Failed_Login(
			LinkedHashMap<String, LinkedHashMap<String, String>> Credentials) {
getInstance();scripts.p_Login_Failed_login(Credentials);
		
	}

	@Test(dataProvider="DataProvider")
	public void p_Checking_forgot_username_link(
			LinkedHashMap<String, LinkedHashMap<String, String>> Credentials) {
getInstance();scripts.p_Checking_forgot_username_link(Credentials);
		
	}

	@Test(dataProvider="DataProvider")
	public void p_Firstname_edit(
			LinkedHashMap<String, LinkedHashMap<String, String>> Credentials) {
getInstance();scripts.p_Firstname_edit(Credentials);
		
	}

	@Test(dataProvider="DataProvider")
	public void p_Last_Name_edit(
			LinkedHashMap<String, LinkedHashMap<String, String>> Credentials) {
getInstance();scripts.p_Last_Name_edit(Credentials);
		
	}

	@Test(dataProvider="DataProvider")
	public void p_DOB_edit(
			LinkedHashMap<String, LinkedHashMap<String, String>> Credentials) {
getInstance();scripts.p_DOB_edit(Credentials);
		
	}

	@Test(dataProvider="DataProvider")
	public void p_Gender_edit(
			LinkedHashMap<String, LinkedHashMap<String, String>> Credentials) {
getInstance();scripts.p_Gender_edit(Credentials);
		
	}

	@Test(dataProvider="DataProvider")
	public void p_Country_edit(
			LinkedHashMap<String, LinkedHashMap<String, String>> Credentials) {
getInstance();scripts.p_Country_edit(Credentials);
		
	}

	@Test(dataProvider="DataProvider")
	public void p_Email_edit(
			LinkedHashMap<String, LinkedHashMap<String, String>> Credentials) {
getInstance();scripts.p_Email_edit(Credentials);
		
	}

	@Test(dataProvider="DataProvider")
	public void p_Mobile_phone_number_edit(
			LinkedHashMap<String, LinkedHashMap<String, String>> Credentials) {
getInstance();scripts.p_Mobile_phone_number_edit(Credentials);
		
	}

	@Test(dataProvider="DataProvider")
	public void p_keep_me_updated_news_edit(
			LinkedHashMap<String, LinkedHashMap<String, String>> Credentials) {
getInstance();scripts.p_keep_me_updated_news_edit(Credentials);
		
	}

	@Test(dataProvider="DataProvider")
	public void p_Edit_act_L2_user(
			LinkedHashMap<String, LinkedHashMap<String, String>> Credentials) {
getInstance();scripts.p_Edit_act_L2_user(Credentials);
		
	}

	@Test(dataProvider="DataProvider")
	public void p_Chg_pwd__negative(
			LinkedHashMap<String, LinkedHashMap<String, String>> Credentials) {
getInstance();scripts.p_Chg_pwd__negative(Credentials);
		
	}

	@Test(dataProvider="DataProvider")
	public void p_Chg_pwd_validations(
			LinkedHashMap<String, LinkedHashMap<String, String>> Credentials) {
getInstance();scripts.p_Chg_pwd_validations(Credentials);
		
	}

	@Test(dataProvider="DataProvider")
	public void p_Chg_pwd_Positive(
			LinkedHashMap<String, LinkedHashMap<String, String>> Credentials) {
getInstance();scripts.p_Chg_pwd_Positive(Credentials);
		
	}

	@Test(dataProvider="DataProvider")
	public void p_Act_Navigation_Bar_Logged_out(
			LinkedHashMap<String, LinkedHashMap<String, String>> Credentials) {
getInstance();scripts.p_Act_Navigation_Bar_Logged_out(Credentials);
		
	}

	@Test(dataProvider="DataProvider")
	public void p_Act_Navigation_Bar_L1_user(
			LinkedHashMap<String, LinkedHashMap<String, String>> Credentials) {
getInstance();scripts.p_Act_Navigation_Bar_L1_user(Credentials);
		
	}

	@Test(dataProvider="DataProvider")
	public void p_Act_Navigation_Bar_L2_user(
			LinkedHashMap<String, LinkedHashMap<String, String>> Credentials) {
getInstance();scripts.p_Act_Navigation_Bar_L2_user(Credentials);
		
	}

	@Test(dataProvider="DataProvider")
	public void p_Navigation_Bar_Logged_out(
			LinkedHashMap<String, LinkedHashMap<String, String>> Credentials) {
getInstance();scripts.p_Navigation_Bar_Logged_out(Credentials);
		
	}

	@Test(dataProvider="DataProvider")
	public void p_Navigation_Bar_L1_user(
			LinkedHashMap<String, LinkedHashMap<String, String>> Credentials) {
getInstance();scripts.p_Navigation_Bar_L1_user(Credentials);
		
	}

	@Test(dataProvider="DataProvider")
	public void p_Navigation_Bar_L2_user(
			LinkedHashMap<String, LinkedHashMap<String, String>> Credentials) {
getInstance();scripts.p_Navigation_Bar_L2_user(Credentials);
		
	}

	@Test(dataProvider="DataProvider")
	public void p_Sticky_Tab_logged_out(
			LinkedHashMap<String, LinkedHashMap<String, String>> Credentials) {
getInstance();scripts.p_Sticky_Tab_logged_out(Credentials);
		
	}

	@Test(dataProvider="DataProvider")
	public void p_Sticky_Tab_Login_L1_user(
			LinkedHashMap<String, LinkedHashMap<String, String>> Credentials) {
getInstance();scripts.p_Sticky_Tab_Login_L1_user(Credentials);
		
	}

	@Test(dataProvider="DataProvider")
	public void p_Sticky_Tab_Login_L2_user(
			LinkedHashMap<String, LinkedHashMap<String, String>> Credentials) {
getInstance();scripts.p_Sticky_Tab_Login_L2_user(Credentials);
		
	}

	@Test(dataProvider="DataProvider")
	public void p_Setdepositlimits_Fields_validation(
			LinkedHashMap<String, LinkedHashMap<String, String>> Credentials) {
getInstance();scripts.p_Setdepositlimits_Fields_validation(Credentials);
		
	}

	@Test(dataProvider="DataProvider")
	public void p_Setdepositlimits_daily(
			LinkedHashMap<String, LinkedHashMap<String, String>> Credentials) {
getInstance();scripts.p_Setdepositlimits_daily(Credentials);
		
	}

	@Test(dataProvider="DataProvider")
	public void p_Self_Exclustion(
			LinkedHashMap<String, LinkedHashMap<String, String>> Credentials) {
getInstance();scripts.p_Self_Exclustion(Credentials);
		
	}

	public void p_Firsttime_visitor_dropdownbutton(
			LinkedHashMap<String, LinkedHashMap<String, String>> Credentials) {
getInstance();scripts.p_Firsttime_visitor_dropdownbutton(Credentials);
		
	}

	public void p_Returnplayer_dropdownbutton(
			LinkedHashMap<String, LinkedHashMap<String, String>> Credentials) {
getInstance();scripts.p_Returnplayer_dropdownbutton(Credentials);
		
	}

	@Test(dataProvider="DataProvider")
	public void p_Logged_in_player_dropdownbutton(
			LinkedHashMap<String, LinkedHashMap<String, String>> Credentials) {
getInstance();scripts.p_Logged_in_player_dropdownbutton(Credentials);
		
	}

	@Test(dataProvider="DataProvider")
	public void p_Logged_in_player_delete_cookies_dropdown(
			LinkedHashMap<String, LinkedHashMap<String, String>> Credentials) {
getInstance();scripts.p_Logged_in_player_delete_cookies_dropdown(Credentials);
		
	}

	@Test(dataProvider="DataProvider")
	public void p_New_player_firsttime_visitor_call_to_action(
			LinkedHashMap<String, LinkedHashMap<String, String>> Credentials) {
getInstance();scripts.p_New_player_firsttime_visitor_call_to_action(Credentials);
		
	}

	@Test(dataProvider="DataProvider")
	public void p_Returnplayer_call_to_action(
			LinkedHashMap<String, LinkedHashMap<String, String>> Credentials) {
getInstance();scripts.p_Returnplayer_call_to_action(Credentials);
		
	}

	@Test(dataProvider="DataProvider")
	public void p_Loggedinplayer_call_to_action(
			LinkedHashMap<String, LinkedHashMap<String, String>> Credentials) {
getInstance();scripts.p_Loggedinplayer_call_to_action(Credentials);
		
	}

	@Test(dataProvider="DataProvider")
	public void p_Loggedinplayer_cookiesdelete_Call_to_action(
			LinkedHashMap<String, LinkedHashMap<String, String>> Credentials) {
getInstance();scripts.p_Loggedinplayer_cookiesdelete_Call_to_action(Credentials);
		
	}

	@Test(dataProvider="DataProvider")
	public void p_Logged_in_livehelp(
			LinkedHashMap<String, LinkedHashMap<String, String>> Credentials) {
getInstance();scripts.p_Logged_in_livehelp(Credentials);
		
	}

	@Test(dataProvider="DataProvider")
	public void p_Non_logged_livehelp(
			LinkedHashMap<String, LinkedHashMap<String, String>> Credentials) {
getInstance();scripts.p_Non_logged_livehelp(Credentials);
		
	}

	@Test(dataProvider="DataProvider")
	public void p_Bingo_Lobby_Logged_out_New_visitor(
			LinkedHashMap<String, LinkedHashMap<String, String>> Credentials) {
getInstance();scripts.p_Bingo_Lobby_Logged_out_New_visitor(Credentials);
		
	}

	@Test(dataProvider="DataProvider")
	public void p_Bingo_Lobby_Logged_out_return_player(
			LinkedHashMap<String, LinkedHashMap<String, String>> Credentials) {
getInstance();scripts.p_Bingo_Lobby_Logged_out_return_player(Credentials);
		
	}

	@Test(dataProvider="DataProvider")
	public void p_Bingo_lobby_Logged_out_cookies_clear(
			LinkedHashMap<String, LinkedHashMap<String, String>> Credentials) {
getInstance();scripts.p_Bingo_lobby_Logged_out_cookies_clear(Credentials);
		
	}

	@Test(dataProvider="DataProvider")
	public void p_Bingo_lobby_L1_user(
			LinkedHashMap<String, LinkedHashMap<String, String>> Credentials) {
getInstance();scripts.p_Bingo_lobby_L1_user(Credentials);
		
	}

	@Test(dataProvider="DataProvider")
	public void p_Bingo_lobby_L2_user(
			LinkedHashMap<String, LinkedHashMap<String, String>> Credentials) {
getInstance();scripts.p_Bingo_lobby_L2_user(Credentials);
		
	}

	@Test(dataProvider="DataProvider")
	public void p_Logged_out_New_visitor_bingolauncher(
			LinkedHashMap<String, LinkedHashMap<String, String>> Credentials) {
getInstance();scripts.p_Logged_out_New_visitor_bingolauncher(Credentials);
		
	}

	@Test(dataProvider="DataProvider")
	public void p_Logged_out_return_player_bingolauncher(
			LinkedHashMap<String, LinkedHashMap<String, String>> Credentials) {
getInstance();scripts.p_Logged_out_return_player_bingolauncher(Credentials);
		
	}

	@Test(dataProvider="DataProvider")
	public void p_Logged_out_cookies_clear_bingolauncher(
			LinkedHashMap<String, LinkedHashMap<String, String>> Credentials) {
getInstance();scripts.p_Logged_out_cookies_clear_bingolauncher(Credentials);
		
	}

	@Test(dataProvider="DataProvider")
	public void p_L1_user_bingolauncher(
			LinkedHashMap<String, LinkedHashMap<String, String>> Credentials) {
getInstance();scripts.p_L1_user_bingolauncher(Credentials);
		
	}

	@Test(dataProvider="DataProvider")
	public void p_L2_user_bingolauncher(
			LinkedHashMap<String, LinkedHashMap<String, String>> Credentials) {
getInstance();scripts.p_L2_user_bingolauncher(Credentials);
		
	}

	@Test(dataProvider="DataProvider")
	public void p_Logged_out_New_visitor_casinolauncher(
			LinkedHashMap<String, LinkedHashMap<String, String>> Credentials) {
getInstance();scripts.p_Logged_out_New_visitor_casinolauncher(Credentials);
		
	}

	@Test(dataProvider="DataProvider")
	public void p_Logged_out_return_player_casinolauncher(
			LinkedHashMap<String, LinkedHashMap<String, String>> Credentials) {
getInstance();scripts.p_Logged_out_return_player_casinolauncher(Credentials);
		
	}

	@Test(dataProvider="DataProvider")
	public void p_Logged_out_cookies_clear_casinolauncher(
			LinkedHashMap<String, LinkedHashMap<String, String>> Credentials) {
getInstance();scripts.p_Logged_out_cookies_clear_casinolauncher(Credentials);
		
	}

	@Test(dataProvider="DataProvider")
	public void p_L1_user_casinolauncher(
			LinkedHashMap<String, LinkedHashMap<String, String>> Credentials) {
getInstance();scripts.p_L1_user_casinolauncher(Credentials);
		
	}

	@Test(dataProvider="DataProvider")
	public void p_L2_user_casinolauncher(
			LinkedHashMap<String, LinkedHashMap<String, String>> Credentials) {
getInstance();scripts.p_L2_user_casinolauncher(Credentials);
		
	}

	@Test(dataProvider="DataProvider")
	public void p_Logged_out_carouselcomponent(
			LinkedHashMap<String, LinkedHashMap<String, String>> Credentials) {
getInstance();scripts.p_Logged_out_carouselcomponent(Credentials);
		
	}

	@Test(dataProvider="DataProvider")
	public void p_L2_account_carouselcomponent(
			LinkedHashMap<String, LinkedHashMap<String, String>> Credentials) {
getInstance();scripts.p_L2_account_carouselcomponent(Credentials);
		
	}

	@Test(dataProvider="DataProvider")
	public void p_L1_Account_carouselcomponent(
			LinkedHashMap<String, LinkedHashMap<String, String>> Credentials) {
getInstance();scripts.p_L1_Account_carouselcomponent(Credentials);
		
	}

	@Test(dataProvider="DataProvider")
	public void p_logout_articlecomponent(
			LinkedHashMap<String, LinkedHashMap<String, String>> Credentials) {
getInstance();scripts.p_logout_articlecomponent(Credentials);
		
	}

	@Test(dataProvider="DataProvider")
	public void p_L2_Account_articlecomponent(
			LinkedHashMap<String, LinkedHashMap<String, String>> Credentials) {
getInstance();scripts.p_L2_Account_articlecomponent(Credentials);
		
	}

	@Test(dataProvider="DataProvider")
	public void p_L1_Account_articlecomponent(
			LinkedHashMap<String, LinkedHashMap<String, String>> Credentials) {
getInstance();scripts.p_L1_Account_articlecomponent(Credentials);
		
	}

	@Test(dataProvider="DataProvider")
	public void p_Article_lobby_Logout(
			LinkedHashMap<String, LinkedHashMap<String, String>> Credentials) {
getInstance();scripts.p_Article_lobby_Logout(Credentials);
		
	}

	@Test(dataProvider="DataProvider")
	public void p_Article_lobby_L2(
			LinkedHashMap<String, LinkedHashMap<String, String>> Credentials) {
getInstance();scripts.p_Article_lobby_L2(Credentials);
		
	}

	@Test(dataProvider="DataProvider")
	public void p_Article_lobby_L1(
			LinkedHashMap<String, LinkedHashMap<String, String>> Credentials) {
getInstance();scripts.p_Article_lobby_L1(Credentials);
		
	}

	@Test(dataProvider="DataProvider")
	public void p_logout_articlealert(
			LinkedHashMap<String, LinkedHashMap<String, String>> Credentials) {
getInstance();scripts.p_logout_articlealert(Credentials);
		
	}

	@Test(dataProvider="DataProvider")
	public void p_L1_Player_articlealert(
			LinkedHashMap<String, LinkedHashMap<String, String>> Credentials) {
getInstance();scripts.p_L1_Player_articlealert(Credentials);
		
	}

	@Test(dataProvider="DataProvider")
	public void p_L2_Player_articlealert(
			LinkedHashMap<String, LinkedHashMap<String, String>> Credentials) {
getInstance();scripts.p_L2_Player_articlealert(Credentials);
		
	}

	@Test(dataProvider="DataProvider")
	public void p_Logged_out_New_visitor_casinolobby(
			LinkedHashMap<String, LinkedHashMap<String, String>> Credentials) {
getInstance();scripts.p_Logged_out_New_visitor_casinolobby(Credentials);
		
	}

	@Test(dataProvider="DataProvider")
	public void p_Logged_out_return_player_casinolobby(
			LinkedHashMap<String, LinkedHashMap<String, String>> Credentials) {
getInstance();scripts.p_Logged_out_return_player_casinolobby(Credentials);
		
	}

	@Test(dataProvider="DataProvider")
	public void p_Logged_out_cookies_clear_casinolobby(
			LinkedHashMap<String, LinkedHashMap<String, String>> Credentials) {
getInstance();scripts.p_Logged_out_cookies_clear_casinolobby(Credentials);
		
	}

	@Test(dataProvider="DataProvider")
	public void p_L1_user_casinolobby(
			LinkedHashMap<String, LinkedHashMap<String, String>> Credentials) {
getInstance();scripts.p_L1_user_casinolobby(Credentials);
		
	}

	@Test(dataProvider="DataProvider")
	public void p_L2_user_casinolobby(
			LinkedHashMap<String, LinkedHashMap<String, String>> Credentials) {
getInstance();scripts.p_L2_user_casinolobby(Credentials);
		
	}

	@Test(dataProvider="DataProvider")
	public void p_L1_Account_Deposit_history(
			LinkedHashMap<String, LinkedHashMap<String, String>> Credentials) {
getInstance();scripts.p_L1_Account_Deposit_history(Credentials);
		
	}

	@Test(dataProvider="DataProvider")
	public void p_L2_Account_Deposit_history(
			LinkedHashMap<String, LinkedHashMap<String, String>> Credentials) {
getInstance();scripts.p_L2_Account_Deposit_history(Credentials);
		
	}

	@Test(dataProvider="DataProvider")
	public void p_L1_Account_withdrawal_history(
			LinkedHashMap<String, LinkedHashMap<String, String>> Credentials) {
getInstance();scripts.p_L1_Account_withdrawal_history(Credentials);
		
	}

	@Test(dataProvider="DataProvider")
	public void p_L2_Account_withdrawal_history(
			LinkedHashMap<String, LinkedHashMap<String, String>> Credentials) {
getInstance();scripts.p_L2_Account_withdrawal_history(Credentials);
		
	}

	@Test(dataProvider="DataProvider")
	public void p_L1_Account_Transaction_history(
			LinkedHashMap<String, LinkedHashMap<String, String>> Credentials) {
getInstance();scripts.p_L1_Account_Transaction_history(Credentials);
		
	}

	@Test(dataProvider="DataProvider")
	public void p_L2_Account_Transaction_history(
			LinkedHashMap<String, LinkedHashMap<String, String>> Credentials) {
getInstance();scripts.p_L2_Account_Transaction_history(Credentials);
		
	}

	@Test(dataProvider="DataProvider")
	public void p_L1_Account_Bonus_History(
			LinkedHashMap<String, LinkedHashMap<String, String>> Credentials) {
getInstance();scripts.p_L1_Account_Bonus_History(Credentials);
		
	}

	@Test(dataProvider="DataProvider")
	public void p_L2_Account_Bonus_History(
			LinkedHashMap<String, LinkedHashMap<String, String>> Credentials) {
getInstance();scripts.p_L2_Account_Bonus_History(Credentials);
		
	}

	@Test(dataProvider="DataProvider")
	public void p_Loggedout_uploaddocuments(
			LinkedHashMap<String, LinkedHashMap<String, String>> Credentials) {
getInstance();scripts.p_Loggedout_uploaddocuments(Credentials);
		
	}

	@Test(dataProvider="DataProvider")
	public void p_L1_user_uploaddocuments(
			LinkedHashMap<String, LinkedHashMap<String, String>> Credentials) {
getInstance();scripts.p_L1_user_uploaddocuments(Credentials);
		
	}

	@Test(dataProvider="DataProvider")
	public void p_L2_user_uploaddocuments(
			LinkedHashMap<String, LinkedHashMap<String, String>> Credentials) {
getInstance();scripts.p_L2_user_uploaddocuments(Credentials);
		
	}


}
