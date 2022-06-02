package vorlesung1.cow;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CowSayTest {
    CowSay sut;

    @BeforeEach
    void setUp() {
        sut = new CowSay();
    }

    @Test
    void testSayCow() {
        var expected = """
                 _____________
                < Java rocks! >
                 -------------
                       \\   ^__^
                        \\  (oo)\\_______
                           (__)\\       )\\/\\
                               ||----w |
                               ||     ||
                """;
        assertEquals(expected, sut.say("Java rocks!"));
    }

    @Test
    void testMakeLabel() {
        var expected = """
                 _____________
                < Java rocks! >
                 -------------""";
        assertEquals(expected, sut.makeLabel("Java rocks!"));
        expected =
                """
                 _____
                < Eis >
                 -----""";
        assertEquals(expected, sut.makeLabel("Eis"));
    }
}