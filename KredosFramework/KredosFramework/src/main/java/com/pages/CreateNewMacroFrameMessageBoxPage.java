package com.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateNewMacroFrameMessageBoxPage {

	private WebDriver driver;
	public CreateNewMacroFrameMessageBoxPage(WebDriver driver) {
		this.driver = driver;
}
	private By WriteMessage = By.xpath("//*[@placeholder='Write Message...'] ");
	private By SaveButton = By.xpath("//*[text()='Save']");
	private By CanvasButton = By.xpath("//*[text()='Canvas ']");
	private By MessageBuilder = By.xpath("//*[text()=' Message Builder']");
	private By KredosLogo = By.xpath("//*[@src='assets/imgs/logo (1).png']");
	private By MacroDraft =By.xpath("/html/body/app-root/div/div/app-home-summary/div/div/div[1]/div/div[2]/div[2]/div[1]/div");
	private String Messageentered="";
	
	public void click_on_messagebuilder() {
		driver.findElement(MessageBuilder).isEnabled();
		driver.findElement(MessageBuilder).click();
	}
	
	public void write_message(String message)  {
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.findElements(WriteMessage).get(1).sendKeys(message);
		Messageentered=message;
	}
	public void click_on_savebtn()  {
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.findElements(SaveButton).get(2).click();
		
	}
	public void click_on_canvasbtn()  {
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.findElements(CanvasButton).get(1).click();
		}
	public void check_macro_created() {
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.findElement(KredosLogo).click();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.findElement(MacroDraft).click();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		if(driver.findElement(By.xpath("//*[@id=\"cdk-drop-list-3\"]/div/app-message-box-tool/div/div[2]/textarea")).equals(Messageentered)) {
			System.out.println("Macro draft created and saved");
		}
		else {
			System.out.println("Macro draft already exists");
		}
	}
}