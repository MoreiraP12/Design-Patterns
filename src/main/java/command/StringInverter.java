package command;

import command.StringDrink;

public class StringInverter implements StringTransformer {
    public StringInverter(){

    }
    public void execute(StringDrink drink) {
        char ch;
        String newS = "";
        for (int i=0; i<drink.getText().length(); i++)
        {
            ch= drink.getText().charAt(i); //extracts each character
            newS= ch+newS; //adds each character in front of the existing string
        }
        drink.setText(newS);
    }
}
