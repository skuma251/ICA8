import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class urinalsTest {

    @Test
    void goodString() {
        urinals testObj = new urinals();
        System.out.println("====== Subham Kumar == TEST ONE EXECUTED ======");
        assertEquals(true, testObj.goodString("0101"));
        assertEquals(true, testObj.goodString("0110"));
    }
}