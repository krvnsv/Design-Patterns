package com.kirill.absfactory;

public class MacButton implements Button {

    @Override
    public void paint() {
        System.out.println("Rendering Mac button");
    }
}
