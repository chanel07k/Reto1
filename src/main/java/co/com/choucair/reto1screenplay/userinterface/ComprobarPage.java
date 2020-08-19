package co.com.choucair.reto1screenplay.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ComprobarPage extends PageObject {

    public static Target VERIFICAR_PAGE = Target.the("FRASE PARA VALIDAR PAGINA")
            .located(By.xpath("/html/body/section/div[1]/div/div[2]/h4[1]"));
}
