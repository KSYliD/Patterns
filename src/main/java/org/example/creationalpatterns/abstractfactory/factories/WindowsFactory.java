package org.example.creationalpatterns.abstractfactory.factories;

import org.example.creationalpatterns.abstractfactory.buttons.Button;
import org.example.creationalpatterns.abstractfactory.buttons.WindowsButton;
import org.example.creationalpatterns.abstractfactory.checkboxes.Checkbox;
import org.example.creationalpatterns.abstractfactory.checkboxes.WindowsCheckbox;

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
