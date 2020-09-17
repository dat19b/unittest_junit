package dk.clbo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator c;

    @BeforeEach
    void setUp() {
        c = new Calculator();
    }

    @Test
    void add() {
       assertEquals(10, c.add(5, 5));
       assertEquals(1, c.add(1,0));
    }

    @Test
    void sub(){
        assertEquals(10, c.sub(11, 1));
    }

}