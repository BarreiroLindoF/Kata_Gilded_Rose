package com.gildedrose.items;


import com.gildedrose.GildedRose;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestConjured {
    
    GildedRose app;
    
    @Before
    public void setUp(){
        Item[] items = new Item[] { new Conjured("Conjured", 6, 20) };
        app = new GildedRose(items);
    }

    @Test
    public void testQualityAfterTwoAndSixDays(){
        for (int i = 0; i < 2; i++){app.updateQuality();}
        assertEquals(16, app.getItems()[0].quality);
        for (int i = 0; i < 4; i++){app.updateQuality();}
        assertEquals(8, app.getItems()[0].quality);
        app.updateQuality();
        assertEquals(0, app.getItems()[0].quality);
    }
    
}
