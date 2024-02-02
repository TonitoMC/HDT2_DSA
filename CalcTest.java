import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalcTest {

    @org.junit.jupiter.api.Test
    void postfix() {
        Calc calc = new Calc();
        assertEquals(3, calc.postfix("2 1 - 1 / 2 * 1 +") );
    }
}