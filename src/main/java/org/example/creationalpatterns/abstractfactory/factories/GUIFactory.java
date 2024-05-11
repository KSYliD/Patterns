package org.example.abstractfactory.factories;

import org.example.abstractfactory.buttons.Button;
import org.example.abstractfactory.checkboxes.Checkbox;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}