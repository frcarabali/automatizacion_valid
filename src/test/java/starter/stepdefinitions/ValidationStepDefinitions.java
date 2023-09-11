package starter.stepdefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import starter.questions.ExistContentQuestion;
import starter.task.ScrollTask;
import starter.task.SearchTask;
import static org.hamcrest.Matchers.equalTo;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class ValidationStepDefinitions {

    //paso donde se genera la busqueda en Wikipedia por la palabra seleccionada
    @Cuando("^el usuario busca la palabra (.*)")
    public void el_usuario_busca_la_palabra(String titleForSearch) {
        theActorInTheSpotlight().attemptsTo(
                SearchTask.wordSearch(titleForSearch)
        );
    }
    //paso donde se valida por medio de una question la existencia del titulo sistema tras la búsqueda
    @Entonces("^el titulo de la pagina de resultados debe contener (.*)")
    public void el_titulo_de_la_pagina_de_resultados_debe_contener(String titleForSearch) {
        theActorInTheSpotlight()
                .should(seeThat("Valida la existencia del titulo sistema tras la búsqueda",
                        ExistContentQuestion.titleSearch(),equalTo(titleForSearch)));
    }

    //paso donde se genera scroll hasta encontrar Analisis CEEM en los resultados
    @Y("el usuario hace scroll para encontrar Analisis CEEM en los resultados")
    public void el_usuario_hace_scroll_para_encontrar() {
        theActorInTheSpotlight().attemptsTo(
                ScrollTask.wordScroll()
        );
    }
    //paso donde se genera la validacion por medio de una question, la existencia del subtitulo Analisis CEEM por medio de una question
    @Entonces("^el subtitulo de la pagina de resultados debe contener (.*)")
    public void el_subtitulo_de_la_pagina_de_resultados_debe_contener(String subtitleForSearch) {
        theActorInTheSpotlight()
                .should(seeThat("Valida la existencia del subtitulo Analisis CEEM tras el scroll",
                        ExistContentQuestion.subTitleHome(), equalTo(subtitleForSearch)));
    }
}
