package org.howard.edu.lsp.midterm.problem2;

public class Range {
    private int lowerBound;
    private int upperBound;

    public Range(int lowerBound, int upperBound) {
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
    }

    public boolean isValueInRange(int value) {
        return value >= lowerBound && value <= upperBound;
    }

    public boolean doRangesOverlap(Range otherRange) {
        return this.lowerBound <= otherRange.upperBound && otherRange.lowerBound <= this.upperBound;
    }

    public int size() {
        return upperBound - lowerBound + 1;
    }
}



