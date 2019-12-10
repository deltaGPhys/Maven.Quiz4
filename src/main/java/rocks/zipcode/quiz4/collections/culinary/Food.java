package rocks.zipcode.quiz4.collections.culinary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author leon on 27/12/2018.
 */
public class Food {

    private List<Spice> spices;

    public Food() {
        this.spices = new ArrayList<Spice>();
    }

    public List<Spice> getAllSpices() {
        return this.spices;
    }

    public <SpiceType extends Class<? extends Spice>> Map<SpiceType, Integer> getSpiceCount() {
        Map<SpiceType, Integer> map = new HashMap<SpiceType,Integer>();
        for (Spice s: this.spices) {
            Class clazz = s.getClass();
            map.compute((SpiceType) clazz, (k,v) -> (v==null) ? 1 : v+1);
        }
        return map;
    }


    public void applySpice(Spice spice) {
        this.spices.add(spice);
    }
}
