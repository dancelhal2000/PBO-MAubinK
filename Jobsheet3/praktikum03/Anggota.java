package Jobsheet3.praktikum03;

public class Anggota {
    private String idKTP;
    private String nama;
    private int limitPinjam;
    private int jmlPinjam = 0;
    private int limitAngsur = 10;

    public Anggota(String idKTP, String nama, int limitPinjam){
        this.idKTP = idKTP;
        this.nama = nama;
        this.limitPinjam = limitPinjam;
    }
    
    public String getNama(){
        return nama;
    }

    public int getLimitPinjaman() {
        return limitPinjam;
    }

    public int getJumlahPinjaman() {
        return jmlPinjam;
    }

    public void pinjam(int jumlah) {
        if ((jumlah + jmlPinjam) <= limitPinjam) {
            this.jmlPinjam += jumlah;
        } else {
            System.out.println("Maaf, Jumlah pinjaman melebihi limit");
        }
    }

    public void angsur(int jumlah) {
        if (jumlah >= (jmlPinjam * limitAngsur) / 100) {
            this.jmlPinjam -= jumlah;
        } else {
            System.out.println("Maaf, angsuran harus 10% dari jumlah pinjaman");
        }
    }
}