package cucumbermap;

import java.util.Hashtable;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utility.HTMLReportGenerator;
import utility.SeleniumOperation;

public class Login
{
	
	@Given("^user opens \"([^\"]*)\" browser and exe \"([^\"]*)\"$")
	public void user_opens_browser_and_exe(String bname, String exe) throws Throwable
		{
		  Object[] input=new Object[2];
		           input[0]=bname;
		           input[1]=exe;
		           SeleniumOperation.browserLaunch(input);
		  
		}

	@Given("^user enters url \"([^\"]*)\"$")
	public void user_enters_url(String url) throws Throwable 
		{
		Object[] input1=new Object[1];
        input1[0]=url;      
        SeleniumOperation.openApplication(input1);
		   
		}

	@Given("^user cancle the initial login window$")
	public void user_cancle_the_initial_login_window() throws Throwable
		{
		Object[] input2=new Object[1];
        input2[0]="//*[@class='_2KpZ6l _2doB4z']";      
        SeleniumOperation.click(input2);
		}

	@Given("^user move on Login button$")
	public void user_move_on_Login_button() throws Throwable 
		{
		Object[] input3=new Object[1];
        input3[0]="//a[normalize-space()='Login']";      
        SeleniumOperation.mouseOver(input3);
		}

	@When("^user click on my profile$")
	public void user_click_on_my_profile() throws Throwable 
		{
		Object[] input4=new Object[1];
        input4[0]="//div[normalize-space()='My Profile']";      
     Hashtable<String,Object> output4=SeleniumOperation.click(input4);

 HTMLReportGenerator.StepDetails(output4.get("STATUS").toString(), "^user click on my profile$", output4.get("MESSAGE").toString());      
		}

	@When("^user enter \"([^\"]*)\" as  username$")
	public void user_enter_as_username(String uname) throws Throwable 
		{
		  Object[] input5=new Object[2];
          input5[0]="//input[@class='_2IX_2- VJZDxU']";
          input5[1]=uname;
          Hashtable<String,Object> output5=SeleniumOperation.sendKey(input5);
          HTMLReportGenerator.StepDetails(output5.get("STATUS").toString(), "^user enter \"([^\"]*)\" as  username$", output5.get("MESSAGE").toString());
		}

	@When("^user enter \"([^\"]*)\" as  password$")
	public void user_enter_as_password(String pass) throws Throwable
		{
		  Object[] input6=new Object[2];
          input6[0]="//input[@type='password']";
          input6[1]=pass;
          Hashtable<String,Object> output6=  SeleniumOperation.sendKey(input6);
          HTMLReportGenerator.StepDetails(output6.get("STATUS").toString(), "^user enter \"([^\"]*)\" as  password$", output6.get("MESSAGE").toString());         
		}

	@When("^user click on Login button$")
	public void user_click_on_Login_button() throws Throwable
		{
		Object[] input7=new Object[1];
        input7[0]="//*[@class='_2KpZ6l _2HKlqd _3AWRsL']";      
        Hashtable<String,Object> output7= SeleniumOperation.click(input7);
        HTMLReportGenerator.StepDetails(output7.get("STATUS").toString(), "^user click on Login button$", output7.get("MESSAGE").toString()); 
		}

	@Then("^validate Login page$")
	public void validate_Login_page() throws Throwable 
		{
		 Object[] input8=new Object[2];
         input8[0]="GanesH Gandal";
         input8[1]="//*[@class='_1ruvv2']";
         Hashtable<String,Object> output8= SeleniumOperation.validation(input8);
         HTMLReportGenerator.StepDetails(output8.get("STATUS").toString(), "^validate Login page$", output8.get("MESSAGE").toString()); 	   
		}
	
	
	
	
	
	
	
	

}
