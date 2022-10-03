package co.com.choucair.certification.Proyectecni.tasks;


import co.com.choucair.certification.Proyectecni.userinterface.UtestForm;
import net.bytebuddy.asm.Advice;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class CompleteForm implements Task {
    public static Performable the() {
        return Tasks.instrumented(CompleteForm.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("David").into(UtestForm.ImputName),
                Enter.theValue("Reinoso").into(UtestForm.ImputLastName),
                Enter.theValue("davidreinoso252@gmail.com").into(UtestForm.ImputEmail),
                Click.on(UtestForm.Month),
                Click.on(UtestForm.Day),
                Click.on(UtestForm.Year),
                Click.on(UtestForm.NextLocation),
                Click.on(UtestForm.NextDivices),
                Click.on(UtestForm.LastStep),
                Enter.theValue("Prueba2022=").into(UtestForm.Password),
                Enter.theValue("Prueba2022=").into(UtestForm.ConfirmPassword),
                Click.on(UtestForm.TermsOfUse),
                Click.on(UtestForm.PrivacyPolicy),
                Click.on(UtestForm.CompleteSetUp)
        );
    }
}
