package commandTest;

import command.Bar;
import org.junit.jupiter.api.Test;
import command.StringBar;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class StringBarTest {
    @Test
    public void happyHour() {
        Bar bar = new StringBar();
        assertFalse(bar.isHappyHour());
        bar.startHappyHour();
        assertTrue(bar.isHappyHour());
        bar.endHappyHour();
        assertFalse(bar.isHappyHour());
    }
}
