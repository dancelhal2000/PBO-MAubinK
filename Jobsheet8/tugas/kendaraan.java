package Jobsheet8.tugas;

public abstract class kendaraan {
    private String merk;
    private String tahun;
    private String warna;
    private int totalbensin;

    public kendaraan(String merk, String tahun, String warna, int totalbensin) {
        this.merk = merk;
        this.tahun = tahun;
        this.warna = warna;
        this.totalbensin = totalbensin;
    }

    public kendaraan() {
        System.out.println("Ini constructor class kendaraan");
    }

    public String getInfo() {
        return "Merk : " + merk + "\nTahun : " + tahun + "\nWarna : " + warna + "\nTotal Bensin : " + totalbensin;
    }

    public abstract void servis();

    public void isiBensin(int tambahBensin) {
        this.totalbensin += tambahBensin;
    }

}
