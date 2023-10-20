package org.howard.edu.lsp.midterm.problem2;

public class Driver {
    public static void main(String[] args) {
        Range myRange1 = new Range(5, 10);
        Range myRange2 = new Range(8, 15);
        int testNumber = 7;

        System.out.println("Is " + testNumber + " in range? " + myRange1.isValueInRange(testNumber));
        System.out.println("Do myRange1 and myRange2 overlap? " + myRange1.doRangesOverlap(myRange2));
        System.out.println("Size of myRange1: " + myRange1.size());
    }
}
