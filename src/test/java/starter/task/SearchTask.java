package starter.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.WaitUntil;
import starter.ui.search.SearchForm;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SearchTask implements Task {

    private final String titleForSearch;


    public SearchTask(String titleForSearch){
        this.titleForSearch = titleForSearch;
    }

    public static Performable wordSearch(String titleForSearch){
        return instrumented(SearchTask.class,titleForSearch);
    }

    //Se sobreescribe el metodo declaro previamente para continuar con las acciones que se requieren
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(SearchForm.inputSearch,isVisible()).forNoMoreThan(10).seconds(),
                Enter.theValue(titleForSearch).into(SearchForm.inputSearch),
                WaitUntil.the(SearchForm.buttonSearch,isVisible()).forNoMoreThan(10).seconds(),
                Click.on(SearchForm.buttonSearch),
                WaitUntil.the(SearchForm.spanSistema,isVisible()).forNoMoreThan(10).seconds()
                );
    }
}
