package co.com.choucairempleos.stepdefinitions;

import co.com.choucairempleos.model.ApplyForJobsData;
import co.com.choucairempleos.model.DataUser;
import co.com.choucairempleos.questions.VerifyJobs;
import co.com.choucairempleos.questions.VerifyMessageError;
import co.com.choucairempleos.task.EnterTo;
import co.com.choucairempleos.task.OpenUp;
import co.com.choucairempleos.task.RegisterForApply;
import co.com.choucairempleos.task.SearchJobs;
import static co.com.choucairempleos.util.Constant.ZERO;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static net.serenitybdd.screenplay.actors.OnStage.*;
import static net.serenitybdd.screenplay.GivenWhenThen.*;

import java.util.List;

public class ChoucairJobsStepDefinitions {

    @Given("^that Luis wants to enter the page$")
    public void thatLuisWantsToEnterThePage() {
       theActorCalled("Luis").wasAbleTo(OpenUp.thepage());
    }

    @When("^he enter the jobs menu$")
    public void heEnterTheJobsMenu() {
       theActorInTheSpotlight().attemptsTo(EnterTo.theMenu());
    }

    @When("^perform a search by keyword and city$")
    public void performASearchByKeywordAndCity(List<DataUser> dataKeywords){
       theActorInTheSpotlight().attemptsTo(SearchJobs.withKeywords(dataKeywords.get(ZERO)));
    }
    @Then("^he can see on the screen the job searched with the (.*)$")
    public void heCanSeeOnTheScreenTheJobSearchedWithThe(String keywords) {
        theActorInTheSpotlight().should(seeThat(VerifyJobs.with(keywords)));
    }
    @When("^he applies for employment and diligence his data$")
    public void heAppliesForEmploymentAndDiligenceHisData(List<ApplyForJobsData> dataApplyJobs) {
           theActorInTheSpotlight().attemptsTo(RegisterForApply.onThePageWith(dataApplyJobs.get(ZERO)));
    }

    @Then("^he verifies the (.*) on the screen$")
    public void heVerifiesTheMessageOnTheScreen(String messageFailed) {
           theActorInTheSpotlight().should(seeThat(VerifyMessageError.with(messageFailed)));
    }


}
