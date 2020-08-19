package co.com.choucair.reto1screenplay.stepdefinitions;

import co.com.choucair.reto1screenplay.model.BuscarData;
import co.com.choucair.reto1screenplay.questions.Comprobar;
import co.com.choucair.reto1screenplay.tasks.Login;
import co.com.choucair.reto1screenplay.tasks.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class Demositestepdefinitions {

    @Before
    public void setStage () {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^He Navigate to the page$")
    public void heNavigateToThePage() {

        OnStage.theActorCalled("Carlos").wasAbleTo(OpenUp.ThePage());
    }

    @When("^He log in on the page$")
    public void heLogInOnThePage(List<BuscarData> buscardata ) {
        OnStage.theActorInTheSpotlight().attemptsTo(Login.OnThePage(buscardata));
    }

    @Then("^He verify the web with a text (.*)$")
    public void heVerifyTheWebWithATextDoubleClickOnEditIconToEDITTheTableRow(String verificar) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Comprobar.ThePage(verificar)));
    }

}
