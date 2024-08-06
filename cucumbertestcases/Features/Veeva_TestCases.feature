#Author: agr.vandana30@gmail.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template


					##Scenario 1: User Management
##Test Case 1.1: Creating a New User

Feature: Salesforce User Management

Scenario: Creating a New User
		Given the user is logged in to Salesforce
    When the user navigates to the Users section from Setup
    And clicks the New User button
    And fills in the user details:
      | Field       | Value          |
      | First Name  | Vandana	       |
      | Last Name   | Agrawal        |
      | Email	    	| agrawalvandana2@gmail.com|
      | Profile     | System Administrator |
    And saves the new user
    Then the user should be created successfully
    
##Test Case 1.2: Editing an Existing User
 
 Scenario: Editing an Existing User
 		Given the user is logged in to Salesforce
    When the user navigates to an existing User profile
    And clicks the Edit button
    And updates the user details:
      | Field       | Value          |
      | Last Name   | Singh          |
      | Phone       | 123-456-7890   |
    And saves the changes
    Then the user should be updated successfully
 
					##Scenario 2: Lead Management
##Test Case 2.1: Creating a New Lead
 
 
 Scenario: Creating a New Lead
    Given the user is logged in to Salesforce
    When the user navigates to the Leads object
    And clicks the New button
    And enters lead details:
      | Field       | Value          |
      | First Name  | TestF           |
      | Last Name   | TestL            |
      | Company     | ABC Ltd.       |
      | Phone       | 555-555-5555   |
    And saves the lead
    Then the lead should be created successfully
    
 ##Test Case 2.2: Converting a Lead to an Opportunity

  Scenario: Converting a Lead to an Opportunity
    Given the user is logged in to Salesforce
    And there is an existing lead
    When the user navigates to the lead details page
    And clicks the Convert button
    And fills in the opportunity details:
      | Field       | Value          |
      | Name        | New Opportunity |
      | Amount      | 10000          |
    And saves the conversion
    Then the lead should be converted to an opportunity successfully  
    
					##Scenario 3: Account Management
##Test Case 3.1: Creating a New Account

  Scenario: Creating a New Account
    Given the user is logged in to Salesforce
    When the user navigates to the Accounts object
    And clicks the New button
    And enters account details:
      | Field       | Value          |
      | Name        | Test Account   |
      | Industry    | Healthcare     |
      | Phone       | 999-999-9999   |
    And saves the account
    Then the account should be created successfully

##Test Case 3.2: Deleting an Existing Account

  Scenario: Deleting an Existing Account
    Given the user is logged in to Salesforce
    And there is an existing account
    When the user navigates to the account details page
    And clicks the Delete button
    And confirms the deletion
    Then the account should be deleted successfully

					##Scenario 4: Opportunity Management
##Test Case 4.1: Creating a New Opportunity

  Scenario: Creating a New Opportunity
    Given the user is logged in to Salesforce
    When the user navigates to the Opportunities object
    And clicks the New button
    And enters opportunity details:
      | Field       | Value          |
      | Name        | New Opportunity |
      | Amount      | 20000          |
      | Close Date  | 2023-12-31     |
    And associates the opportunity with an account and a contact:
      | Account Name | Contact Name |
      | Test Account | Test Contact     |
    And saves the opportunity
    Then the opportunity should be created successfully

##Test Case 4.2: Updating an Existing Opportunity

  Scenario: Updating an Existing Opportunity
    Given the user is logged in to Salesforce
    And there is an existing opportunity
    When the user navigates to the opportunity details page
    And clicks the Edit button
    And updates the opportunity details:
      | Field       | Value          |
      | Amount      | 25000          |
    And saves the changes
    Then the opportunity should be updated successfully

					##Scenario 5: Report Generation
##Test Case 5.1: Creating a New Report

  Scenario: Creating a New Report
    Given the user is logged in to Salesforce
    When the user navigates to the Reports object
    And clicks the New Report button
    And configures report filters and columns
    And runs the report
    Then the user should see the generated report

##Test Case 5.2: Exporting a Report

  Scenario: Exporting a Report
    Given the user is logged in to Salesforce
    And there is an existing report
    When the user opens the report
    And clicks the Export button
    And selects the desired export format
    And confirms the export
    Then the report should be exported successfully
    
    