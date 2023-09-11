package starter.ui.search;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

//Localizadores encontrados en la pagina inicial de la prueba
public class SearchForm {
    public static final Target spanWiki   = Target.the("Bienvenidos a Wikipedia").located(By.id("Bienvenidos_a_Wikipedia,"));
    public static final Target inputSearch   = Target.the("Buscar en Wikipedia").located(By.id("searchInput"));
    public static final Target buttonSearch   = Target.the("Buscar").located(By.xpath("//button[text()='Buscar']"));
    public static final Target spanSistema   = Target.the("Buscar en Wikipedia").located(By.xpath("//h1 [@id='firstHeading'] //child::span[text()='Sistema']"));
    public static final Target spanAnalisisCeem   = Target.the("Buscar en Wikipedia").located(By.id("Análisis_CEEM"));
}

