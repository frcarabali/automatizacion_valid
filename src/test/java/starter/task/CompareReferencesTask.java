package starter.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import starter.ui.history.HistoryForm;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class CompareReferencesTask implements Task {

    public CompareReferencesTask() {
    }

    public static Performable compareReferences(){
        return instrumented(CompareReferencesTask.class);
    }

    //Se sobreescribe el metodo declaro previamente para continuar con las acciones que se requieren
    @Override
    public <T extends Actor> void performAs(T actor) {
          actor.attemptsTo(
                  WaitUntil.the(HistoryForm.radiobutton1,isVisible()).forNoMoreThan(10).seconds(),
                  Click.on(HistoryForm.radiobutton1),
                  Click.on(HistoryForm.radiobutton2),
                  Click.on(HistoryForm.buttonCompareHistory)
          );
    }


}
