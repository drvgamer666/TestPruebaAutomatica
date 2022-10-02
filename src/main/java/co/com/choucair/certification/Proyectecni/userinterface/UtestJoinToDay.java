package co.com.choucair.certification.Proyectecni.userinterface;

import net.serenitybdd.core.pages.PageObject;
import  net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestJoinToDay extends PageObject {
    public static final Target JoinToDayButton = Target.the("button for register new user").located(By.xpath("//a[@class='unauthenticated-nav-bar__sign-up']"));



}
