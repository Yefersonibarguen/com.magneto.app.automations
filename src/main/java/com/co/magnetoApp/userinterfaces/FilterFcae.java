package com.co.magnetoApp.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FilterFcae {
    public static final Target BUTTON_FILTER = Target.the("Boton Filtrar")
            .located(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.ImageView[2]"));
    public static final Target JOB_CATEGORY = Target.the("Categoria laboral")
            .located(By.xpath("//android.widget.Button[@content-desc][1]"));

    public static final Target USER_ACTIONS = Target.the("Acciones de usuario")
            .located(By.xpath("//android.widget.Button[@content-desc][2]"));
    public static final Target LOCATION = Target.the("Ubicacion")
            .located(By.xpath("//android.widget.Button[@content-desc][3]"));
    public static final Target SALARY = Target.the("Salario")
            .located(By.xpath("//android.widget.Button[@content-desc][4]"));
    public static final Target EXPERIENCE = Target.the("Experiencia laboral")
            .located(By.xpath("//android.widget.Button[@content-desc][5]"));
    public static final Target APPLICATION_DATE = Target.the("Fecha de aplicación")
            .located(By.xpath("//android.widget.Button[@content-desc][6]"));
    public static final Target CONTRACT_TYPE = Target.the("tipo de contrati")
            .located(By.xpath("//android.widget.Button[@content-desc][7]"));
    public static final Target COPIA = Target.the("")
            .located(By.xpath(""));
    public static final Target COPIAA = Target.the("")
            .located(By.xpath(""));

}
