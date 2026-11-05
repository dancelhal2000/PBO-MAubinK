package Jobsheet9.elektronik;

public class TV extends AlatElektronik implements Audible {
    public String jenisLayar;
    public int volume;

    public String getInfo() {
        return "Merk : " + merk + "\nWarna : " + warna + "\nHarga : " + harga + "\nJenis Layar : " + jenisLayar;
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

