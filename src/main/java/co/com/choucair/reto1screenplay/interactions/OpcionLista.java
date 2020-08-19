package co.com.choucair.reto1screenplay.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.core.annotations.findby.By;
import org.openqa.selenium.WebElement;
import java.util.List;

public class OpcionLista implements Interaction {
    private Target lista;
    private String opcion;

    public OpcionLista(Target lista, String opcion){
        this.lista = lista;
        this.opcion = opcion;

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        List<WebElement> listObjeto = lista.resolveFor(actor).findElements(By.tagName("option"));
        for (int i=0; i< listObjeto.size(); i++){
            if (listObjeto.get(i).getText().equals(opcion)){
                listObjeto.get(i).click();
                break;
            }
        }
        System.out.println(lista);
        System.out.println(opcion);


    }

    public static OpcionLista laLista (Target lista, String opcion){
        return new OpcionLista(lista,opcion);
    }
}
