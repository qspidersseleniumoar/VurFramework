package crmtest;

import org.testng.annotations.Test;

public class ContactTest {
	
	@Test(groups = "smokeTest")
	public void createContactTest() {
		System.out.println("execute createContact");
	}
	
	@Test(groups = "regression")
	public void deleteContactTest() {
		String URL = System.getProperty("url");
		String BROWSER = System.getProperty("browser");
		
		System.out.println("URL======>"+URL);
		System.out.println("browser====>"+BROWSER);
		
		System.out.println("execute deleteContact");
	}
	
	@Test(groups = "regression")
	public void searchContactTest() {
		System.out.println("execute searchContact");
	}

}
