package com.gildedrose;

public class ItemFactory {

    public static InventoryItem getInventoryItem(Item item) {
        if (item.name.equals(AgedBrie.NAME)) {
            return new AgedBrie(item);
        } else if (item.name.equals(BackstagePasses.NAME)) {
            return new BackstagePasses(item);
        } else if (item.name.equals(Sulfuras.NAME)) {
            return new Sulfuras(item);
        } else if (item.name.equals(Conjured.NAME)) {
            return new Conjured(item);
        } else
            return new InventoryItem(item);
    }

}
