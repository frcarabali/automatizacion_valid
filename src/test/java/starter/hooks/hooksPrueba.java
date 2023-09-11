package starter.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class hooksPrueba {

    @Before("@login2")
    public static void beforeHook(){
        //Ejecucion previa a cada test
    }
    @After
    public static void afterHook(){

        //Ejecucion posterior a cada test
    }
}
