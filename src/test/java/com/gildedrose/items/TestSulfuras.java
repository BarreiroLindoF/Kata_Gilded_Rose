package com.gildedrose.items;


import com.gildedrose.GildedRose;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestSulfuras {
    
    GildedRose app;
    
    @Before
    public void setUp(){
        Item[] items = new Item[] { new Sulfuras("Sulfuras", 6, 20) };
        app = new GildedRose(items);
    }

    @Test
    public void testQualityAfterTenDays(){
        for(int i = 0; i < 10; i++){app.updateQuality();}
        assertEquals(20, app.getItems()[0].quality);
    }
    
}
