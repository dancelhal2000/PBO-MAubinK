package Jobsheet9.tugas;

public class Prajurit implements Entitas {
    private final String nama = "sniper";
    public int health = 100;
    public int level = 5;

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
    System.out.println(this.getNama() + " terserang. health sekarang: " + this.health);
}

@Override 
public void heal(int heal){
    this.health = this.health + heal;
    System.out.println(this.getNama() + " di heal. health sekarang: " + this.health);
    }

public void sprint(){
    System.out.println(getNama() + " berlari");
}

}
