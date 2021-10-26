package guru.qa;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TestingForm {

    @BeforeAll
    static void beforeAll(){
        Configuration.startMaximized = true;
    }

    @Test
    void FillFormTest() {
        open("https://demoqa.com/automation-practice-form");
        $("#firstName").setValue("Ann");
        $("#lastName").setValue("Blini");
        $("#userEmail").setValue("blinchiki@smetana.ru");
        $(By.className("custom-control-label")).click();
        $("#userNumber").setValue("88005553535");
        $(By.className("css-2b097c-container")).setValue("some smetanka");


        $("#submit").click();


    }
}
