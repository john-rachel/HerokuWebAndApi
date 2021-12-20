package scripts;

import java.awt.event.KeyEvent;
import java.util.HashMap;
import java.util.NoSuchElementException;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import core.BaseClass;
import core.Generic;
import pages.HeroHome;


/* 
* This class - script class contains data provider, test methods
* */
public class ProgressbarMultipleWindows extends BaseClass{
	Generic gen = new Generic();			

	
		
	/*Launch heroku site 
	 * Click on Dynamic loading and verify progress bar
	 *  */
	
	//@Test()
	public void progressBar() throws Exception{		
				
	    
		gen.setTestcaseName("progressBar");
		gen.InitializedetailedReport();
		
		HeroHome  home= new HeroHome();
		home.launch(gen, baseUrl);			
		gen.clickonObject(gen.getProperty("lnkLoading"),"xpath", "form link");
		
		gen.clickObjectUsingJS(gen.getProperty("lnkRender"), "xpath", "lnkRender");
		
		gen.clickonObject(gen.getProperty("btnStart"), "xpath", "btn start");
		
		gen.verifyObjectExist(gen.getProperty("image"), "xpath", 5);
		
		gen.verifyObjInvisible(gen.getProperty("image"), "xpath", 10);
		
		gen.verifyObjectExist(gen.getProperty("finish"), "xpath", 5);
		
		
		gen.EndHtmlDetailReporter();
		
		gen.closecurrentPage();
	}
	
	@Test()
	public void multipleWind() throws Exception{		
	
		gen.setUp(browserType,executionType , "", driverPath);
		gen.setTestcaseName("multipleWind");
		gen.InitializedetailedReport();
		
		HeroHome  home= new HeroHome();
		home.launch(gen, baseUrl);			
		gen.clickonObject(gen.getProperty("lnkMultiple"),"xpath", "form link");
		gen.clickonObject(gen.getProperty("lnkHere"),"xpath", "here");
		gen.switchtoWindow("", "window");
		gen.curUrl();
		gen.closecurrentPage();
		gen.switchBack();
		gen.curUrl();		
		gen.EndHtmlDetailReporter();
		gen.closecurrentPage();
		
	}
}
