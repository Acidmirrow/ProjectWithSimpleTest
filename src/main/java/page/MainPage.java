package page;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;

import static com.codeborne.selenide.Selenide.$x;


public class MainPage {

    public MainPage open () {
        Selenide.open("https://www.google.com");
        $x("//img[@alt='Google']").shouldBe(Condition.visible);
        return this;
    }








}
