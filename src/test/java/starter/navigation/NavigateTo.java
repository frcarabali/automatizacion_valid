package starter.navigation;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

//Metodo que genera invoca la url requerida para la navegación
public class NavigateTo {
    public static Performable theWikipediaGoHomePage() {
        return Task.where("{0} abre pagina de portada de Wikipedia",
                Open.browserOn().the(WikipediaGoHomePage.class));
    }
}
