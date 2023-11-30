package pl.jUnit.test;


import org.junit.Assert;
import org.junit.Test;

public class VectorTest {

    @Test
    public void newVectorShouldNotHaveZeroLength(){
        Vector v1 = new Vector();

        Assert.assertEquals(0, v1.calculateVectorLength(), 1e-0);
    }

    @Test
    public void newVectorShouldHaveZeroX(){
        Vector v1 = new Vector();

        Assert.assertEquals(0, v1.getX(), 1e-0);
    }

    @Test
    public void newVectorShouldHaveZeroY(){
        Vector v1 = new Vector();

        Assert.assertEquals(0, v1.getY(), 1e-0);
    }

}
