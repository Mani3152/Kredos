package stepdefinitons;
import com.driver.WebdriverInitialiazer;
import com.pages.CreateNewMacroFrameMessageBoxPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateNewMacroFrameMessageBoxPageSteps {

	private CreateNewMacroFrameMessageBoxPage cnmf = new CreateNewMacroFrameMessageBoxPage(WebdriverInitialiazer.getDriver());
	
	@Given("click_on_Messagebuilder")
	public void click_on_messagebuilder() throws InterruptedException {
		cnmf.click_on_messagebuilder();
		Thread.sleep(2000);
	}
	@When("write some {string} inside the macroframe message box") 
	public void write_message(String message) throws InterruptedException {
		cnmf.write_message(message);
		Thread.sleep(2000);
	}
	@And("click on save button")
	public void click_save() throws InterruptedException {
		cnmf.click_on_savebtn();
		Thread.sleep(2000);
	}
	@Then("click on canvas button")
	public void click_canvas() throws InterruptedException {
		cnmf.click_on_canvasbtn();
		Thread.sleep(2000);
	}
	@And("check whether it is created in the Draft page")
	public void check_macro() throws InterruptedException {
		cnmf.check_macro_created();
		Thread.sleep(2000);
	}
}
