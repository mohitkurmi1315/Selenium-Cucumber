package stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class CRMStepDef {
	@Given("User is logged in")
	public void user_is_logged_in() {
	    System.out.println("logged in");
	}
	@When("User create a con")
	public void user_create_a_con() {
		System.out.println("create ");
	}
	
	@When("User view con details")
	public void user_view_con_details() {
		System.out.println("details ");
	}
	@When("User Delete a con")
	public void user_delete_a_con() {
		System.out.println("delete ");
	}
	@When("User create a deal")
	public void user_create_a_deal() {
		System.out.println("create deal ");
	}
	
	@When("User view deal details")
	public void user_view_deal_details() {
	    	System.out.println("details deal ");
	}
	@When("User Delete a deal")
	public void user_delete_a_deal() {
	    	System.out.println("del deal ");
	}
	
	@When("User create a Task")
	public void user_create_a_Task() {
		System.out.println("create ttask ");
	}
	
	@When("User view Task details")
	public void user_view_Task_details() {
		System.out.println("details task ");
	}
	@When("User Delete a Task")
	public void user_delete_a_Task() {
		System.out.println("del task ");;
	}
}
