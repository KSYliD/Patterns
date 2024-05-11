package org.example.creationalpatterns.abstractfactory.app;

import org.example.creationalpatterns.abstractfactory.buttons.Button;
import org.example.creationalpatterns.abstractfactory.checkboxes.Checkbox;
import org.example.creationalpatterns.abstractfactory.factories.GUIFactory;

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