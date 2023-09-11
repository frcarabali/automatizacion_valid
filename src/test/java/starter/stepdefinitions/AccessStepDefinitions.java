package starter.stepdefinitions;

import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.waits.WaitUntil;
import starter.questions.ExistContentQuestion;
import starter.ui.home.HomeForm;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static org.hamcrest.core.IsEqual.equalTo;

public class AccessStepDefinitions {

    // paso paravalidar la existencia del título Bienvenidos a wikipedia el home de la pagina
    @Entonces("valida la existencia del titulo Bienvenidos  a Wikipedia en el home de la pagina")
    public void validacion_de_titulo() {

        //Espera genera mientras el elemento está presente
        theActorInTheSpotlight().attemptsTo(
                WaitUntil.the(HomeForm.spanBienvenidosAWikipedia,isVisible()).forNoMoreThan(10).seconds()
        );

        //Question para saber si el texto del elemento equivale a Bienvenidos a Wikipedia,
       theActorInTheSpotlight().should(
           seeThat("Bienvenidos a Wikipedia", ExistContentQuestion.titleHome(),equalTo("Bienvenidos a Wikipedia,"))
       );

    }
}
