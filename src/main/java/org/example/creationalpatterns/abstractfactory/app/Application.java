package org.example.abstractfactory.app;

import org.example.abstractfactory.buttons.Button;
import org.example.abstractfactory.checkboxes.Checkbox;
import org.example.abstractfactory.factories.GUIFactory;

public class Application {
    private final Button button;
    private final Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}