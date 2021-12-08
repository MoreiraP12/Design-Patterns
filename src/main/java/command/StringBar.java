package command;

import java.util.ArrayList;

public class StringBar extends Bar{
    private boolean happy = false;
    public StringBar(){
        happy = false;
        observers = new ArrayList<>();
    }

    @Override
    public boolean isHappyHour() {
        return happy;

    }

    @Override
    public void startHappyHour() {
        happy = true;
        this.notifyObservers();

    }

    @Override
    public void endHappyHour() {
        happy = false;
        this.notifyObservers();
    }

    public void order(StringDrink drink, StringRecipe recipe){
        recipe.mix(drink);
    }
}
