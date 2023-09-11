package starter.stepdefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import starter.task.*;
import static org.hamcrest.Matchers.equalTo;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

// pasos para el proceso de creación de cuenta en Wikipedia
public class CreateAcountStepDefinitions {


    @Cuando("el usuario hace clic en Crear una cuenta")
    public void el_usuario_hace_clic_en_crear_una_cuenta() {
        theActorInTheSpotlight().attemptsTo(
                CreateAccountTask.creation()
        );
    }

    @Y("^el usuario diligencia los campos solicitados (.*) (.*) (.*)")
    public void el_usuario_diligencia_los_campos_solicitados(String user, String password, String email) {
        theActorInTheSpotlight().attemptsTo(
                FillTask.fill(user, password, email)
        );
    }

    @Entonces("^se debe mostrar el popup con el mensaje (.*) para el campo del CAPTCHA")
    public void se_debe_mostrar_el_popup_con_el_mensaje(String expectedMessage) {
        theActorInTheSpotlight().attemptsTo(
                CheckValidationMessageTask.CheckValidationMessage()
        );
        Boolean isValid = theActorInTheSpotlight().recall("isValid");
        String validationMessage = theActorInTheSpotlight().recall("validationMessage");
        //Se valida el validationMessage del elemento capturado
        theActorInTheSpotlight().should(
                seeThat("The field is valid", actual -> isValid),
                seeThat("The validation message text", actual -> validationMessage, equalTo(expectedMessage))
        );
    }

}
