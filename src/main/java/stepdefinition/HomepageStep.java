package stepdefinition;

import java.util.Random;

import cucumber.api.java.en.*;
import pageObjects.Basepage;
import pageObjects.Homepageobj;

public class HomepageStep extends Basepage {
	
	Homepageobj hp;
	Basepage bp;
	
	public void stephomepage() {
		hp= new Homepageobj();
		bp= new Basepage();
	}
	@Given("^User launch the application$")
	public void user_launch_the_application() throws Throwable {
	    
		bp=new Basepage();
	}

	@When("^User enter email \"(.*?)\" in the subscription text box$")
	public void user_enter_email_in_the_subscription_text_box(String email) throws Throwable {
		
		Random num=new Random();
		int number=num.nextInt(1000);
		String[] arr=email.split("@");
		String randommail=arr[0]+number+"@"+arr[1];
		
		bp.setText(hp.getNewsLetterMsgtab(), randommail);
		hp.getNewsLetterMsgtab().getText().contains("Successfull");
	    
	}

	@Then("^User should see subscription Message$")
	public void user_should_see_subscription_Message() throws Throwable {
	    
	}

	@When("^User Click on the tab \"(.*?)\"$")
	public void user_Click_on_the_tab(String arg1) throws Throwable {
	    
	}

	@Then("^User should see the respective details page$")
	public void user_should_see_the_respective_details_page() throws Throwable {
	    
	}

}
