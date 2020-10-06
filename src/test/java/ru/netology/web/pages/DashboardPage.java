package ru.netology.web.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class DashboardPage {

    private final SelenideElement firstCard = $("[data-test-id=] .button");
    private final SelenideElement secondCard = $("[data-test-id=] .button");

    public DashboardPage() {
        SelenideElement heading = $("[data-test-id=dashboard]");
        heading.shouldBe(Condition.visible);
    }

    public TransferPage transferPage(){

    }

}

