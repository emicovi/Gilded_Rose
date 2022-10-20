package com.gildedrose;

public class inventoryItem {
    protected   Item item;

    public inventoryItem(Item item) {
        this.item = item;
    }

    public static inventoryItem create(Item item) {
        if(item.getName().equals(AgedBrie.NAME)) {
            return new AgedBrie(item);
        }
        if(item.getName().equals(BackstagePasses.NAME)) {
            return new BackstagePasses(item);
        }
        if(item.getName().equals(Sulfuras.NAME)) {
            return new Sulfuras(item);
        }
        if(item.getName().equals(Conjured.NAME)) {
            return new Conjured(item);
        }
        return new inventoryItem(item);
    }

    public void dailyUpdate() {
        updateQuality();
        updateExpiration();
        if (isExpired()) {
            processExpired();
        }
    }

    protected void updateExpiration() {
        item.sellIn--;
    }

    protected void updateQuality() {
            decreaseQuality();

    }

    protected boolean isExpired() {
        return item.sellIn < 0;
    }

    protected void processExpired() {
        decreaseQuality();
    }


    protected void increaseQuality() {
        if (item.quality < 50) {
            item.quality++;
        }
    }

    protected void decreaseQuality() {
        if (item.quality > 0) {
            item.quality--;
        }
    }
}
