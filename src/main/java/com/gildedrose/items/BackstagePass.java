package com.gildedrose.items;

public class BackstagePass extends Item {
    
    private static final int qualityDefault = 1, qualityUnder11 = 2, qualityUnder6 = 3;

    public BackstagePass(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateQuality() {
        if (sellIn < 6){
            if (quality < 50){
                updateThisQuality(qualityUnder6);
            }
        } else if (sellIn < 11){
            if (quality < 50){
                updateThisQuality(qualityUnder11);
            }
        } else if (sellIn < 0){
            quality = 0;
        } else {
            updateThisQuality(qualityDefault);
        }
        sellIn--;
    }
    
    private void updateThisQuality(int increment){
        quality += increment;
        checkQuality();
    }
    

}
