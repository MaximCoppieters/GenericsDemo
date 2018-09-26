package be.pxl.methods;

import be.pxl.methods.items.SmallItem;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * Zal een type objecten houden die overerft van de SmallItem klasse
 */
public class Jar<T extends SmallItem> {
    private List<T> objects;

    public Jar() {
        objects = new ArrayList<>();
    }

    void emptyJar() {
        objects = new ArrayList<>(); //garbage collection
    }

    void addObject(T object) {
        objects.add(object);
    }
}
