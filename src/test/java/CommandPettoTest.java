package test.java;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Created by U6043820 on 1/12/2017.
 */
class CommandPettoTest {

    @Test
    @DisplayName("BlankTest")
    void blankTest() {
        System.out.println("blankTest");
        assertEquals(2, 1+1);
    }

    @Test
    void onCommandTest() {
        System.out.println("onCommandTest");
        assertTrue(true);
    }

}