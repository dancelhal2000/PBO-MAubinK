package Jobsheet9.tugas;

public class main {
    public static void main(String[] args) {
        Helikopter helikopter1 = new Helikopter();
        System.out.println("nama = " + helikopter1.getNama());
        
        if (helikopter1.isHidup(helikopter1.health)) {
            System.out.println(helikopter1.getNama() + " masih hidup dengan health: " + helikopter1.health);            
        } else {
            System.out.println("helikopter " + helikopter1.getNama() + " sudah mati");
        }

        helikopter1.attack(20);
        helikopter1.heal(20);
        helikopter1.isiBensin(20);

        System.out.println("");

        Prajurit prajurit1 = new Prajurit();
        System.out.println("nama = " + prajurit1.getNama());

        if (prajurit1.isHidup(prajurit1.health)) {
            System.out.println(prajurit1.getNama() + " masih hidup dengan health: " + prajurit1.health);            
        } else {
            System.out.println("prajurit " + prajurit1.getNama() + " sudah mati");
        }

        prajurit1.attack(20);
        prajurit1.heal(20);
        prajurit1.sprint();


    }
}
