package Jobsheet9.tugas;

public class Helikopter implements Entitas {
private final String nama = "apache";
public int health = 200;
public int level = 10;
public int bensin = 15;

@Override 
public String getNama() {
    return nama;
}

@Override 
public boolean isHidup(int health){
    if (health == 0) {
        return false;
    } else {
        return true;
    }
}

@Override 
public void attack(int attack){
    this.health = this.health - attack;
    System.out.println("helikopter terserang. health sekarang: " + this.health);
}

@Override 
public void heal(int heal){
    this.health = this.health + heal;
    System.out.println("helikopter memperbaiki. health sekarang: " + this.health);
    }

public void isiBensin (int amount){
    this.bensin = this.bensin + amount;
    System.out.println("bensin terisi sebanyak " + amount);
}
}
