package ru.netology.web.data;

import lombok.AllArgsConstructor;
import lombok.Value;

public class DataHelper {
    private DataHelper() {

    }

    @Value
    public static class AuthInfo {
        String login;
        String password;
    }

    public static AuthInfo getAuthInfo() {
        return new AuthInfo("vasya", "qwerty123");
    }

    @Value
    public static class VerificationCode {
        String code;
    }

    public static VerificationCode getVerificationCode() {
        return new VerificationCode("12345");
    }

    @Value
    @AllArgsConstructor
    public static class TransferInfo {
        String card;
    }

    public static TransferInfo getFirstCardNumber() {
        return new TransferInfo("5559 0000 0000 0001");
    }

    public static TransferInfo getSecondCardNumber() {
        return new TransferInfo("5559 0000 0000 0002");
    }

    public static int getBalanceIfIncrease(int balance, int amount) {
        return balance + amount;
    }

    public static int getBalanceIfDecrease(int balance, int amount) {
        return balance - amount;
    }

    public static TransferInfo getEmptyCardNumber() {
        return new TransferInfo("");
    }

    public static TransferInfo getIncorrectCardNumber() {
        return new TransferInfo("5559000000002222");
    }
}
