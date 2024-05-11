package org.example.creationalpatterns.abstractfactory.factories;

import org.example.creationalpatterns.abstractfactory.buttons.Button;
import org.example.creationalpatterns.abstractfactory.buttons.MacOSButton;
import org.example.creationalpatterns.abstractfactory.checkboxes.Checkbox;
import org.example.creationalpatterns.abstractfactory.checkboxes.MacOSCheckbox;

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