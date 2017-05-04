package com.gildedrose.items;

public class Item {

    public String name;

    public int sellIn;

    public int quality;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

   @Override
    public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }

    public void updateQuality(){
        if (quality > 0){
            quality = quality - 1;
        }
        sellIn = sellIn - 1;
        checkQuality();
    }
    
    protected void checkQuality(){
        if (quality > 50){
            quality = 50;
        } 
        if(quality < 0 || sellIn < 0){
            quality = 0;
        }
    }
}
