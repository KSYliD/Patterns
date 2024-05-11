package org.example.creationalpatterns.factorymethod.factory;

import org.example.creationalpatterns.factorymethod.buttons.Button;
import org.example.creationalpatterns.factorymethod.buttons.WindowsButton;

public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}