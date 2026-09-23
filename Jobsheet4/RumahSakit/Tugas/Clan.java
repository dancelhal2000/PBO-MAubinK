package Jobsheet4.RumahSakit.Tugas;

import java.util.ArrayList;

public class Clan {
    private String clanName;
    private ArrayList<Player> members;

    public Clan(String clanName) {
        this.clanName = clanName;
        this.members = new ArrayList<>();
    }

    public void addMember(Player player) {
        System.out.print("Current Player added to clan " + clanName + "\n");
        members.add(player);
    }

    public int getMemberCount() {
        return members.size();
    }
}
