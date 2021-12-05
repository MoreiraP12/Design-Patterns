package command;

public class StringCaseChanger implements StringTransformer {
    public StringCaseChanger(){

    }
    public void execute(StringDrink drink) {
        int len = drink.getText().length();
        StringBuffer strBuffer = new StringBuffer(len);
        for(int i=0;i<len;i++){
            char ch = drink.getText().charAt(i);
            if(Character.isLowerCase(ch)){
                ch = Character.toUpperCase(ch);
            }
            else{
                ch = Character.toLowerCase(ch);
            }
            strBuffer.append(ch);
        }

        drink.setText(strBuffer.toString());

    }
}
