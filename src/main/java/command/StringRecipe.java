package command;

import java.util.List;

public class StringRecipe {
    List<StringTransformer> transformers;
    public StringRecipe(List<StringTransformer> transformer){
        this.transformers = transformer;
    }
    public void mix(StringDrink drink) {
        for(int i=0;i<transformers.size();i++){
            transformers.get(i).execute(drink);
        }
    }
}
