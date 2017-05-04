package com.gildedrose.items;


import com.gildedrose.GildedRose;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestAgedBrie{

    GildedRose app;
    
    @Before
    public void setUp(){
        Item[] items = new Item[] { new AgedBrie("AgedBrie", 6, 20) };
        app = new GildedRose(items);
    }

    @Test
    public void testQualityAfterTwoAndSixDays(){
        for (int i = 0; i < 2; i++){app.updateQuality();}
        assertEquals(22, app.getItems()[0].quality);        
    }
    
    @Test
    public void testQualityAfterSixDays(){
        for (int i = 0; i < 6; i++){app.updateQuality();}
        assertEquals(26, app.getItems()[0].quality);
    }
    
    @Test
    public void testQualityWhenSellInIsZero(){
        for (int i = 0; i < 7; i++){app.updateQuality();}
        assertEquals(0, app.getItems()[0].quality);
    }
    
}
