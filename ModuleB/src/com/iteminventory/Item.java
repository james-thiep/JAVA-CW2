

// File: com/iteminventory/item/Item.java
package com.iteminventory.item;

        public class Item {
        private String itemName;
        private double price;

        public Item(String itemName, double price) {
        this.itemName = itemName;
        this.price = price;
        }

        public String getItemName() {
        return itemName;
        }

        public double getPrice() {
        return price;
        }

        @Override
        public String toString() {
        return "Item{" +
        "itemName='" + itemName + '\'' +
        ", price=" + price +
        '}';
        }
        }
