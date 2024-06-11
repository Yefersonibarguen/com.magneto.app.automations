package com.co.magnetoApp.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class EditUserInterfaces {
    public static final Target WHO_ARE_YOU = Target.the("Quien eres")
            .located(By.xpath("//android.widget.ImageView[@content-desc][1]"));
    public static final Target EXPERIENCE = Target.the("Experiencia laboral")
            .located(By.xpath("//android.widget.ImageView[@content-desc][1]"));
    public static final Target SALARY = Target.the("Experiencia laboral")
            .located(By.xpath("//android.widget.ImageView[@content-desc][1]"));
    public static final Target BIRTHDATE = Target.the("Experiencia laboral")
            .located(By.xpath("//android.widget.ImageView[@content-desc][1]"));
    public static final Target BACK = Target.the("Atras")
            .located(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.ImageView"));

}
