package org.example.structural.adapter.square;

public record SquarePeg(double width) {

    public double getSquare() {
        double result;
        result = Math.pow(this.width, 2);
        return result;
    }
}