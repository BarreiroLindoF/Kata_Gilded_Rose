package com.gildedrose;

import com.gildedrose.items.Item;
import static org.junit.Assert.*;
import org.junit.Before;

import org.junit.Test;

public class GildedRoseTest {
    
    GildedRose app;
    
    @Before
    public void setUp(){
        Item[] items = new Item[] { new Item("foo", 2, 50) };
        app = new GildedRose(items);
    }

    @Test
    public void testArticleName() {
        assertEquals("foo", app.getItems()[0].name);
    }

    @Test
    public void testQualityAfterSellInIsZero(){
        for (int i = 0; i < 3; i++){app.updateQuality();}
        assertEquals(0, app.getItems()[0].quality);
    }
    
    
}
