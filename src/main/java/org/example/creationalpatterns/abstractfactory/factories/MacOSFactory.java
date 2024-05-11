package org.example.abstractfactory.factories;

import org.example.abstractfactory.buttons.Button;
import org.example.abstractfactory.buttons.MacOSButton;
import org.example.abstractfactory.checkboxes.Checkbox;
import org.example.abstractfactory.checkboxes.MacOSCheckbox;

public class MacOSFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}