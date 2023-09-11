package starter.conf;

import io.cucumber.java.Before;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class SetTheStage {

//En caso de requerir alguna accion antes de la ejecucion de los casos
    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }
}
