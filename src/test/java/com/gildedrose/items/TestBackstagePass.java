package com.gildedrose.items;

import com.gildedrose.GildedRose;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class TestBackstagePass {
    
    
    GildedRose app;
    
    @Before
    public void setUp(){
        Item[] items = new Item[] { new BackstagePass("BackstagePass", 11, 20) };
        app = new GildedRose(items);
    }
    
    @Test
    public void TestAfter1Day(){
        app.updateQuality();
        assertEquals(21, app.getItems()[0].quality);
    }
    
    @Test
    public void TestAfter3Day(){
        for (int i = 0; i < 3; i++){app.updateQuality();}
        assertEquals(25, app.getItems()[0].quality);
    }
    
    @Test
    public void TestAfter7Day(){
        for (int i = 0; i < 7; i++){app.updateQuality();}
        assertEquals(34, app.getItems()[0].quality);
    }
    
    
}
