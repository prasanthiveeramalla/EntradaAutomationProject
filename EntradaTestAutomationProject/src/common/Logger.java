package common;

import org.testng.Assert;
import org.testng.Reporter;

public class Logger {
	
public static String resultfilename = null;
	
	public static void log(String message){
		Reporter.log("<b style=\"color:#0000FF\";>info:=</b>"+message+"<p><hr></hr>", true);
	}
	
	public static void beginStep(String message){
		//Reporter.log("<hr><b style=\"color:#556B2F\";>"+message+"<p style=\"background-color: #006666\";><hr></b>", true);
		Reporter.log("<b style=\"color:#660066\";>"+message+"</b><hr></hr>", true);
	}
	
	public static void endStep(){
		Reporter.log("<b style=\"color:#660066\";><hr>", true);
	}
	
	
	
	public static void pass(String message,boolean takeScreenshot, String sTestType) {
		Reporter.log("<b style=\"color:#008000\">Pass: "+message+"</b><hr>", true);
		
	}
	
	public static void fail(String message,boolean takeScreenshot, String sTestType) {
		Reporter.log("<hr><b style=\"color:#FF0000	\";>Fail: "+message+"</b>", true);
		
	}
	
	public static void warn(String message,boolean takeScreenshot, String sTestType) {
		Reporter.log("<b style=\"color:#FFA500\";>Warn:= "+message+"</b>", true);
		
	}
	
	
	public static void assertEquals(String actual,String expected,String message, String sTestType){
		log("<b>AssertEquals:=</b>"+message+", <b style=\"color:#800000\";>Expected:=</b>"+expected+"<b style=\"color:#FF00FF\";> Actual:=</b>"+actual);
		if(actual.equals(expected)) {
			Reporter.log("<b>AssertEquals:=</b>"+message+", <b style=\"color:#800000\";>Expected:=</b>"+expected+"<b style=\"color:#FF00FF\";> Actual:=</b>"+actual);
			pass("AssertEquals:="+message+" Expected:="+expected+" Actual:="+actual, true, sTestType);
		}else {
			Reporter.log("<b style=\"background-color:#800000;\">AssertEquals:=</b>"+message+", <b style=\"color:#800000\";>Expected:=</b>"+expected+"<b style=\"color:#FF00FF\";> Actual:=</b>"+actual);
			fail("AssertEquals:="+message+" Expected:="+expected+" Actual:="+actual, true, sTestType);
		}
		Assert.assertEquals(actual, expected,message);
	}
	public static void assertContains(String actual,String expected,String message){
		boolean assertionStatus=false;
		log("<b>AssertContains:=</b>"+message+", <b style=\"color:#800000\";>Expected:=</b>"+expected+"<b style=\"color:#FF00FF\";> Actual:=</b>"+actual);
		if(actual.toLowerCase().contains(expected.toLowerCase())){
			Reporter.log("<b>AssertContains:=</b>"+message+", <b style=\"color:#800000\";>Expected:=</b>"+expected+"<b style=\"color:#FF00FF\";> Actual:=</b>"+actual);
			assertionStatus=true;
		}else {
			Reporter.log("<b style=\"background-color:#800000;\">AssertContains:=</b>"+message+", <b style=\"color:#800000\";>Expected:=</b>"+expected+"<b style=\"color:#FF00FF\";> Actual:=</b>"+actual);
		}
		Assert.assertEquals(assertionStatus,true,message);
	}
	
	public static void assertNotNull(String actual,String message){
		boolean assertionStatus=false;
		log("<b>AssertNotNull:=</b>"+message+", <b style=\"color:#FF00FF\";> Actual:=</b>"+actual);
		
		if(actual!=null&&!actual.isEmpty()&&!actual.equalsIgnoreCase("na")){
			Reporter.log("<b>AssertNotNull:=</b>"+message+", <b style=\"color:#FF00FF\";> Actual:=</b>"+actual);
			assertionStatus=true;
		}else {
			Reporter.log("<b style=\"background-color:#800000;\">AssertNotNull:=</b>"+message+", <b style=\"color:#FF00FF\";> Actual:=</b>"+actual);
		}
		Assert.assertEquals(assertionStatus,true,message);
	}
	
	public static void assertContainsAnyWord(String actual,String expected,String message){
		boolean assertionStatus=false;
		log("<b>AssertContainsAnyWord:=</b>"+message+", <b style=\"color:#800000\";>Expected:=</b>"+expected+"<b style=\"color:#FF00FF\";> Actual:=</b>"+actual);
		Reporter.log("<b>AssertContainsAnyWord:=</b>"+message+", <b style=\"color:#800000\";>Expected:=</b>"+expected+"<b style=\"color:#FF00FF\";> Actual:=</b>"+actual);
		String words[]=expected.replaceAll("&#174;", "").replaceAll("&#8480;", "").split(" ");
		for(String word:words){
			if(actual.toLowerCase().contains(word.toLowerCase().trim())){
				Reporter.log("<b>AssertContainsAnyWord:=</b>"+message+", <b style=\"color:#800000\";>Expected:=</b>"+expected+"<b style=\"color:#FF00FF\";> Actual:=</b>"+actual);
				assertionStatus=true;
				break;
			}else {
				Reporter.log("<b style=\"background-color:#800000;\">AssertContainsAnyWord:=</b>"+message+", <b style=\"color:#800000\";>Expected:=</b>"+expected+"<b style=\"color:#FF00FF\";> Actual:=</b>"+actual);
				
			}
		}
		Assert.assertEquals(assertionStatus,true,message);
	}
}
