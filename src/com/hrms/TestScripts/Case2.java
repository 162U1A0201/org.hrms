package com.hrms.TestScripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.lib.General;

public class Case2 {
	@Test
	public void tc_002() throws Exception {
			DOMConfigurator.configure("log4j.xml");
		General obj = new General();
		obj.openApplication();
		obj.Login();
		obj.waitStatement();
		obj.AddEmp();
		obj.Logout();
		obj.waitStatement();
		obj.closeApplication();

	}

}
