package starter.ui.create;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CreateForm {
    public static final Target createButton   = Target.the("Buscar en Wikipedia").located(By.xpath("//li [@id='pt-createaccount-2']"));
    public static final Target userInput   = Target.the("Buscar en Wikipedia").located(By.id("wpName2"));
    public static final Target passwordInput   = Target.the("Buscar en Wikipedia").located(By.id("wpPassword2"));
    public static final Target rePasswordInput   = Target.the("Buscar en Wikipedia").located(By.id("wpRetype"));
    public static final Target emailInput   = Target.the("Buscar en Wikipedia").located(By.id("wpEmail"));
    public static final Target createAccountBotton   = Target.the("Buscar en Wikipedia").located(By.id("wpCreateaccount"));
    public static By captchaField = By.xpath("//input [@id='mw-input-captchaWord']");


}

