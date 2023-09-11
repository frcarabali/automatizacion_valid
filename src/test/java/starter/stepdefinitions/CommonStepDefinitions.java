package starter.stepdefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import starter.navigation.NavigateTo;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

//Se declaran las acciones comunies para cada caso de prueba, es decir, los pasos definidos en los antecedentes
public class CommonStepDefinitions {

    @Cuando("^que el usuario (.*) esta en la pagina de Wikipedia")
    public void queElUsuarioEstaEnLaPaginaDeWikipedia(String name) {
       theActorCalled(name);
    }

    @Dado("^ingresa a Wikipedia")
    public void ingresa_a_wikipedia() {

        theActorInTheSpotlight().attemptsTo(
                NavigateTo.theWikipediaGoHomePage()
        );
    }
}
