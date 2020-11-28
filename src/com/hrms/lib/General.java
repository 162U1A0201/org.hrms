package com.hrms.lib;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.hrms.utility.Log;

public class General extends Global{
	//Reusable functions
			public void openApplication() {
				System.setProperty("webdriver.chrome.driver", "M:\\driver files\\chromedriver.exe");
				driver = new ChromeDriver();
				driver.navigate().to(url);
				System.out.println("Page opened successfully");
				Log.info("Application opened");
			}
			public void closeApplication() {
				driver.close();
				System.out.println("Chrome closed successfully");
				Log.info("Application closed");
			}
			public void Login() {
				driver.findElement(By.name(txt_loginname)).sendKeys(un);
				driver.findElement(By.name(txt_password)).sendKeys(pw);
				driver.findElement(By.name(btn_login)).click();
				System.out.println("Login Successfull");
				Log.info("Login completed");
			}
			public void Logout() {
				driver.findElement(By.linkText(logout)).click();
				System.out.println("Logout successfull");
				Log.info("Logout completed");
			}
			public void waitStatement() throws Exception {
				Thread.sleep(3000);
			}
			public void AddEmp() {
				driver.switchTo().frame("rightMenu");
				driver.findElement(By.xpath("/html/body/div/div[2]/form/div[3]/div[1]/input[1]")).click();
				driver.findElement(By.name("txtEmpFirstName")).sendKeys("Mounika");
				driver.findElement(By.name("txtEmpLastName")).sendKeys("Mounika");
				driver.findElement(By.xpath("/html/body/form/div/div[1]/div[2]/div[2]/input[1]")).click();
				System.out.println("Added employ successfully");
				driver.switchTo().defaultContent();
				Log.info("Added an Employee");
				
			}

}
