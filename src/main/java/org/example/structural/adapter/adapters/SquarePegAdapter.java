package org.example.structural.adapter.adapters;

import org.example.structural.adapter.round.RoundPeg;
import org.example.structural.adapter.square.SquarePeg;

public class SquarePegAdapter extends RoundPeg {
    private final SquarePeg peg;

    public SquarePegAdapter(SquarePeg peg) {
        this.peg = peg;
    }

    @Override
    public double getRadius() {
        double result;
        // Calculate a minimum circle radius, which can fit this peg.
        result = (Math.sqrt(Math.pow((peg.width() / 2), 2) * 2));
        return result;
    }
}
