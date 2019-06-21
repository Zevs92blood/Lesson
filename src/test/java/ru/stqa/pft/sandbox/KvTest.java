package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class KvTest {

    @Test
    public void testArea(){
        Kvadrat s = new Kvadrat(5, "e");
        Assert.assertEquals(s.plosch(), 25.0);
    }
}
