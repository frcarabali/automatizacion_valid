package starter.questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import starter.ui.search.SearchForm;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.core.pages.WebElementState;

//Preguntas requeridas para los escenarios de pruebas
public class ExistContentQuestion {

    public static Question<String> titleHome(){
        return actor -> Text.of(SearchForm.spanWiki).answeredBy(actor);
    }

    public static Question<String> titleSearch(){
        return actor -> Text.of(SearchForm.spanSistema).answeredBy(actor);
    }

    public static Question<String> subTitleHome(){
        return actor -> Text.of(SearchForm.spanAnalisisCeem).answeredBy(actor);
    }
    public static Question<WebElementState> stateOf(Target target)
    {

        return new WebElementQuestion(target);
    }

    public static Question<WebElementState> the(Target target) {

        return stateOf(target);
    }
}
