package org.example.abstractfactory.factories;

import org.example.abstractfactory.buttons.Button;
import org.example.abstractfactory.buttons.WindowsButton;
import org.example.abstractfactory.checkboxes.Checkbox;
import org.example.abstractfactory.checkboxes.WindowsCheckbox;

public class WindowsFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
