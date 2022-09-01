import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FaktultaetTest {

    @Test
    void calculatefactorialForZero(){
        // GIVEN
        int n = 0;

        // WHEN
        int actual = Fakultaet.calculatefactorial(n);

        // THEN
        assertEquals(1, actual);

    }
    @Test
    void calculatefactorialForOne(){
        // GIVEN
        int n = 1;

        // WHEN
        int actual = Fakultaet.calculatefactorial(n);

        // THEN
        assertEquals(1, actual);

    }

    @Test
    void calculatefactorialForSix(){
        // GIVEN
        int n = 6;

        // WHEN
        int actual = Fakultaet.calculatefactorial(n);

        // THEN
        assertEquals(720, actual);

    }

    @Test
    void calculatefactorialForFour(){
        // GIVEN
        int n = 4;

        // WHEN
        int actual = Fakultaet.calculatefactorial(n);

        // THEN
        assertEquals(24, actual);

    }

    @Test
    void calculatefactorialForEight(){
        // GIVEN
        int n = 8;

        // WHEN
        int actual = Fakultaet.calculatefactorial(n);

        // THEN
        assertEquals(40320, actual);

    }

    @Test
    void calfactorialForZero(){
        // GIVEN
        int n = 0;

        // WHEN
        int actual = Fakultaet.calfactorial(n);

        // THEN
        assertEquals(1, actual);

    }
    @Test
    void calfactorialForOne(){
        // GIVEN
        int n = 1;

        // WHEN
        int actual = Fakultaet.calfactorial(n);

        // THEN
        assertEquals(1, actual);

    }

    @Test
    void calfactorialForFour(){
        // GIVEN
        int n = 4;

        // WHEN
        int actual = Fakultaet.calfactorial(n);

        // THEN
        assertEquals(24, actual);

    }

    @Test
    void calfactorialForEight(){
        // GIVEN
        int n = 8;

        // WHEN
        int actual = Fakultaet.calfactorial(n);

        // THEN
        assertEquals(40320, actual);

    }
}
