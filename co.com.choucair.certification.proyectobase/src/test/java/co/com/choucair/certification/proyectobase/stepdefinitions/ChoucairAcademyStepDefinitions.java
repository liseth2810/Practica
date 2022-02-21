package co.com.choucair.certification.proyectobase.stepdefinitions;

import co.com.choucair.certification.proyectobase.tasks.OpenUp;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class ChoucairAcademyStepDefinitions {

    @Before
    public void setStage () {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("than brandon wants to learn automation at the academy Choucair")
    public void thanBrandonWantsToLearnAutomationAtTheAcademyChoucair() {
        OnStage.theActorCalled("Brandon").wasAbleTo(OpenUp.thePage());
        throw new io.cucumber.java.PendingException();
    }
    @When("he search of the course Recursos Automatización Bancolombia on the choucair academy platform")
    public void heSearchOfTheCourseRecursosAutomatizaciónBancolombiaOnTheChoucairAcademyPlatform() {
        throw new io.cucumber.java.PendingException();
    }
    @Then("he finds the course called resources Recursos Automatización Bancolombia")
    public void heFindsTheCourseCalledResourcesRecursosAutomatizaciónBancolombia() {
        throw new io.cucumber.java.PendingException();
    }
}
