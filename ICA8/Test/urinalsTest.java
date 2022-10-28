import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class urinalsTest {

    @Test
    void goodString() {
        urinals testObj = new urinals();
        System.out.println("====== Subham Kumar == TEST ONE EXECUTED for input String======");
        assertEquals(true, testObj.goodString("0101"));
        System.out.println("====== Subham Kumar == TEST TWO EXECUTED for input String ======");
        assertEquals(false, testObj.goodString("0110"));
    }

    @Test
    void countFreeUrinals() {
        urinals testObj = new urinals();
        System.out.println("====== Subham Kumar == TEST ONE EXECUTED for counting Free Urinals======");
        assertEquals(1, testObj.countFreeUrinals("0100"));
        System.out.println("====== Subham Kumar == TEST TWO EXECUTED for counting Free Urinals======");
        assertEquals(1, testObj.countFreeUrinals("10001"));
        System.out.println("====== Subham Kumar == TEST THREE EXECUTED for counting Free Urinals======");
        assertEquals(0, testObj.countFreeUrinals("1001"));
        System.out.println("====== Subham Kumar == TEST FOUR EXECUTED for counting Free Urinals======");
        assertEquals(3, testObj.countFreeUrinals("00000"));
        System.out.println("====== Subham Kumar == TEST FIVE EXECUTED for counting Free Urinals======");
        assertEquals(2, testObj.countFreeUrinals("0000"));
        System.out.println("====== Subham Kumar == TEST SIX EXECUTED for counting Free Urinals======");
        assertEquals(1, testObj.countFreeUrinals("01000"));
    }
}