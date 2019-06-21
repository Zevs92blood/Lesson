package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TochkaTest {
    @Test
    public void testDistans1(){
        Tochka d1 = new Tochka(0, 0,3,4);


        Assert.assertEquals(d1.rastoyanie(), 5.0);


    }
    @Test
    public void testDistans2(){
        Tochka d2 = new Tochka(0, 0,-3,-4);
        Assert.assertEquals(d2.rastoyanie(), 5.0);
    }
    @Test
    public void testDistans3(){
        Tochka d3 = new Tochka(3, 4,0,0);
        Assert.assertEquals(d3.rastoyanie(), 5.0);
    }
    @Test
    public void testDistans4(){
        Tochka d4 = new Tochka(-3, -4,0,0);
        Assert.assertEquals(d4.rastoyanie(), 5.0);
    }
    @Test
    public void testDistans5(){
        Tochka d5 = new Tochka(-5, 5,-8,1);
        Assert.assertEquals(d5.rastoyanie(), 5.0);
    }
}
