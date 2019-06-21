package ru.stqa.pft.sandbox;

import org.testng.annotations.Test;

public class KvTest {

    @Test
    public void testArea(){
        Kvadrat s = new Kvadrat(5, "e");
           assert s.plosch() == 25;
    }
}
