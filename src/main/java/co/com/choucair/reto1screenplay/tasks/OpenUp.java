package co.com.choucair.reto1screenplay.tasks;

import co.com.choucair.reto1screenplay.userinterface.AcademyDemoSite;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class  OpenUp implements Task {
    private AcademyDemoSite academydemosite;


    public static OpenUp ThePage() {
        return Tasks.instrumented(OpenUp.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(academydemosite));



    }
}
