package starter.stepdefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import starter.questions.ExistContentQuestion;
import starter.task.*;
import starter.ui.changeversion.ChangeVersionForm;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ChangeVersionStepDefinitions {

    //Paso para efectuar cambio de version para dispositivos mobiles
    @Cuando("el usuario selecciona la opcion Version para moviles desde la parte inferior")
    public void el_usuario_selecciona_la_opcion() {
        theActorInTheSpotlight().attemptsTo(
                ChangeMobileVersionTask.changeMobileVersion()
        );
    }

    //Paso para la validación por medio de una question de version para dispositivos mobiles
    @Y("el usuario verifica que la opcion Escritorio esta presente")
    public void el_usuario_verifica_que_la_opcion() {
        theActorInTheSpotlight().should(seeThat(ExistContentQuestion.the(ChangeVersionForm.buttonDesktopVersion),
                WebElementStateMatchers.isVisible())
        );
    }

    //Paso para efectuar cambio de version para dispositivos de escritorio
    @Entonces("el usuario se devuelve a la version de Escritorio")
    public void el_usuario_se_devuelve_a_la_version_de_escritorio() {
        theActorInTheSpotlight().attemptsTo(
                ChangeDesktopVersionTask.changeDesktopVersion()
        );
    }
}
