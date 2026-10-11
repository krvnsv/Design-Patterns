package com.kirill.absfactory;

public class WindowsCheckbox implements Checkbox {

    @Override
    public void paint() {
        System.out.println("Rendering Windows checkbox");
    }
}