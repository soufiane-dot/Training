package org.boufnichel.kata;

import org.junit.platform.commons.util.StringUtils;

public final class ItemFactory {

    private static final String ATTRIBUTE_SEPARATOR = ":";
    private static final int NAME_INDEX = 0;
    private static final int QUANTITY_INDEX = 1;
    private static final int PRICE_INDEX = 2;
    private static final int DEFAULT_QUANTITY_VALUE = 1;

    public static Item createItemFrom(String splittedToken) {

        String[] itemAttribute = splittedToken.split(ATTRIBUTE_SEPARATOR);

        return StringUtils.isNotBlank(itemAttribute[QUANTITY_INDEX]) ?
            Item.builder().name(itemAttribute[NAME_INDEX]).price(Integer.valueOf(itemAttribute[PRICE_INDEX]))

                .quantity(Integer.valueOf(itemAttribute[QUANTITY_INDEX])).build() :
            Item.builder().name(itemAttribute[NAME_INDEX]).price(Integer.valueOf(itemAttribute[PRICE_INDEX])).quantity(DEFAULT_QUANTITY_VALUE)
                .build();
    }
}
