package Jobsheet4.RumahSakit.Tugas;

import java.util.ArrayList;

public class Player {
    private String name;
    private int level;
    private ArrayList<Item> inventory;

    public Player(String name, int level) {
        this.name = name;
        this.level = level;
        this.inventory = new ArrayList<>();
    }

    public void addItem(Item item) {
        inventory.add(item);
        System.out.println("Item " + item.getDetails() + " added to inventory");
    }

    public void useItem(int index) {
        if (index >= 0 && index < inventory.size()) {
            Item itemToUse = inventory.get(index); // 1. Get item at index
            itemToUse.applyItem(this); // 2. Apply stat bonus to player
            System.out.println(name);
            inventory.remove(index); // 3. Remove item from list
        } else {
            System.out.println("Invalid inventory index!");
        }
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void displayInventory() {
        System.out.print(name + " Inventory: ");
        for (Item item : inventory) {
            System.out.println(item.getDetails());
        }
    }
}