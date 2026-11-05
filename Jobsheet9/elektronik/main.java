package Jobsheet9.elektronik;

public class main {
    public static void main(String[] args) {
        Kulkas kulkas1 = new Kulkas();
        kulkas1.merk = "Samsung";
        kulkas1.harga = 2000000;
        kulkas1.warna = "Merah";

        TV tv1 = new TV();
        tv1.merk = "Samsung";
        tv1.harga = 5000000;
        tv1.warna = "Hitam";  
        tv1.jenisLayar = "OLED";

        System.out.println(kulkas1.getInfo());
        System.out.println("");
        System.out.println(tv1.getInfo());
   }
}
