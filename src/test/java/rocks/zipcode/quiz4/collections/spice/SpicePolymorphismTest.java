package rocks.zipcode.quiz4.collections.spice;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.quiz4.collections.culinary.Curry;
import rocks.zipcode.quiz4.collections.culinary.Ginger;
import rocks.zipcode.quiz4.collections.culinary.Pepper;
import rocks.zipcode.quiz4.collections.culinary.Spice;

/**
 * @author leon on 27/12/2018.
 */
public class SpicePolymorphismTest {
    @Test
    public void testPepperIsSpice() {
        Assert.assertTrue(new Pepper() instanceof Spice);
    }

    @Test
    public void testGingerIsSpice() {
        Assert.assertTrue(new Ginger() instanceof Spice);
    }

    @Test
    public void testCurryIsSpice() {
        Assert.assertTrue(new Curry() instanceof Spice);
    }
}
