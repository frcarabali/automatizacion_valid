package starter.ui.history;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HistoryForm {
    public static final Target seeHistory   = Target.the("Ver historial").located(By.xpath("//li[@id='ca-history']/a/span"));
    public static final Target radiobutton1   = Target.the("Radiobutton 1").located(By.id("mw-oldid-115085235"));
    public static final Target radiobutton2   = Target.the("Radiobutton 2").located(By.id("mw-oldid-112541615"));
    public static final Target buttonCompareHistory   = Target.the("Botón para comparar revisiones seleccionadas").located(By.xpath("//form[@id='mw-history-compare']/div/input"));
    public static final Target review1   = Target.the("referencia uno").located(By.xpath("//*[@id='mw-diff-otitle1']/strong/a"));
    public static final Target review2   = Target.the("referencia dos").located(By.xpath("//*[@id='mw-diff-ntitle1']/strong/a"));


}

