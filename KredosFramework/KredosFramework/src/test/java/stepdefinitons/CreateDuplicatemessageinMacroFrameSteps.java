package stepdefinitons;

import com.driver.WebdriverInitialiazer;
import com.pages.CreateDuplicatemessageinMacroFramePage;
import com.pages.CreateNewMacroFrameMessageBoxPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateDuplicatemessageinMacroFrameSteps {

	private CreateDuplicatemessageinMacroFramePage cdm= new CreateDuplicatemessageinMacroFramePage(WebdriverInitialiazer.getDriver());
	private CreateNewMacroFrameMessageBoxPage cnmf = new CreateNewMacroFrameMessageBoxPage(WebdriverInitialiazer.getDriver());	
	
	@Given("click on MessageBuilder")
	public void click_on_message_builder() throws InterruptedException {
	   cnmf.click_on_messagebuilder();
	   Thread.sleep(2000);
	}

	@When("enter the {string} in MessageBox")
	public void enter_the_in_message_box(String message) throws InterruptedException {
	  cnmf.write_message(message);
	  Thread.sleep(2000);
	}

	@And("click on plus icon")
	public void click_on_plus_icon() throws InterruptedException {
	  cdm.click_plusicon();
	  Thread.sleep(2000);
	}
	@And("click on duplicate message button")
	public void click_on_duplicatemessagebtn() throws InterruptedException {
		cdm.click_duplicatemessagebtn();
		Thread.sleep(2000);
	}

	@And("click on save button for duplicate macro")
	public void click_save_btn() throws InterruptedException {
		cnmf.click_on_savebtn();
		Thread.sleep(2000);
	}
	@And("click on canvas button for duplicate macro")
	public void click_canvas_btn() throws InterruptedException {
		cnmf.click_on_canvasbtn();
		Thread.sleep(2000);
	}
	@Then("check the duplicate message in drafts")
	public void check_the_duplicate_message_in_drafts() throws InterruptedException {
		cnmf.check_macro_created();
		Thread.sleep(2000);
		
	}
}
