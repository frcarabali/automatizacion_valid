package starter.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import starter.ui.create.CreateForm;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class CreateAccountTask implements Task {

    public CreateAccountTask() {
    }

    //Metodo para dar click al boton que permite dirigirse al formulario de creación de usuarios
    public static Performable creation(){
        return instrumented(CreateAccountTask.class);
    }

    //Se sobreescribe el metodo declaro previamente para continuar con las acciones que se requieren
    @Override
    public <T extends Actor> void performAs(T actor) {
          actor.attemptsTo(
                  WaitUntil.the(CreateForm.createButton,isVisible()).forNoMoreThan(10).seconds(),
                  Click.on(CreateForm.createButton)
          );
    }

}
