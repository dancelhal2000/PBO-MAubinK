package Jobsheet7.tugas;

public class mobil extends kendaraan {
    private int jumlahpintu;

    public mobil(String merk, String tahun, String warna, int totalbensin, int jumlahpintu) {
        super(merk, tahun, warna, totalbensin);
        this.jumlahpintu = jumlahpintu;
    }

    public mobil() {
        System.out.println("Ini constructor class mobil");
    }

    public String getInfo() {
        return "\nJumlah Pintu : " + jumlahpintu;
    }

    public String getAllInfo() {
        String info = super.getInfo();
        info += this.getInfo();
        return info;
    }

    public void bukaBagasi() {
        System.out.println("Bagasi mobil dibuka");
    }

}