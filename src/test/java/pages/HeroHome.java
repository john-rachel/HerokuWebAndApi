package pages;


import java.util.HashMap;

import org.openqa.selenium.By;


import core.Generic;

/* 
 * This class - page class describing the locators, methods operations
 * */
public class HeroHome {

	
	 public static String txtSearch = "//input[@name='q']";
	 
	 /* 
	  * This method - launch browser by sending the url from testng xml
	  * */
public void launch(Generic gen, String baseUrl) throws Exception{
		 gen.openURL(baseUrl);
		 gen.waitTime();
}

/* 
 * This method - search keyword - storing wine titles and verifying the keyword
 * clicking on the result
 * 
 * */
public void search(Generic gen, String wine) throws Exception{
	    gen.setValueonObject(txtSearch, "xpath", wine, "Search box");
	    gen.robs(10);
	    gen.waitTime();
	//    int Resultsize =  gen.driver.findElements(By.xpath(resultList)).size();
	   
	  //  System.out.println(Resultsize);
	    
	    HashMap<Integer,String> hm = new HashMap<Integer,String>();
	   
	    
	   // String title=gen.getText(heading, "xpath", "title");
	    
	    //Verifying the heading contains the keyword
	    
	//   boolean val= title.contains(wine);
	   
	//   System.out.println("The keyword is present in the title ::"+val);
	   
}
		 
		 
}
