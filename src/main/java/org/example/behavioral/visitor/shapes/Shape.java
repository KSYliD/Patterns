package org.example.behavioral.visitor.shapes;

import org.example.behavioral.visitor.visitor.Visitor;

public interface Shape {
    void move(int x, int y);
    void draw();
    String accept(Visitor visitor);
}
