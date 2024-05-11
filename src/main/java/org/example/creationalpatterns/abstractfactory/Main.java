package org.example.creationalpatterns.abstractfactory;

import org.example.creationalpatterns.abstractfactory.app.Application;
import org.example.creationalpatterns.abstractfactory.factories.GUIFactory;
import org.example.creationalpatterns.abstractfactory.factories.MacOSFactory;
import org.example.creationalpatterns.abstractfactory.factories.WindowsFactory;

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