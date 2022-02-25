package co.com.choucair.certification.proyectobase.stepdefinitions;

import co.com.choucair.certification.proyectobase.exceptions.ValidarCursoSeleccionado;
import co.com.choucair.certification.proyectobase.questions.Answer;
import co.com.choucair.certification.proyectobase.tasks.Login;
import co.com.choucair.certification.proyectobase.tasks.OpenUp;
import co.com.choucair.certification.proyectobase.tasks.Search;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matcher;
import org.hamcrest.Matchers;

import static net.bytebuddy.matcher.ElementMatchers.isEquals;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

public class ChoucairAcademyStepDefinitions {

    @Before
    public void setStage () {

        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Brandon");
    }

    @Given("than brandon wants to learn automation at the academy Choucair")
    public void thanBrandonWantsToLearnAutomationAtTheAcademyChoucair() {

        theActorInTheSpotlight().wasAbleTo(OpenUp.thePage(), Login.onThePage());
    }

    @When("he search of the course {} on the choucair academy platform")
    public void heSearchOfTheCourseAutomatizaciònDePruebasOnTheChoucairAcademyPlatform(String course) {

        theActorInTheSpotlight().attemptsTo(Search.the(course));
    }

    @Then("he finds the course called resources {}")
    public void heFindsTheCourseCalledResourcesAutomatizaciònDePruebas(String question) {

        theActorInTheSpotlight().should(

                seeThat(Answer.toThe(question), equalTo(true))
                .orComplainWith(ValidarCursoSeleccionado.class,  "La validación del curso seleccionado fallo se esperaba: Automatización de Pruebas")
        );

    }
}
