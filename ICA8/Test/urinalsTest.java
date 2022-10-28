import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class urinalsTest {

    @Test
    void goodString() {
        urinals testObj = new urinals();
        System.out.println("====== Subham Kumar == TEST ONE EXECUTED ======");
        assertEquals(true, testObj.goodString("0101"));
        assertEquals(false, testObj.goodString("0110"));
    }

    @Test
    void countFreeUrinals() {
        urinals testObj = new urinals();
        System.out.println("====== Subham Kumar == TEST TWO EXECUTED ======");
        assertEquals(1, testObj.countFreeUrinals("0100"));
    }
}