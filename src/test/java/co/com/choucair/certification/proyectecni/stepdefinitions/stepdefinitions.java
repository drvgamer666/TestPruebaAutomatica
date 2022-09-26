package co.com.choucair.certification.proyectecni.stepdefinitions;

import cucumber.api.java.Before;
import  cucumber.api.java.en.Given;
import  cucumber.api.java.en.Then;
import  cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import co.com.choucair.certification.Proyectecni.tasks.OpenUp;

public class stepdefinitions {

    @Before
    public void setStage(){OnStage.setTheStage(new OnlineCast());}

    @Given("^David create user$")
    public void davidCreateUser() {
        OnStage.theActorCalled("David").wasAbleTo(OpenUp.thePage());
    }

    @When("^Complete the form$")
    public void complete_the_form() {
    }

    @Then("^Complete the setup$")
    public void complete_the_setup() {
    }

}
