package com.gildedrose;

public class Sulfuras extends inventoryItem {
    public static final String NAME = "Sulfuras, Hand of Ragnaros";

    public Sulfuras(Item item) {
        super(item);
    }

    @Override
    protected void updateExpiration() {
        // do nothing
    }

    @Override
    protected void updateQuality() {
        // do nothing
    }

    @Override
    protected void processExpired() {
        // do nothing;
    }
}
