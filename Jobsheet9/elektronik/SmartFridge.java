package Jobsheet9.elektronik;

public class SmartFridge extends Kulkas implements Audible {
    public int volume;
    public String ukuranLayar;

    public String getInfo() {
        return "Merk : " + merk + "\nWarna : " + warna + "\nHarga : " + harga + "\nJumlah Pintu : " + jumlahPintu + "\nUkuran Layar : " + ukuranLayar;
    }

    @Override
    public void naikkanVolume() {
        this.volume++;
    }

    @Override
    public void turunkanVolume() {
        if (this.volume > 0) {
            this.volume--;
        }
    }
}

