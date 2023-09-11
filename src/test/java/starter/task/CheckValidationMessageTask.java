package starter.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import starter.ui.create.CreateForm;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CheckValidationMessageTask implements Task {

    public CheckValidationMessageTask(){
        //constructor vacío
    }

    //Metodo para la validación de pop-up que se genera en captcha vació al dar click en la creacion de usuario
    public static Performable CheckValidationMessage(){
        return instrumented(CheckValidationMessageTask.class);
    }

    //Se sobreescribe el metodo declarado previamente para continuar con las acciones que se requieren
    @Override
    public <T extends Actor> void performAs(T actor) {

        //Se ejecutan dos scripts JavaScript en el elemento web para obtener información:
        //El primer script verifica si el campo es obligatorio (required) y devuelve un valor booleano.
        //El segundo script obtiene el mensaje de validación (validationMessage) asociado al campo y lo almacena en una variable de tipo String llamada validationMessage.

        WebDriver driver = BrowseTheWeb.as(actor).getDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement field= driver.findElement(CreateForm.captchaField);
        Boolean isValid = (Boolean) js.executeScript("return arguments[0].required;", field);
        String validationMessage = (String) js.executeScript("return arguments[0].validationMessage;", field);
        actor.remember("isValid", isValid);
        actor.remember("validationMessage", validationMessage);

    }
}
