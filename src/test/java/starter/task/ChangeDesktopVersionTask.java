package starter.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import starter.ui.changeversion.ChangeVersionForm;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ChangeDesktopVersionTask implements Task {

    public ChangeDesktopVersionTask() {
    }

    public static Performable changeDesktopVersion(){
        return instrumented(ChangeDesktopVersionTask.class);
    }

    //Se sobreescribe el metodo declaro previamente para continuar con las acciones que se requieren
    @Override
    public <T extends Actor> void performAs(T actor) {
          actor.attemptsTo(
                  Scroll.to(ChangeVersionForm.buttonDesktopVersion),
                  Click.on(ChangeVersionForm.buttonDesktopVersion)
          );
    }


}
