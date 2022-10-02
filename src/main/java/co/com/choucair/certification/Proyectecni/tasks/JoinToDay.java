package co.com.choucair.certification.Proyectecni.tasks;

import co.com.choucair.certification.Proyectecni.userinterface.UtestJoinToDay;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;


public class JoinToDay implements Task {

    public static Performable onThePage() {
        return Tasks.instrumented(JoinToDay.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(UtestJoinToDay.JoinToDayButton));
    }
}
