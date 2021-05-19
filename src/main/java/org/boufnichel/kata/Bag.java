package org.boufnichel.kata;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Bag {

    private static final String ITEM_SEPARATOR = "#";

    private List<Item> items;

    public Bag(String s) {
        items = new ArrayList<>();
        createItemsFrom(s);
    }

    public double calculate() {
        return items.stream().map(item -> item.getQuantity() * item.getPrice()).reduce(0, Integer::sum);
    }

    private void createItemsFrom(String token) {
        String[] itemTokens = token.split(ITEM_SEPARATOR);
        Arrays.stream(itemTokens).forEach(itemToken -> {
            Item item = ItemFactory.createItemFrom(itemToken);
            items.add(item);
        });
    }
}
