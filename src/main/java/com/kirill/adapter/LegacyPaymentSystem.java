package com.kirill.adapter;

public class LegacyPaymentSystem {

    public void makePayment(int amountInCents) {

        System.out.println(
                "Legacy system paid "
                        + amountInCents
                        + " cents."
        );
    }
}
