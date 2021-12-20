package scripts;

import java.awt.event.KeyEvent;
import java.util.HashMap;
import java.util.NoSuchElementException;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import core.BaseClass;
import core.Generic;
import pages.HeroHome;


/* 
* This class - script class contains data provider, test methods
* */
public class GetCredentials extends BaseClass{
	Generic gen = new Generic();			
	
	/*@DataProvider(name="testData")
	public Object[][] getData2() throws Exception{
		String data[][] = gen.getTableArray(new java.io.File(".").getCanonicalPath() + "\\data\\table.xls","Sheet1","Data");	
		
		return data;
	}*/
		
	/*Get the credentials and login for heroku site 
	 *  */
	
	@Test()
	public void credLogin() throws Exception{		
		String usernm, pwd;
		
		gen.setUp(browserType,executionType , "", driverPath);
		gen.setTestcaseName("credLogin");
		gen.InitializedetailedReport();
		
		HeroHome  home= new HeroHome();
		home.launch(gen, baseUrl);			
		gen.clickonObject(gen.getProperty("lnkForm"),"xpath", "form link");
		
		usernm=gen.getText(gen.getProperty("txtUsrName"), "xpath", "text area");		
		
		pwd=gen.getText(gen.getProperty("txtPwd"), "xpath", "text area");		
		
		gen.setValueonObject(gen.getProperty("tbox"), "xpath", usernm, "user id");
		
		gen.setValueonObject(gen.getProperty("tpwd"), "xpath", pwd, "pwd");
		
		gen.clickObjectUsingJS(gen.getProperty("btnSub"), "xpath", "submit");
		
		gen.verifyText(gen.getProperty("alrtMessage"), "xpath", "logged into");
		
		gen.clickObjectUsingJS(gen.getProperty("btnLogout"), "xpath", "Logout");
		
		gen.setValueonObject(gen.getProperty("tbox"), "xpath", "abcd", "user id");
		
		gen.clickObjectUsingJS(gen.getProperty("btnSub"), "xpath", "submit");
		
		gen.verifyText(gen.getProperty("alrtMessage"), "xpath", "invalid");
								
		gen.EndHtmlDetailReporter();
		
		gen.closecurrentPage();
	}
	
}
