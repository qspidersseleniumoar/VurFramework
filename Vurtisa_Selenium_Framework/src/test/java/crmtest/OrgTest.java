package crmtest;

import org.testng.annotations.Test;

public class OrgTest {
	
	@Test(groups = "smokeTest")
	public void createOrgTest() {
		System.out.println("execute createOrgTest");
	}
	
	@Test(groups = "regression")
	public void deleteORgTest() {
		System.out.println("execute deleteORgTest");
	}
	
	@Test(groups = "regression")
	public void searchORGTest() {
		System.out.println("execute searchORGTest");
	}

}
