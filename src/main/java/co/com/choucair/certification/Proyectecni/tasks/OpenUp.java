package co.com.choucair.certification.Proyectecni.tasks;

import co.com.choucair.certification.Proyectecni.userinterface.UtestPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class OpenUp implements Task {

    private co.com.choucair.certification.Proyectecni.userinterface.UtestPage UtestPage;
    public static OpenUp thePage() {
        return Tasks.instrumented(OpenUp.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
            actor.attemptsTo(Open.browserOn(UtestPage));
    }
}
