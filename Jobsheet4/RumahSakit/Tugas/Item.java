package Jobsheet4.RumahSakit.Tugas;

public class Item {
    private String itemId;
    private String itemName;
    private int statBonus;

    public Item(String itemId, String itemName, int statBonus) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.statBonus = statBonus;
    }

    public String getDetails() {
        return itemId + " " + itemName + " " + statBonus;
    }

    public void applyItem(Player player) {
        System.out.print("Item " + itemName + " applied to player ");
        player.setLevel(player.getLevel() + statBonus);
    }

}
