package com.co.magnetoApp.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import javax.xml.xpath.XPath;

public class LogInFace {

    public static final Target BUTTON_SKIP = Target.the("Boton saltar")
            .located(By.xpath("//android.widget.Button[@content-desc=\"Omitir\"]"));
    public static final Target INPUT_EMAIL = Target.the("Campo email")
            .located(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText"));
    public static final Target BUTTON_LOGIN = Target.the("Boton Login")
            .located(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.Button[3]"));
    public static final Target SCROLL = Target.the("Scroll")
            .located(By.xpath("//android.view.View[@content-desc=\"With your email\"]"));

    public static final Target HOME = Target.the("Texto de home en la parte inferior izquierda")
            .located(By.xpath("//android.view.View[@content-desc=\"HOME\"]"));
    public static final Target JOB = Target.the("Boton de Job")
            .located(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View/android.view.View/android.widget.ImageView"));
    public static final Target CLOSE_AD = Target.the("Cerrar anuncio")
            .located(By.xpath("//android.widget.Button[@content-desc=\"Omitir\"]"));
    public static final Target VACANT = Target.the("Vacante 1")
            .located(By.xpath("//*[@index='0']"));
    public static final Target RETURN = Target.the("Volver")
            .located(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView"));
    public static final Target PROCESSES = Target.the("Procesos")
            .located(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[4]/android.view.View/android.view.View/android.widget.ImageView"));

    public static final Target INACTIVE = Target.the("Inactivo")
            .located(By.xpath("//*[@index='1']"));
    public static final Target MESSAGE = Target.the("Mensaje ")
            .located(By.xpath("//*[@index='2']"));
    public static final Target PROFILE = Target.the("Procesos")
            .located(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[5]/android.view.View/android.view.View/android.widget.ImageView"));
    public static final Target FURTHER = Target.the(" ")
            .located(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[6]/android.view.View/android.view.View/android.widget.ImageView"));
    public static final Target SIGN_OFF = Target.the("Cerrar sesion ")
            .located(By.xpath("//*[@index='0']"));
}
