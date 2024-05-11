package org.example.creationalpatterns.abstractfactory.factories;

import org.example.creationalpatterns.abstractfactory.buttons.Button;
import org.example.creationalpatterns.abstractfactory.checkboxes.Checkbox;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}