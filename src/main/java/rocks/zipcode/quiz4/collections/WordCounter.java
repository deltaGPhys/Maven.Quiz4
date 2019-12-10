package rocks.zipcode.quiz4.collections;

import java.util.HashMap;
import java.util.Map;

public class WordCounter {

    private String[] text;

    public WordCounter(String... strings) {
        this.text = strings;
    }

    public Map<String, Integer> getWordCountMap() {
        HashMap<String,Integer> map = new HashMap<>();
        for (String string: text) {
            map.compute(string, (k, v) -> (v == null) ? 1 : v+1);
        }
        return map;
    }
}
