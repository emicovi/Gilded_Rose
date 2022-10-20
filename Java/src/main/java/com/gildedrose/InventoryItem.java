package com.gildedrose;

public abstract class InventoryItem {
    private final Item item;

    public Item getItem() {
        return item;
    }

    protected InventoryItem(Item item) {
        this.item = item;
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
