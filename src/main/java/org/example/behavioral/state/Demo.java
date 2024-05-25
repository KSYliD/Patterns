package org.example.behavioral.state;

import org.example.behavioral.state.ui.Player;
import org.example.behavioral.state.ui.UI;

public class Demo {
    public static void main(String[] args) {
        Player player = new Player();
        UI ui = new UI(player);
        ui.init();
    }
}
