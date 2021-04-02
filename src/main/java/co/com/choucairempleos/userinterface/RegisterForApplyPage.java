package co.com.choucairempleos.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegisterForApplyPage {

    public static final Target APPLY_FOR_JOB = Target.the("Button Apply For Job").located(By.xpath("//input[@class=\"application_button button\"]"));
    public static final Target SCROLL = Target.the("Button Apply For Job").located(By.xpath("//*[@id=\"post-7547\"]/div/div[2]/div[2]/p[3]/strong"));
    public static final Target FULL_NAME = Target.the("Full Name").located(By.id("nombre-completo"));
    public static final Target EMAIL = Target.the("Email").located(By.id("correo-electronico"));
    public static final Target PHONE = Target.the("Phone").located(By.id("celular-o-telefono-de-contacto"));
    public static final Target FORMAL_STUDIES = Target.the("Formal Studies").located(By.id("que-estudios-formales-tienes-o-en-que-semestre-te-encuentras-actualmente"));
    public static final Target EXPERIENCE = Target.the("Experience").located(By.id("que-tiempo-de-experiencia-certificada-tienes-en-pruebas-o-en-desarrollo-de-softwaresi-aplica"));
    public static final Target KNOW_AUTOMATION = Target.the("Know Automation").located(By.id("conoces-de-automatizacion-de-pruebas-te-gustaria-aprendersi-aplica"));
    public static final Target SALARY = Target.the("Salary").located(By.id("cual-es-tu-aspiracion-salarial"));
    public static final Target AVAILABILITY = Target.the("Availability").located(By.id("si-eres-seleccionado-que-disponibilidad-de-tiempo-para-ingresar-tendrias"));
    public static final Target MESSAGE = Target.the("Additional Message").located(By.id("mensaje-adicional"));
    public static final Target SEND_APLICATION = Target.the("Button Send Aplication").located(By.xpath("//input[@class=\"button wp_job_manager_send_application_button\"]"));
    public static final Target CV_IS_REQUIRED = Target.the("Message Expected").located(By.xpath("//*[contains(text(), '\"CV\" is a required field')]"));

}
