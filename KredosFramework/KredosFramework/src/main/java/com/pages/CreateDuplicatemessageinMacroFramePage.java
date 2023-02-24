package com.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateDuplicatemessageinMacroFramePage {

	private WebDriver driver;
	public CreateDuplicatemessageinMacroFramePage(WebDriver driver) {
		this.driver=driver;
	}
	private By Plusicon = By.xpath("//*[@id='dropdownAddMoreBottom']//i");
	private By DuplicateMessagebtn = By.xpath("//*[text()='Duplicate Message']");
	public void click_plusicon() {
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.findElements(Plusicon).get(1).click();
	}
	
	public void click_duplicatemessagebtn() {
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.findElement(DuplicateMessagebtn).click();
	}
	
}


