package com.kirill.adapter;

public class LegacyPaymentAdapter implements PaymentProcessor {

    private final LegacyPaymentSystem legacySystem;

    public LegacyPaymentAdapter(LegacyPaymentSystem legacySystem) {
        this.legacySystem = legacySystem;
    }

    @Override
    public void pay(double amount) {

        int amountInCents = (int) Math.round(amount * 100);

        legacySystem.makePayment(amountInCents);
    }
}

// 100.50 euro, legacy system wants 10050 cents
