package pl.jUnit.test;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class VectorTest {

    private final double EPS = 1e-9;
    private static Vector v1;

    @BeforeClass
    public static void createNewVector(){
        v1 = new Vector();
    }
    @Test
    public void newVectorShouldNotHaveZeroLength(){

        Assert.assertEquals(0, v1.calculateVectorLength(), EPS);
    }

    @Test
    public void newVectorShouldHaveZeroX(){

        Assert.assertEquals(0, v1.getX(), EPS);
    }

    @Test
    public void newVectorShouldHaveZeroY(){

        Assert.assertEquals(0, v1.getY(), EPS);
    }

}
