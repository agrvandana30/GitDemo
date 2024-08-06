package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Veeva_TestSteps {

	@Given("the user is logged in to Salesforce")
	public void the_user_is_logged_in_to_salesforce() {
	    System.out.println("the user is logged in to Salesforce");
	}

	@When("the user navigates to the Users section from Setup")
	public void the_user_navigates_to_the_users_section_from_setup() {
	    System.out.println("the user navigates to the Users section from Setup");
	}

	
	@When("clicks the New User button")
	public void clicks_the_new_user_button() {
		System.out.println("click the New User button");
	}

	@When("fills in the user details:")
	public void fills_in_the_user_details(io.cucumber.datatable.DataTable dataTable) {
	    System.out.println("getting the field value");
	
	}

	@When("saves the new user")
	public void saves_the_new_user() {
	    System.out.println("saves the new user");
	}

	@Then("the user should be created successfully")
	public void the_user_should_be_created_successfully() {
	    System.out.println("the user created successfully");
	}

	@When("the user navigates to an existing User profile")
	public void the_user_navigates_to_an_existing_user_profile() {
	    System.out.println("the user navigates to an existing User profile");
	}

	@When("clicks the Edit button")
	public void clicks_the_edit_button() {
	    System.out.println("click the Edit button");
	}

	@When("updates the user details:")
	public void updates_the_user_details(io.cucumber.datatable.DataTable dataTable) {
	    System.out.println("update the user details");
	}

	@When("saves the changes")
	public void saves_the_changes() {
	    System.out.println("save the changes");
	}

	@Then("the user should be updated successfully")
	public void the_user_should_be_updated_successfully() {
	    System.out.println("the user updated successfully");
	}
	
	@When("the user navigates to the Leads object")
	public void the_user_navigates_to_the_leads_object() {
	    System.out.println("the user navigates to the Leads object");
	}

	@When("clicks the New button")
	public void clicks_the_new_button() {
	    System.out.println("click the New button");
	}

	@When("enters lead details:")
	public void enters_lead_details(io.cucumber.datatable.DataTable dataTable) {
	    System.out.println("enter lead details");
	}

	@When("saves the lead")
	public void saves_the_lead() {
	    System.out.println("save the lead");
	}

	@Then("the lead should be created successfully")
	public void the_lead_should_be_created_successfully() {
	    System.out.println("lead created successfully");
	}

	@Given("there is an existing lead")
	public void there_is_an_existing_lead() {
	    System.out.println("there is an existing lead");
	}

	@When("the user navigates to the lead details page")
	public void the_user_navigates_to_the_lead_details_page() {
	    System.out.println("the user navigates to the lead details page");
	}

	@When("clicks the Convert button")
	public void clicks_the_convert_button() {
	    System.out.println("click the Convert button");
	}

	@When("fills in the opportunity details:")
	public void fills_in_the_opportunity_details(io.cucumber.datatable.DataTable dataTable) {
	    System.out.println("getting the opportunity details");
	}

	@When("saves the conversion")
	public void saves_the_conversion() {
	    System.out.println("save the conversion");
	}

	@Then("the lead should be converted to an opportunity successfully")
	public void the_lead_should_be_converted_to_an_opportunity_successfully() {
	    System.out.println("the lead converted to an opportunity successfully");
	}

	@When("the user navigates to the Accounts object")
	public void the_user_navigates_to_the_accounts_object() {
	    System.out.println("the user navigates to the Accounts object");
	}

	@When("enters account details:")
	public void enters_account_details(io.cucumber.datatable.DataTable dataTable) {
	    System.out.println("enter account details");
	}

	@When("saves the account")
	public void saves_the_account() {
	    System.out.println("save the account");
	}

	@Then("the account should be created successfully")
	public void the_account_should_be_created_successfully() {
	    System.out.println("the account created successfully");
	}

	@Given("there is an existing account")
	public void there_is_an_existing_account() {
	    System.out.println("there is an existing account");
	}

	@When("the user navigates to the account details page")
	public void the_user_navigates_to_the_account_details_page() {
	    System.out.println("user navigates to the account details page");
	}

	@When("clicks the Delete button")
	public void clicks_the_delete_button() {
	    System.out.println("click the Delete button");
	}

	@When("confirms the deletion")
	public void confirms_the_deletion() {
	    System.out.println("confirm the deletion");
	}

	@Then("the account should be deleted successfully")
	public void the_account_should_be_deleted_successfully() {
	    System.out.println("the account deleted successfully");
	}

	@When("the user navigates to the Opportunities object")
	public void the_user_navigates_to_the_opportunities_object() {
	    System.out.println("user navigates to the Opportunities object");
	}

	@When("enters opportunity details:")
	public void enters_opportunity_details(io.cucumber.datatable.DataTable dataTable) {
	    System.out.println("enter opportunity details");
	}

	@When("associates the opportunity with an account and a contact:")
	public void associates_the_opportunity_with_an_account_and_a_contact(io.cucumber.datatable.DataTable dataTable) {
	    System.out.println("associate the opportunity with an account and a contact");
	}

	@When("saves the opportunity")
	public void saves_the_opportunity() {
	    System.out.println("save the opportunity");
	}

	@Then("the opportunity should be created successfully")
	public void the_opportunity_should_be_created_successfully() {
	    System.out.println("the opportunity created successfully");
	}

	@Given("there is an existing opportunity")
	public void there_is_an_existing_opportunity() {
	    System.out.println("there is an existing opportunity");
	}

	@When("the user navigates to the opportunity details page")
	public void the_user_navigates_to_the_opportunity_details_page() {
	    System.out.println("user navigates to the opportunity details page");
	}

	@When("updates the opportunity details:")
	public void updates_the_opportunity_details(io.cucumber.datatable.DataTable dataTable) {
	    System.out.println("update opportunity details");
	}

	@Then("the opportunity should be updated successfully")
	public void the_opportunity_should_be_updated_successfully() {
	    System.out.println("opportunity updated successfully");
	}

	@When("the user navigates to the Reports object")
	public void the_user_navigates_to_the_reports_section() {
	    System.out.println("user navigates to the Reports object");
	}

	@When("clicks the New Report button")
	public void clicks_the_new_report_button() {
	    System.out.println("click the New Report button");
	}

	@When("configures report filters and columns")
	public void configures_report_filters_and_columns() {
	    System.out.println("configure report filters and columns");
	}

	@When("runs the report")
	public void runs_the_report() {
	    System.out.println("run the report");
	}

	@Then("the user should see the generated report")
	public void the_user_should_see_the_generated_report() {
	    System.out.println("user sees the generated report");
	}

	@Given("there is an existing report")
	public void there_is_an_existing_report() {
	    System.out.println("there is an existing report");
	}

	@When("the user opens the report")
	public void the_user_opens_the_report() {
	    System.out.println("user opens the report");
	}

	@When("clicks the Export button")
	public void clicks_the_export_button() {
	    System.out.println("click the Export button");
	}

	@When("selects the desired export format")
	public void selects_the_desired_export_format() {
	    System.out.println("select the desired export format");
	}

	@When("confirms the export")
	public void confirms_the_export() {
	    System.out.println("confirm the export");
	}

	@Then("the report should be exported successfully")
	public void the_report_should_be_exported_successfully() {
	    System.out.println("the report exported successfully");
	}







	
}
