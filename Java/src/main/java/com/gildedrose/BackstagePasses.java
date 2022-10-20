package com.gildedrose;

public class BackstagePasses extends InventoryItem {
    public static final String NAME = "Backstage passes to a TAFKAL80ETC concert";

    public BackstagePasses(Item item) {
        super(item);
    }

    @Override
    protected void updateQuality() {
        increaseQuality();

        if (getItem().sellIn < 11) {
            increaseQuality();
        }

        if (getItem().sellIn < 6) {
            increaseQuality();
        }
    }

    @Override
    protected void processExpired() {
        getItem().quality = 0;
    }
}
