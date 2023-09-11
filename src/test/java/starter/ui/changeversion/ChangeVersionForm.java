package starter.ui.changeversion;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ChangeVersionForm {
    public static final Target buttonMobileVersion   = Target.the("Versión para móbiles").located(By.xpath("//li[@id='footer-places-mobileview']/a"));
    public static final Target buttonDesktopVersion   = Target.the("Versión para móbiles").located(By.xpath("//li [@id='footer-places-desktop-toggle']/a"));
}

