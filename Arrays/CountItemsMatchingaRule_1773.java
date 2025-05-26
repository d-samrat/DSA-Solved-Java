import java.util.List;

public class CountItemsMatchingaRule_1773 {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int match = 0;
        for(int i=0;i<items.size();i++){
            if(items.get(i).get(0).equals(ruleValue)&&ruleKey.equals("type"))match++;
            if(items.get(i).get(1).equals(ruleValue)&&ruleKey.equals("color"))match++;
            if(items.get(i).get(2).equals(ruleValue)&&ruleKey.equals("name"))match++;
        }
        return match;
    }
}
