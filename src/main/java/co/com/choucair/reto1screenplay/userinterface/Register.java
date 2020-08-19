package co.com.choucair.reto1screenplay.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;


public class Register extends PageObject {
    public static final Target TXT_NAME = Target.the("Escribir nombre")
            .located(By.xpath("//form[@id='basicBootstrapForm']/div[1]/div[1]/input[1]"));
    public static final Target TXT_LASTNAME = Target.the("Escribir apellido")
            .located(By.xpath("//form[@id='basicBootstrapForm']/div[1]/div[2]/input[1]"));
    public static final Target TXT_ADRESS = Target.the("Escribir dirreccion")
            .located(By.xpath("//form[@id='basicBootstrapForm']/div[2]/div[1]/textarea[1]"));
    public static final Target TXT_EMAIL = Target.the("Escribir correo")
            .located(By.xpath("//*[@id='eid']/input"));
    public static final Target TXT_PHONE = Target.the("Escribir telefono")
            .located(By.xpath("//*[@id='basicBootstrapForm']/div[4]/div/input"));
    public static final Target RADIO_GENDER = Target.the("Escribir telefono")
            .located(By.xpath("//*[@id='basicBootstrapForm']/div[5]/div/label[2]/input"));
    public static final Target RADIO_HOBBIES = Target.the("Escribir telefono")
            .located(By.xpath("//*[@id='checkbox2']"));
    public static final Target SELECT_LANGUAGES = Target.the("Escribir idioma")
            .located(By.id("msdd"));
    public static final Target LIST_LANGUAGES = Target.the("Escribir idioma")
            .located(By.xpath("//*[@id='basicBootstrapForm']/div[7]/div/multi-select/div[2]/ul"));
    public static final Target LIST_SKILLS = Target.the("Escribir skills")
            .located(By.xpath("//*[@id='Skills']"));
    public static final Target LIST_COUNTRY = Target.the("Escribir pais")
            .located(By.xpath("//*[@id='countries']"));
    public static final Target LIST_SECONDCOUNTRY = Target.the("Escribir pais")
            .located(By.xpath("//*[@id='basicBootstrapForm']/div[10]/div"));
    public static final Target LIST_YEAR = Target.the("Escribir pais")
            .located(By.xpath("//*[@id='yearbox']"));
    public static final Target LIST_MONTH = Target.the("Escribir pais")
            .located(By.xpath("//*[@id='basicBootstrapForm']/div[11]/div[2]/select"));
    public static final Target LIST_DAY = Target.the("Escribir pais")
            .located(By.xpath("//*[@id='daybox']"));
    public static final Target TXT_PASS = Target.the("Escribir contraseña")
            .located(By.xpath("//*[@id='firstpassword']"));
    public static final Target TXT_2PASS = Target.the("Escribir segunda contraseña")
            .located(By.xpath("//*[@id='secondpassword']"));
    public static final Target BUTTON_SUBMIT = Target.the("Escribir segunda contraseña")
            .located(By.xpath("//*[@id='submitbtn']"));

}
