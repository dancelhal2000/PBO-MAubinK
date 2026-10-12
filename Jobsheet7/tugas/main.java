package Jobsheet7.tugas;

public class main {
    public static void main(String[] args) {
        mobil mobil1 = new mobil("Toyota", "2022", "Merah", 50, 4);
        mobil1.bukaBagasi();
        mobil1.servis();
        mobil1.isiBensin(10);
        System.out.println(mobil1.getAllInfo());

        System.out.println("\n");

        motor motor1 = new motor("Honda", "2022", "Merah", 10, "Sport");
        motor1.angkatStand();
        motor1.servis();
        motor1.isiBensin(5);
        System.out.println(motor1.getAllInfo());
    }
}
