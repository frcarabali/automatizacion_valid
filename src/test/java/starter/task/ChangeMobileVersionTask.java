package starter.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;
import starter.ui.changeversion.ChangeVersionForm;
import starter.ui.search.SearchForm;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ChangeMobileVersionTask implements Task {

    public ChangeMobileVersionTask() {
    }

    //Metodo necesario para cambiar la vista del navegador a la versión para dispositivos mobiles
    public static Performable changeMobileVersion(){
        return instrumented(ChangeMobileVersionTask.class);
    }

    //Se sobreescribe el metodo declarao previamente para continuar con las acciones que se requieren
    @Override
    public <T extends Actor> void performAs(T actor) {
          actor.attemptsTo(
                  WaitUntil.the(SearchForm.buttonSearch,isVisible()).forNoMoreThan(10).seconds(),
                  Scroll.to(ChangeVersionForm.buttonMobileVersion),
                  Click.on(ChangeVersionForm.buttonMobileVersion)
          );
    }


}
