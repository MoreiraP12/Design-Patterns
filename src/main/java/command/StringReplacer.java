package command;

public class StringReplacer implements StringTransformer{
    private char toReplace,replacer;
    public StringReplacer(char toReplace,char replacer){
        this.toReplace = toReplace;
        this.replacer = replacer;

    }
    public void execute(StringDrink drink) {
        int len = drink.getText().length();
        StringBuffer strBuffer = new StringBuffer(len);
        for(int i=0;i<len;i++){
            char ch = drink.getText().charAt(i);
            if(ch == toReplace){
                ch = replacer;
            }
            strBuffer.append(ch);
        }

        drink.setText(strBuffer.toString());
    }
}
