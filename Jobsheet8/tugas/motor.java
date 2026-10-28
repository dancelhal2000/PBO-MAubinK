package Jobsheet8.tugas;

public class motor extends kendaraan {
    private String jenisstang;

    public motor(String merk, String tahun, String warna, int totalbensin, String jenisstang) {
        super(merk, tahun, warna, totalbensin);
        this.jenisstang = jenisstang;
    }

    public String getInfo() {
        return "\nJenis Stang : " + jenisstang;
    }

    public String getAllInfo() {
        String info = super.getInfo();
        info += this.getInfo();
        return info;
    }

    @Override
    public void servis() {
        System.out.println("Servis Motor. Cek oli mesin, ganti busi, dan stel rantai.");
    }

    public void angkatStand() {
        System.out.println("Stand motor diangkat");
    }

}
