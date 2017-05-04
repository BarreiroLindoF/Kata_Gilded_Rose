package com.gildedrose;

import com.gildedrose.items.Item;

public class GildedRose {
    private Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }
    
    public void updateQuality() {
        for (Item i : items){
            i.updateQuality();
        }        
    }
    
    public Item[] getItems(){return items;}
    
}