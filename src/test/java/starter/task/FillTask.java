package starter.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import starter.ui.create.CreateForm;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class FillTask implements Task {

    private final String user;
    private final String password;
    private final String email;

    public FillTask(String user, String password, String email) {
        this.user = user;
        this.password = password;
        this.email = email;
    }
    //Metodo para el diligenciamiento de los campso solicitados para crear un usuario
    public static Performable fill(String user, String password, String email) {
        return instrumented(FillTask.class, user, password, email);
    }

    //Se sobreescribe el metodo declaro previamente para continuar con las acciones que se requieren
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(CreateForm.userInput, isVisible()).forNoMoreThan(10).seconds(),
                Enter.theValue(user).into(CreateForm.userInput),
                Enter.theValue(password).into(CreateForm.passwordInput),
                Enter.theValue(password).into(CreateForm.rePasswordInput),
                Enter.theValue(email).into(CreateForm.emailInput),
                Click.on(CreateForm.createAccountBotton)
        );
    }
}