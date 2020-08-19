package co.com.choucair.reto1screenplay.questions;


import co.com.choucair.reto1screenplay.model.BuscarData;
import co.com.choucair.reto1screenplay.userinterface.ComprobarPage;
import co.com.choucair.reto1screenplay.userinterface.Register;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Comprobar implements Question<Boolean> {


    private String verificar;


    public Comprobar (String verificar){
        this.verificar = verificar;

    }

    public static Comprobar ThePage (String verificar) {
        return new Comprobar(verificar);
    }


    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String namepage = Text.of(ComprobarPage.VERIFICAR_PAGE).viewedBy(actor).asString();

        if (namepage.equals(verificar)){
            result = true; }
        else
        {result = false; }
        return result;
    }
}


