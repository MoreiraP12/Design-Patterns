package command;

public interface Clients extends BarObserver {
    void wants(StringDrink drink, StringRecipe recipe, StringBar bar);
}
