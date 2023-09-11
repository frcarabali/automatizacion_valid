package starter.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;
import starter.ui.search.SearchForm;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ScrollTask implements Task {

    public ScrollTask(){
        //constructor vacío
    }

    public static Performable wordScroll(){
        return instrumented(ScrollTask.class);
    }

    //Se sobreescribe el metodo declaro previamente para continuar con las acciones que se requieren
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(SearchForm.spanSistema,isVisible()).forNoMoreThan(10).seconds(),
                Scroll.to(SearchForm.spanAnalisisCeem)
                );
    }
}
