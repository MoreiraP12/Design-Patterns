package commandTest;

import command.StringDrink;
import command.StringReplacer;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class StringReplacerTest {
    @Test
    public void stringReplacer() {
        StringDrink drink = new StringDrink("ABCDABCD");
        StringReplacer sr = new StringReplacer('A', 'X');
        sr.execute(drink);
        assertEquals("XBCDXBCD", drink.getText());
    }
}
