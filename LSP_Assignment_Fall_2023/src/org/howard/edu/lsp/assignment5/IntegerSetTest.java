package org.howard.edu.lsp.assignment5;



import static org.junit.jupiter.api.Assertions.*;



import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.DisplayName;

import org.junit.jupiter.api.Test;



public class IntegerSetTest {

    private IntegerSet set;



    @BeforeEach

    void setUp() {

        set = new IntegerSet();

    }



    @Test

    @DisplayName("Test case for add")

    public void testAdd() {

        set.add(1);
        set.add(-1);
        set.add(1000);
        assertFalse(set.contains(0));

        assertTrue(set.contains(1));

        assertFalse(set.contains(2));
        
        assertTrue(set.contains(1000));
        
        assertTrue(set.contains(-1));


        
        

    }



    @Test

    @DisplayName("Test case for clear")

    public void testClear() {

        set.add(1);

        set.clear();

        assertTrue(set.isEmpty());

    }



    @Test

    @DisplayName("Test case for toString")

    public void testToString() {

        set.add(1);

        set.add(2);

        assertEquals("[1, 2]", set.toString());

    }



    @Test

    @DisplayName("Test case for remove")

    public void testRemove() {

        set.add(0);
        set.remove(0);
        assertFalse(set.contains(0));

    }



    @Test

    @DisplayName("Test case for equals")

    public void testEquals() {

        IntegerSet firstSet = new IntegerSet();

        firstSet.add(1);

        firstSet.add(2);

        IntegerSet secondSet = new IntegerSet();

        secondSet.add(2);

        secondSet.add(1);
        
        IntegerSet thirdSet = new IntegerSet();
        
        secondSet.add(2);

        secondSet.add(1);
        
        secondSet.add(0);

        secondSet.add(-1);
        
        assertFalse(firstSet.equals(secondSet));

        assertFalse(firstSet.equals(thirdSet));

    }



    @Test

    @DisplayName("Test case for length")

    public void testLength() {

        set.add(10);

        set.add(20);
        
        set.add(30);

        set.add(15);

        set.add(25);
        
        set.add(35);

        assertEquals(6, set.length());

    }



    @Test

    @DisplayName("Test case for isEmpty")

    public void testIsEmpty() {

        assertTrue(set.isEmpty());

    }



    @Test

    @DisplayName("Test case for largest")

    public void testLargest() throws IntegerSetException {

        IntegerSet set = new IntegerSet();

        set.add(99);

        set.add(33);
        
        set.add(67);
        
        set.add(70);
        
        set.add(10);
        
        set.add(25);
        
        


        assertEquals(99, set.largest());

    }



    @Test

    @DisplayName("Test case for smallest")

    public void testSmallest() throws IntegerSetException {

        IntegerSet set = new IntegerSet();


        set.add(99);

        set.add(33);
        
        set.add(67);
        
        set.add(70);
        
        set.add(10);
        
        set.add(25);

        assertEquals(10, set.smallest());
        
    }



    @Test

    @DisplayName("Test case for union")

    public void testUnion() {

        IntegerSet firstSet = new IntegerSet();

        firstSet.add(0);

        firstSet.add(1);

        firstSet.add(2);

        firstSet.add(3);
        
        IntegerSet secondSet = new IntegerSet();

        secondSet.add(10);

        secondSet.add(20);

        firstSet.union(secondSet);

        assertTrue(firstSet.contains(0));

        assertTrue(firstSet.contains(1));
        
        assertTrue(firstSet.contains(2));
        
        assertTrue(firstSet.contains(3));

        assertTrue(firstSet.contains(10));
        
        assertTrue(firstSet.contains(20));


    }



    @Test

    @DisplayName("Test case for intersect")

    public void testIntersect() {

        IntegerSet firstSet = new IntegerSet();

        firstSet.add(0);

        firstSet.add(1);

        IntegerSet secondSet = new IntegerSet();

        secondSet.add(1);

        secondSet.add(2);

        firstSet.intersect(secondSet);

        assertFalse(firstSet.contains(0));

        assertTrue(firstSet.contains(1));

        assertFalse(firstSet.contains(3));

    }



    @Test

    @DisplayName("Test case for diff")

    public void testDiff() {

        IntegerSet firstSet = new IntegerSet();

        firstSet.add(0);

        firstSet.add(1);

        IntegerSet secondSet = new IntegerSet();

        secondSet.add(1);

        secondSet.add(2);

        firstSet.diff(secondSet);

        assertTrue(firstSet.contains(0));

        assertFalse(firstSet.contains(1));

        assertFalse(firstSet.contains(2));

    }



    @Test

    @DisplayName("Test case for complement")

    public void testComplement() {

        IntegerSet globalSet = new IntegerSet();

        globalSet.add(1);

        globalSet.add(2);

        globalSet.add(3);

        globalSet.add(4);

        set.add(1);

        set.add(2);

        set.complement(globalSet);

        assertFalse(set.contains(1));

        assertFalse(set.contains(2));

        assertTrue(set.contains(3));
        
        assertTrue(set.contains(4));

    }



    @Test

    @DisplayName("Test case for largest exception")

    public void testLargestException() {

        assertThrows(IntegerSetException.class, () -> {

            set.largest();

        });

    }



    @Test

    @DisplayName("Test case for smallest exception")

    public void testSmallestException() {

        assertThrows(IntegerSetException.class, () -> {

            set.smallest();

        });

    }

}