package org.example.creationalpatterns.factorymethod.factory;

import org.example.creationalpatterns.factorymethod.buttons.Button;
import org.example.creationalpatterns.factorymethod.buttons.HtmlButton;

public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}