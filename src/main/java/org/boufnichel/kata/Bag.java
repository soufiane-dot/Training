package org.boufnichel.kata;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Bag {

    private static final String ITEM_SEPARATOR = "#";
    private static final String ATTRIBUTE_SEPARATOR = "::";

    private List<Item> items;

    public Bag(String s) {
        items = new ArrayList<>();
        createItemsFrom(s);
    }

    public double calculate() {
        return items.stream().collect(Collectors.summingInt(Item::getPrice));
    }

    private void createItemsFrom(String token) {
        String[] stringItems = token.split(ITEM_SEPARATOR);
        Arrays.stream(stringItems).forEach(item -> {
            String[] itemAttribute = item.split(ATTRIBUTE_SEPARATOR);
            items.add(new Item(itemAttribute[0], Integer.valueOf(itemAttribute[1])));
        });
    }
}
