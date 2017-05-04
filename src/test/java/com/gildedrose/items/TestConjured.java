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
    public void testQualityAfter2Days(){
        for (int i = 0; i < 2; i++){app.updateQuality();}
        assertEquals(16, app.getItems()[0].quality);
        
    }
    
    @Test
    public void testQualityAfter6Days(){
        for (int i = 0; i < 6; i++){app.updateQuality();}
        assertEquals(8, app.getItems()[0].quality);
    }
    
    @Test
    public void testQualityWhenSellInIsZero(){
        for (int i = 0; i < 7; i++){app.updateQuality();}
        assertEquals(0, app.getItems()[0].quality);
    }
    
}
