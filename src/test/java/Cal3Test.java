import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Cal3Test {
    @Test
    @DisplayName("2 + 1 = 3")
    void addsTowNumbers() {
        Cal3 calculator = new Cal3();
        assertEquals(3,calculator.add(2,1), "2+1 should equal 3");
    }

    @Test
    @DisplayName("2 - 1 = 1")
    void subtractsTwoNumbers() {
        Cal3 calculator = new Cal3();
        assertEquals(1,calculator.subtract(2,1), "2-1 should equal 1");
    }

}