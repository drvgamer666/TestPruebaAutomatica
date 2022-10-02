package co.com.choucair.certification.Proyectecni.userinterface;

import net.thucydides.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestForm extends PageObject {

    public static final Target ImputName = Target.the("F").located(By.xpath("//input[@id='firstName']"));
    public static final Target ImputLastName = Target.the("F2").located(By.xpath("//input[@id='lastName']"));
    public static final Target ImputEmail = Target.the("F3").located(By.xpath("//input[@id='email']"));
    public static final Target Month = Target.the("F4").located(By.xpath("//select[@id='birthMonth']/option[@value='number:4']"));
    public static final Target Day = Target.the("F5").located(By.xpath("//select[@id='birthDay']/option[@value='number:8']"));
    public static final Target Year = Target.the("F6").located(By.xpath("//select[@id='birthYear']/option[@value='number:1998']"));
    public static final Target NextLocation = Target.the("F7").located(By.xpath("//a[@class='btn btn-blue']"));
    public static final Target NextDivices = Target.the("F9").located(By.xpath("//a[@class='btn btn-blue pull-right']"));
    public static final Target LastStep = Target.the("F12").located(By.xpath("//a[@class='btn btn-blue pull-right']"));
    public static final Target Password = Target.the("F13").located(By.xpath("//input[@name='password']"));
    public static final Target ConfirmPassword = Target.the("F14").located(By.xpath("//input[@name='confirmPassword']"));
    public static final Target TermsOfUse = Target.the("F16").located(By.xpath("(//span[@class=\"checkmark signup-consent__checkbox error\"])[1]"));
    public static final Target PrivacyPolicy = Target.the("F17").located(By.xpath("(//span[@class='checkmark signup-consent__checkbox error'])[last()]"));
    public static final Target CompleteSetUp = Target.the("F15").located(By.xpath("//a[@class='btn btn-blue']"));
}
