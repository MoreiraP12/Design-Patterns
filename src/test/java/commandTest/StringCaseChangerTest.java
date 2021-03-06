package commandTest;

import command.StringCaseChanger;
import command.StringDrink;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class StringCaseChangerTest {
    @Test
    public void stringCaseChanger() {
        StringDrink drink = new StringDrink("aBcD");
        StringCaseChanger cc = new StringCaseChanger();
        cc.execute(drink);
        assertEquals("AbCd", drink.getText());
    }
}
