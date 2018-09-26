package be.pxl.classes;

import java.util.Map;
import java.util.TreeMap;

public class Rack<K extends Comparable<K>, V extends Loanable> {
    Map<K, V> itemsSortedByCriteria;

    public Rack() {
        itemsSortedByCriteria = new TreeMap<>();
    }

    public void addWithCriteria(K criteria, V item) {
        itemsSortedByCriteria.put(criteria, item);
    }

    public void printSortedContents() {
        for (Map.Entry<K, V> entry :  itemsSortedByCriteria.entrySet()) {
            System.out.printf("Criteria: %s, Item: %s%n", entry.getKey().toString(), entry.getValue().toString());
        }
    }
}
