package ru.netology.web.pages;

import com.codeborne.selenide.SelenideElement;
import ru.netology.web.data.DataHelper;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.visible;

public class VerificationPage {

    private final SelenideElement codeField = $("[data-test-id=code] input");
    private final SelenideElement verifyButton = $("[data-test-id=action-verify]");

    public VerificationPage() {
        codeField.shouldBe(visible);
    }

    public void validVerify(DataHelper.VerificationCode verificationCode){
        codeField.setValue(verificationCode.getCode());
        verifyButton.click();
        new DashboardPage();
    }
}
