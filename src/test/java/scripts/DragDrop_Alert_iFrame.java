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
public class DragDrop_Alert_iFrame extends BaseClass{
	Generic gen = new Generic();			

	
		
	/*Launch heroku site 
	 * Click on dragdrop and 
	 * Move the element
	 * Take screenshot
	 *  */
	
	@Test()
	public void dragdrop() throws Exception{		
				
		gen.setUp(browserType,executionType , "", driverPath);
		gen.setTestcaseName("dragdrop");
		gen.InitializedetailedReport();
		
		HeroHome  home= new HeroHome();
		home.launch(gen, baseUrl);			
		gen.clickonObject(gen.getProperty("lnkDrag"),"xpath", "drag link");
		Thread.sleep(5000);				
		gen.drgDrop(gen.getProperty("imgFirst"), gen.getProperty("imgSec"), "xpath", "moving element");
		
		gen.EndHtmlDetailReporter();
		
		gen.closecurrentPage();
	}
	
	/*Launch heroku site 
	 * Click on iFrame and 
	 * Enter some text.
	 * Take screenshot
	 *  */
	//@Test()
	public void frame() throws Exception{		
				
		gen.setUp(browserType,executionType , "", driverPath);
		gen.setTestcaseName("dragdrop");
		gen.InitializedetailedReport();
		
		HeroHome  home= new HeroHome();
		home.launch(gen, baseUrl);			
		gen.clickonObject(gen.getProperty("lnkframe"),"xpath", "frane link");
		gen.clickonObject(gen.getProperty("lnkIframe"),"xpath", "I frame");
		gen.switchtoFrame(gen.getProperty("frameId"));
		
		gen.setValueonObject("//p", "xpath", "game start", "frame paragraph");
		gen.clickObjectUsingJS(gen.getProperty("boldtype"), "xpath", "");
		
		gen.EndHtmlDetailReporter();
		
		gen.closecurrentPage();
	}
	/*Launch heroku site 
	 * Click on js alert and 
	 * cancle the alerta.
	 *  */
	//@Test()
	public void verifyAlert() throws Exception{		
	    
		gen.setUp(browserType,executionType , "", driverPath);
		gen.setTestcaseName("multipleWind");
		gen.InitializedetailedReport();
		
		HeroHome  home= new HeroHome();
		home.launch(gen, baseUrl);			
		gen.clickonObject(gen.getProperty("lnkJs"),"xpath", "js link");
		gen.clickonObject(gen.getProperty("btnJS"),"xpath", "js alert btn");
		gen.dismissAlert("alert");
		gen.verifyText(gen.getProperty("canceltext"), "xpath", "You clicked: Cancel");
		gen.EndHtmlDetailReporter();
		gen.closecurrentPage();
		
	}
}
