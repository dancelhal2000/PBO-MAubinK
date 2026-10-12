package Jobsheet4.RumahSakit.Tugas;

public class main {

    public static void main(String[] args) {
        Player p1 = new Player("John", 10);
        Player p2 = new Player("Doe", 10);
        Item i1 = new Item("001", "Sword", 10);
        Item i2 = new Item("002", "Shield", 10);
        Clan c1 = new Clan("Knights");

        c1.addMember(p1);
        c1.addMember(p2);
        p1.addItem(i1);
        p1.addItem(i2);
        p1.useItem(0);
        p1.displayInventory();
        System.out.println("Level : " + p1.getLevel());
        System.out.println("Jumlah Member : " + c1.getMemberCount());

    }
}