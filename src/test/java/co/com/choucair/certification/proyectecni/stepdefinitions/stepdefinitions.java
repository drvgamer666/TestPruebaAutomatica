package co.com.choucair.certification.proyectecni.stepdefinitions;

import co.com.choucair.certification.Proyectecni.tasks.JoinToDay;
import co.com.choucair.certification.Proyectecni.tasks.CompleteForm;
import cucumber.api.java.Before;
import  cucumber.api.java.en.Given;
import  cucumber.api.java.en.Then;
import  cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import co.com.choucair.certification.Proyectecni.tasks.OpenUp;


public class stepdefinitions {

    @Before
    public void setStage(){OnStage.setTheStage(new OnlineCast());}

    @Given("^David join in button jointoday$")
    public void david_join_in_button_jointoday() {
        OnStage.theActorCalled("David").wasAbleTo(OpenUp.thePage(),(JoinToDay.onThePage()));
    }

    @When("^Complete the form$")
    public void complete_the_form() {
        OnStage.theActorInTheSpotlight().attemptsTo(CompleteForm.the());
    }

    @Then("^Complete the setup$")
    public void complete_the_setup(String question) {

    }

}
