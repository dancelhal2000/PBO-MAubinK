package Jobsheet8.tugas;

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

    @Override
    public void servis() {
        System.out.println("Servis Mobil. Cek oli mesin, ganti filter AC, dan kuras minyak rem.");
    }

    public void bukaBagasi() {
        System.out.println("Bagasi mobil dibuka");
    }

}