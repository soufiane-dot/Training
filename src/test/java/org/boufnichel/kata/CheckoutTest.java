
package org.boufnichel.kata;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CheckoutTest {

    @Test
    @DisplayName("Init bag")
    void test_simple_item() {
        Bag bag = new Bag("Cornflex::50#Milka::10");
        assertEquals(60, bag.calculate());
    }

    @Test
    @DisplayName("Quantity")
    void test_simple_item_quantity() {
        Bag bag = new Bag("Cornflex:2:50#Milka:1:10");
        assertEquals(110, bag.calculate());
    }

    @Test
    @DisplayName("Tva")
    void test_tva() {
        Bag bag = new Bag("Cornflex:2:50#Milka:1:10#TVA:20");
        assertEquals(132, bag.calculate());
    }
}
