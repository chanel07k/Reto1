package co.com.choucair.reto1screenplay.tasks;

import co.com.choucair.reto1screenplay.interactions.OpcionLista;
import co.com.choucair.reto1screenplay.interactions.SeleccionLista;
import co.com.choucair.reto1screenplay.model.BuscarData;
import co.com.choucair.reto1screenplay.userinterface.ComprobarPage;
import co.com.choucair.reto1screenplay.userinterface.Register;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Login implements Task {
    private List<BuscarData> buscarData;

    public Login(List<BuscarData> buscarData) {
        this.buscarData = buscarData;
    }

    public static Login OnThePage(List<BuscarData> buscardata) {
        return Tasks.instrumented(Login.class, buscardata);


    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Enter.theValue(buscarData.get(0).getName()).into(Register.TXT_NAME),
                Enter.theValue(buscarData.get(0).getLastname()).into(Register.TXT_LASTNAME),
                Enter.theValue(buscarData.get(0).getAdress()).into(Register.TXT_ADRESS),
                Enter.theValue(buscarData.get(0).getEmail()).into(Register.TXT_EMAIL),
                Enter.theValue(buscarData.get(0).getPhone()).into(Register.TXT_PHONE),
                Click.on(Register.RADIO_GENDER),
                Click.on(Register.RADIO_HOBBIES),
                Click.on(Register.SELECT_LANGUAGES),
                SeleccionLista.laLista(Register.LIST_LANGUAGES,buscarData.get(0).getLanguages()),
                OpcionLista.laLista(Register.LIST_SKILLS, buscarData.get(0).getSkills()),
                OpcionLista.laLista(Register.LIST_COUNTRY, buscarData.get(0).getCountry()),
                OpcionLista.laLista(Register.LIST_SECONDCOUNTRY, buscarData.get(0).getSecondcountry()),
                OpcionLista.laLista(Register.LIST_YEAR, buscarData.get(0).getYear()),
                OpcionLista.laLista(Register.LIST_MONTH, buscarData.get(0).getMonth()),
                OpcionLista.laLista(Register.LIST_DAY, buscarData.get(0).getDay()),
                Enter.theValue(buscarData.get(0).getPass()).into(Register.TXT_PASS),
                Enter.theValue(buscarData.get(0).getSecondpass()).into(Register.TXT_2PASS),
                Click.on(Register.BUTTON_SUBMIT),
                WaitUntil.the(ComprobarPage.VERIFICAR_PAGE, isVisible())

                );


    }
}