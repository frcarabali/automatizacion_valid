package starter.stepdefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import starter.questions.ExistContentQuestion;
import starter.task.*;
import starter.ui.history.HistoryForm;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

// pasos para seleccionar y validar dos revisiones en el historial de Wikipedia
public class HistoryStepDefinitions {

    @Cuando("el usuario selecciona la opcion Ver historial desde la parte inferior")
    public void el_usuario_selecciona_la_opcion_Ver_historial_desde_la_parte_inferior() {
        theActorInTheSpotlight().attemptsTo(
                HistoryTask.historyView()
        );
    }

    @Y("el usuario selecciona dos revisiones de la lista para comparar revisiones seleccionadas")
    public void el_usuario_selecciona_dos_revisiones_de_la_lista_para_comparar_revisiones_seleccionadas() {
        theActorInTheSpotlight().attemptsTo(
                CompareReferencesTask.compareReferences()
        );
    }

    //Paso para validar por medio de dos question la existencia de dos campos de texto para comparar las revisiones
    @Entonces("se deben mostrar dos campos de texto para comparar las revisiones seleccionadas")
    public void se_deben_mostrar_dos_campos_de_texto_para_comparar_las_revisiones_seleccionadas() {
        theActorInTheSpotlight().should(seeThat(ExistContentQuestion.the(HistoryForm.review1),
                WebElementStateMatchers.isVisible())
        );
        theActorInTheSpotlight().should(seeThat(ExistContentQuestion.the(HistoryForm.review2),
                WebElementStateMatchers.isVisible())
        );

    }

}
