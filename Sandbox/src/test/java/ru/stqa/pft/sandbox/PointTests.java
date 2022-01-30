package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTests {
    @Test
    public void testPoint(){
        Point p1 = new Point(2,3);
        Point p2 = new Point(5,7);
        Assert.assertEquals(p2.distance(p1), 5);
    }

    @Test
    public void  testPoint2(){
        Point p3 = new Point(4,6);
        Point p4 = new Point(-2,-6);
        Assert.assertEquals(p3.distance(p4),13.416407864998739);
    }
}
