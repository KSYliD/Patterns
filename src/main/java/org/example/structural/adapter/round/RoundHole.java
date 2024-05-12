package org.example.structural.adapter.round;

public record RoundHole(double radius) {

    public boolean fits(RoundPeg peg) {
        boolean result;
        result = (this.radius() >= peg.getRadius());
        return result;
    }
}