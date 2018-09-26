package be.pxl.methods;

import be.pxl.methods.items.Item;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * Zal objecten houden van een type dat overerft van de Item klasse
 */
public class Market<T extends Item> {
    Map<T, Double> itemByPrice;

    public Market() {
        itemByPrice = new HashMap<>();
    }

    public void addItemWithPrice(T item, double price) {
        itemByPrice.put(item, price);
    }

    public double getPriceOfItem(T item) {
        return itemByPrice.get(item);
    }
}
