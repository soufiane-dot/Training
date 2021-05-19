package org.boufnichel.kata;

import lombok.Builder;

@Builder
public class Item {

    private String name;
    private Integer price;
    private Integer quantity;
    ;

    public Integer getPrice() {
        return price;
    }

    public Integer getQuantity() {
        return quantity;
    }
}
