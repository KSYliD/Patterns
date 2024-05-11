package org.example.abstractfactory;

import org.example.abstractfactory.app.Application;
import org.example.abstractfactory.factories.GUIFactory;
import org.example.abstractfactory.factories.MacOSFactory;
import org.example.abstractfactory.factories.WindowsFactory;

public class Main {

    private static Application configureApplication() {
        Application app;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new MacOSFactory();
        } else {
            factory = new WindowsFactory();
        }
        app = new Application(factory);
        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }
}