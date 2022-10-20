package com.gildedrose;

class GildedRose {
    protected Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateInventory() {
        for (Item item : items) {
            ItemFactory.getInventoryItem(item).dailyUpdate();
        }
    }


}
