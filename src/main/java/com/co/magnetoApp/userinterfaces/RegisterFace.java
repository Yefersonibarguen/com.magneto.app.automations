package com.co.magnetoApp.userinterfaces;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegisterFace {
    public static final Target BUTTON_REGISTER = Target.the("Botón registrarse")
            .located(By.xpath("//*[@index='9']"));
    public static final Target GO_BUTTON = Target.the("Botón ir")
            .located(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText/android.view.View"));
    public static final Target NEXT_ALERT = Target.the("Alerta de terminos")
            .located(By.xpath("//android.widget.Button[@content-desc=\"Siguiente\"]"));
    public static final Target INPUT_NAME = Target.the("Nombre ")
            .located(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[1]"));
    public static final Target INPUT_LASTNAME = Target.the("lastname ")
            .located(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[2]"));
    public static final Target INPUT_CITY = Target.the("Ciudad de nacimiento")
            .located(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText"));
    public static final Target CLICK_CITY = Target.the("")
            .located(By.xpath("//*[@index='3']"));
    public static final Target INPUT_DAY_BIRTH = Target.the("input fecha")
            .located(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.widget.ScrollView/android.view.View[4]"));
    public static final Target CLICK_DAY_BIRTH = Target.the("Clic aceptar")
            .located(By.xpath("//android.widget.Button[@content-desc=\"ACEPTAR\"]"));
    public static final Target MALE_GENDER = Target.the("Genero masculino")
            .located(By.xpath("//android.view.View[@content-desc=\"Masculino\"]"));
    public static final Target NOT_STUDIES = Target.the("No tengo estudios")
            .located(By.xpath("//android.widget.ImageView[@content-desc=\"No tengo estudios\"]"));
    public static final Target CATEGORY_ADMON = Target.the("Categoria administracion ")
            .located(By.xpath("//*[@index='1']"));
    public static final Target CATEGORY_LOGISTICS = Target.the("Categoria Logistica ")
            .located(By.xpath("//*[@index='2']"));
    public static final Target CATEGORY_CALL = Target.the("Categoria Call center ")
            .located(By.xpath("//*[@index='3']"));
    public static final Target AVAILABILITY_COMPLETE = Target.the("Disponibilidad tiempo completo")
            .located(By.xpath("//android.widget.ImageView[@content-desc=\"Tiempo completo\"]"));
    public static final Target INPUT_WAGE_ASPIRATION = Target.the("Input Aspiración salarial")
            .located(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText"));
    public static final Target SALARY_PERIODICITY_MONTHLY = Target.the("Perioricidad de salario mensual")
            .located(By.xpath("//android.view.View[@content-desc=\"Mensual\"]"));
    public static final Target INPUT_CITY_CURRENT = Target.the("Input ciudad currente")
            .located(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText"));
    public static final Target CLICK_CITY_CURRENT = Target.the("Click ciudad currente")
            .located(By.xpath("//*[@index='3']"));
    public static final Target IDENTITY = Target.the("Click Boton de identidad")
            .located(By.xpath("(//*[@index='1'])[2]"));
    public static final Target CITIZENSHIP_CARD = Target.the("Cedula de ciudadania")
            .located(By.xpath("(//*[@index='0'])[12]"));
    public static final Target INPUT_NUMBER_CITIZENSHIP = Target.the("Input Cedula de ciudadania")
            .located(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.widget.ScrollView/android.widget.ImageView[2]"));
    public static final Target INPUT_PHONE = Target.the("Input numero de telefono ")
            .located(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText"));

}
