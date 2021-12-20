package scripts;

import java.util.HashMap;

import core.Generic;

public class SampleCk {

	
	public static void main(String ar[]){
		
		String abc = "johnny";
		String cd="";
		
		char [] st = abc.toCharArray();
	//	System.out.println(cd.length());
		
		HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
		
		Generic g = new Generic();
		System.out.println(g.getProperty("name"));
		
	}
	
}
